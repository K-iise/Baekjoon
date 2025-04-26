#include<bits/stdc++.h>
using namespace std;

#define X first
#define Y second
int Miro[100][100];
int N, M;
int dist[100][100];

int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};

int main(void){

    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N >> M;

    for (int i = 0; i < N; i++)
    {
        string s;
        cin >> s;  // 문자열로 입력받기
        for (int j = 0; j < M; j++)
        {
            Miro[i][j] = s[j] - '0';  // 문자 '0'을 빼서 숫자로 변환
            dist[i][j] = -1;  // 거리 초기화
        }
    }
    
    dist[0][0] = 1;
    queue<pair<int, int>> Q;
    Q.push({0, 0});

    while(!Q.empty()){
        pair<int, int> p = Q.front(); Q.pop();
        for (int i = 0; i < 4; i++)
        {
            int px = p.first + dx[i];
            int py = p.second + dy[i];

            if(px < 0 || px >= N || py < 0 || py >= M) continue;
            if(dist[px][py] != -1  || Miro[px][py] != 1) continue;

            dist[px][py] = dist[p.first][p.second] + 1;
            Q.push({px, py});
        }
    
    }

    cout << dist[N-1][M-1];
}