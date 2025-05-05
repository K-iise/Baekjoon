#include <bits/stdc++.h>
using namespace std;

int Rectangle[26][26];
bool bias[26][26];
int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};
int N, Rnumber = 1;
int BFS(int x, int y);
int main(){

    ios::sync_with_stdio(0);
    cin.tie(0);

    list<int> list;

    cin >> N;
    
    string line;
    for (int i = 0; i < N; i++) {
        cin >> line;
        for (int j = 0; j < N; j++) {
            Rectangle[i][j] = line[j] - '0';
        }
    }

    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            if(!bias[i][j] && Rectangle[i][j] == 1){
                list.push_front(BFS(i, j));
            }
        }
        
    }

    list.sort();

    cout << list.size() << "\n";

    for (int str : list)
    {
        cout << str << "\n";
    }
    
    
    
}

int BFS(int x, int y){

    queue<pair<int, int>> Q;
    Q.push({x, y});
    bias[x][y] = 1;
    Rectangle[x][y] = Rnumber;
    int count = 1;

    while (!Q.empty())
    {
        auto p = Q.front(); Q.pop();

        for (int i = 0; i < 4; i++)
        {
            int px = p.first + dx[i];
            int py = p.second + dy[i];

            if(px < 0 || px >= N || py < 0 || py >= N) continue;
            if(bias[px][py] == 1 || Rectangle[px][py] != 1) continue;
            Q.push({px, py});
            bias[px][py] = 1;
            Rectangle[px][py] = Rnumber;
            count++;

        }
        
    }

    Rnumber++;

    return count;
    
}