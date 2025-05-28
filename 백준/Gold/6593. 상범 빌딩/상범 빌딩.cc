#include<iostream>
#include<queue>
#include<algorithm>

using namespace std;

int L, R, C;
// L은 상범 빌딩의 층 수
// R과 C는 상범 빌딩의 한 층의 행과 영의 개수.

char build[31][31][31];
int btime[31][31][31];
int dz[6] ={0, 0, 0, 0, 1, -1};
int dx[6] = {1, 0, -1, 0, 0, 0};
int dy[6] = {0, 1, 0, -1, 0, 0};

int main(){


    while(true){


        int stL, stR, stC;  // 시작 지점
        int edL, edR, edC;  // 출구

        cin >> L >> R >> C;

        if(L == 0 && R == 0 && C == 0) break;

        // 빌딩 입력.
        for (int i = 0; i < L; i++)
        {
            for (int j = 0; j < R; j++)
            {
                for (int k = 0; k < C; k++)
                {
                    cin >> build[i][j][k];
                    if(build[i][j][k] == 'S'){
                        stL = i, stR = j, stC = k;
                    }
                    if(build[i][j][k] == 'E'){
                        edL = i, edR = j, edC = k;
                    }
                    btime[i][j][k] = -1;
                }
            }
        }

        // BFS
        queue<tuple<int, int, int>> Q; // 3쌍의 값 묶을 땐 tuple, 2개의 쌍 묶을 땐 pair
        Q.push({stL, stR, stC});
        btime[stL][stR][stC] = 0;

        while(!Q.empty()){

            auto p = Q.front(); Q.pop();

            for (int i = 0; i < 6; i++)
            {
                int pz = dz[i] + get<0>(p); // 튜플의 첫번째 원소 접근.
                int px = dx[i] + get<1>(p); // 튜플의 두번째 원소 접근.
                int py = dy[i] + get<2>(p); // 튜플의 세번째 원소 접근.

                if(pz < 0 || pz > L || px < 0 || px > R || py < 0 || py > C) continue;
                if(btime[pz][px][py] != -1  ||  build[pz][px][py] == '#') continue;

                Q.push({pz, px, py});
                btime[pz][px][py] = btime[get<0>(p)][get<1>(p)][get<2>(p)] + 1;
            }
            
            
        }

        // 출력 조건
        if(btime[edL][edR][edC] > 0)
            cout << "Escaped in " << btime[edL][edR][edC] << " minute(s).\n"; 
        else
            cout << "Trapped!\n";
    }
}