#include <bits/stdc++.h>
using namespace std;
char miro[1002][1002];
int fire[1002][1002];
int dist[1002][1002];
int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};
int R, C;
int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> R >> C;
    queue<pair<int, int>> FQ;
    queue<pair<int, int>> JQ;
    for (int i = 0; i < R; i++)
    {
        for (int j = 0; j < C; j++)
        {
            cin >> miro[i][j];

            if(miro[i][j] == '.'){
                fire[i][j] = -1;
                dist[i][j] = -1;
            }
            if(miro[i][j] == 'F'){
                FQ.push({i, j});
                fire[i][j] = 0;
            }
            if(miro[i][j] == 'J'){
                JQ.push({i, j});
                dist[i][j] = 0;
            }

        }
    }

    while(!FQ.empty()){
        pair<int, int> p = FQ.front(); FQ.pop();

        for (int i = 0; i < 4; i++)
        {
            int px = p.first + dx[i];
            int py = p.second + dy[i];

            if(px < 0 || px >= R || py < 0 || py >= C) continue;
            if(fire[px][py] >= 0 || miro[px][py] == '#') continue;
            fire[px][py] = fire[p.first][p.second] + 1;
            FQ.push({px, py});
        }
    }

    while (!JQ.empty())
    {
        auto p = JQ.front(); JQ.pop();

        for (int i = 0; i < 4; i++)
        {
            int px = p.first + dx[i];
            int py = p.second + dy[i];
            
            if(px < 0 || px >= R || py < 0 || py >= C) {
                cout << dist[p.first][p.second] + 1;
                return 0;
            }
            if(dist[px][py] >= 0 || miro[px][py] == '#') continue; 
            if(fire[px][py] != -1 && dist[p.first][p.second] + 1 >= fire[px][py]) continue;
            dist[px][py] = dist[p.first][p.second] + 1;
            JQ.push({px, py});
        }
        
    }

    cout << "IMPOSSIBLE";
    
}