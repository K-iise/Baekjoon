#include <bits/stdc++.h>
using namespace std;

int w, h;
int dist1[1002][1002];
int dist2[1002][1002];
char miro[1002][1002];

int dx[4] = {1 , 0, -1, 0};
int dy[4] = {0, 1, 0, -1};

int main(){
    int N;
    cin >> N;

    while (N--) {
        cin >> w >> h;

        queue<pair<int, int>> FQ;
        queue<pair<int, int>> HQ;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                cin >> miro[i][j];
                dist1[i][j] = -1;
                dist2[i][j] = -1;

                if (miro[i][j] == '*') {
                    FQ.push({i, j});
                    dist1[i][j] = 0;
                }
                if (miro[i][j] == '@') {
                    HQ.push({i, j});
                    dist2[i][j] = 0;
                }
            }
        }

        // 불 BFS
        while (!FQ.empty()) {
            auto [x, y] = FQ.front(); FQ.pop();
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                if (nx < 0 || ny < 0 || nx >= h || ny >= w) continue;
                if (miro[nx][ny] == '#' || dist1[nx][ny] != -1) continue;
                dist1[nx][ny] = dist1[x][y] + 1;
                FQ.push({nx, ny});
            }
        }

        // 사람 BFS
        bool escaped = false;
        while (!HQ.empty()) {
            auto p = HQ.front(); HQ.pop();
            for (int d = 0; d < 4; d++) {
                int nx = p.first + dx[d];
                int ny = p.second + dy[d];

                if (nx < 0 || ny < 0 || nx >= h || ny >= w) {
                    cout << dist2[p.first][p.second] + 1 << "\n";
                    escaped = true;
                    break;
                }
                if (miro[nx][ny] == '#' || dist2[nx][ny] != -1) continue;
                if (dist1[nx][ny] != -1 && dist1[nx][ny] <= dist2[p.first][p.second] + 1) continue;
                dist2[nx][ny] = dist2[p.first][p.second] + 1;
                HQ.push({nx, ny});
            }
            if (escaped) break;
        }

        if (!escaped) cout << "IMPOSSIBLE\n";
    }
}
