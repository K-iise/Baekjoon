#include<bits/stdc++.h>
using namespace std;

int chess[302][302];
int dx[8] = {-1, -2, -2, -1, 1, 2, 2, 1};
int dy[8] = {2, 1, -1, -2, 2, 1, -1, -2};
int N;
void dfs(int x, int y, int l);
int main(){

    ios::sync_with_stdio(0);
    cin.tie(0);
    
    cin >> N;

    for (int i = 0; i < N; i++)
    {
        int l;
        pair<int, int> start;
        pair<int, int> goal;
        cin >> l;
        cin >> start.first >> start.second;
        cin >> goal.first >> goal.second;

        for (int j = 0; j < l; j++)
        {
            fill(chess[j], chess[j] + l, -1);
        }
        

        dfs(start.first, start.second, l);
        cout << chess[goal.first][goal.second] << "\n";
    }
    
}


void dfs(int x, int y, int l){
    queue<pair<int, int>> Q;
    Q.push({x, y});
    chess[x][y] = 0;

    while (!Q.empty())
    {
        auto p = Q.front(); Q.pop();

        for (int i = 0; i < 8; i++)
        {
            int px = p.first + dx[i];
            int py = p.second + dy[i];

            if(px < 0 || px >= l || py < 0 || py >= l) continue;
            if(chess[px][py] != -1) continue;

            Q.push({px, py});
            chess[px][py] = chess[p.first][p.second] + 1;
        }
        
    }
    
    
    
}