#include <bits/stdc++.h>
using namespace std;

int maps[101][101];
bool visited[101][101];
int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};
int Hmax = 0, result = 0;
int N;
void BFS(int x, int y, int height);
int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;

    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            cin >> maps[i][j];
            Hmax = max(Hmax, maps[i][j]); // 최대 높이 구하기.
        }
    }
    
    for (int i = 1; i <= Hmax; i++)
    {

        int count = 0;

        for (int j = 0; j < 101; j++)
        {
            fill(visited[j], visited[j] + 101, false);
        }

        for (int k = 0; k < N; k++)
        {
            for (int j = 0; j < N; j++)
            {
                if(!visited[k][j] && maps[k][j] >= i){
                    BFS(k, j, i);
                    count++;
                }
            }
            
        }
        
        result = max(result, count);
    }

    cout << result << "\n";
    
}

void BFS(int x, int y, int height){
    queue<pair<int, int>> Q;
    Q.push({x, y});
    visited[x][y] = true;

    while (!Q.empty())
    {
        auto p = Q.front(); Q.pop();

        // 4 방향 탐색색
        for (int i = 0; i < 4; i++)
        {
            int px = dx[i] + p.first;
            int py = dy[i] + p.second;

            if(px < 0 || px >= N || py < 0 || py >= N) continue;
            if(visited[px][py] || maps[px][py] < height) continue;
            visited[px][py] = true;
            Q.push({px, py});
        }
        
    }
    
}