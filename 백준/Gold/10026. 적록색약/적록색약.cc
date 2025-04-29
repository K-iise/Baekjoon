#include<bits/stdc++.h>
using namespace std;

char grid[102][102];
char obgrid[102][102];

bool Abias[102][102];
bool Bbias[102][102];

int N;
int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};
int Aresult = 0, Bresult = 0;

void A_DFS(int x, int y);
void B_DFS(int x, int y);

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);


    cin >> N;

    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            cin >> grid[i][j];
            obgrid[i][j] = grid[i][j];

            if(grid[i][j] == 'G'){
                obgrid[i][j] = 'R';
            }
        }
        
    }

    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            if(Abias[i][j] == 0){
                A_DFS(i, j);
            }

            if(Bbias[i][j] == 0){
                B_DFS(i, j);
            }
        }
        
    }
    
    cout << Aresult << " " << Bresult;
    
}

void A_DFS(int x, int y){
    queue<pair<int, int>> Q;
    Q.push({x, y});
    Abias[x][y] = 1;
    Aresult++;
    while (!Q.empty())
    {
        auto p = Q.front(); Q.pop();
        for (int i = 0; i < 4; i++)
        {
            int px = p.first + dx[i];
            int py = p.second + dy[i];

            if(px < 0 || px >= N || py < 0 || py >= N) continue;
            if(Abias[px][py] != 0 || grid[px][py] != grid[p.first][p.second]) continue;
            Q.push({px, py});
            Abias[px][py] = 1;
        }
        
    }
}

void B_DFS(int x, int y){
    queue<pair<int, int>> Q;
    Q.push({x, y});
    Bbias[x][y] = 1;
    Bresult++;
    while (!Q.empty())
    {
        auto p = Q.front(); Q.pop();
        for (int i = 0; i < 4; i++)
        {
            int px = p.first + dx[i];
            int py = p.second + dy[i];

            if(px < 0 || px >= N || py < 0 || py >= N) continue;
            if(Bbias[px][py] != 0 || obgrid[px][py] != obgrid[p.first][p.second]) continue;
            Q.push({px, py});
            Bbias[px][py] = 1;
        }
        
    }
}