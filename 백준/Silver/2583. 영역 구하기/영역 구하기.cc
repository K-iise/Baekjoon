#include <bits/stdc++.h>
using namespace std;

int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};
int Rectangle[102][102];
bool bias[102][102];
int  M, N, K;
int DFS(int x, int y);

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);

    list<int> answer;

    cin >> M >> N >> K;

    for (int i = 0; i < K; i++)
    {
        int n1, m1, n2, m2;

        cin >> n1 >> m1 >> n2 >> m2;

        for (int j = m1; j < m2; j++)
        {
            for (int k = n1; k < n2; k++)
            {
                Rectangle[j][k] = -1;
            }
            
        }      
    }

    for (int i = 0; i < M; i++)
    {
        for (int j = 0; j < N; j++)
        {
            if(!bias[i][j] && Rectangle[i][j] == 0){
                answer.push_front(DFS(i, j));
            }
        }     
    }

    answer.sort();

    cout << answer.size() << "\n";

    for (int ans : answer)
    {
        cout << ans << " ";
    }   
    
    
}

int DFS(int x, int y){
    int count = 0;

    queue<pair<int, int>> Q;
    Q.push({x, y});
    bias[x][y] = 1;
    count++;

    while (!Q.empty())
    {
        auto p = Q.front(); Q.pop();

        for (int i = 0; i < 4; i++)
        {
            int px = p.first + dx[i];
            int py = p.second + dy[i];

            if(px < 0 || px >= M || py < 0 || py >= N) continue;
            if(Rectangle[px][py] == -1 || bias[px][py] == 1) continue;
            bias[px][py] = 1;
            Q.push({px, py});
            count++;
        }
        
    }

    return count;
    
}