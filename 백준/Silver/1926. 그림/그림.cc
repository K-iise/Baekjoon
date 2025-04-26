#include<bits/stdc++.h>
using namespace std;
#define X first
#define Y second
int picture[500][500];
bool bis[500][500];
int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};
int n, m;
int pcount = 0, pmax = 0;
int DFS(int x, int y);
int main(void){
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> n >> m;

    for(int i = 0; i < n; i++){
        for (int j = 0; j < m; j++)
        {
            cin >> picture[i][j];
        }
        
    }

    for(int i = 0; i < n; i++){
        for (int j = 0; j < m; j++){
            if(!bis[i][j] && picture[i][j] == 1 ){
                pcount++;
                int tmp = DFS(i, j);
                tmp > pmax ? pmax = tmp : pmax;
            }
        }
    }

    cout << pcount << "\n" << pmax;
}

int DFS(int x, int y){

    int tmpcount = 0;
    queue<pair<int, int>> Q;
    bis[x][y] = 1; // 방문 표시.
    Q.push({x, y});
    tmpcount++;
    while(!Q.empty()){
        pair<int, int> p = Q.front(); Q.pop();
        for(int i = 0; i < 4; i++){
            int px = p.first + dx[i];
            int py = p.second + dy[i];

            if(px < 0 || px >= n || py < 0 || py >= m) continue;
            if(bis[px][py] == 1 || picture[px][py] != 1) continue;

            bis[px][py] = 1;
            Q.push({px, py});
            tmpcount++;
        }
    }
    return tmpcount;

}