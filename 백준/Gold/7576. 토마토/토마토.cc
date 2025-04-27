#include<bits/stdc++.h>
using namespace std;

int tomato[1002][1002];
int dist[1002][1002];
int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};
int N, M;
int day = 0;
bool flag = true;
void DFS(int x, int y);
int main(void){
    cin >> M >> N;
    queue<pair<int, int>> tQ;

    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < M; j++)
        {
            cin >> tomato[i][j];
            if(tomato[i][j] == 1) tQ.push({i, j});
            if(tomato[i][j] == 0) dist[i][j] = -1;
        }
    }

    while (!tQ.empty())
    {
        pair<int, int> p = tQ.front(); tQ.pop();

        for(int i = 0; i < 4; i++){
            int px = p.first + dx[i];
            int py = p.second + dy[i];

            if (px < 0 || px >= N || py < 0 || py >= M) continue;
            if(dist[px][py] >= 0) continue;
            dist[px][py] = dist[p.first][p.second] + 1;
            tQ.push({px, py});
        }
    }


    
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < M; j++)
        {
            if(dist[i][j] == -1) flag = false;

            day = max(day, dist[i][j]);
        }
    }

    if(flag) cout << day;
    else cout << -1;
    
}

