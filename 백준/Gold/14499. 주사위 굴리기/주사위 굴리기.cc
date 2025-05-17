#include <bits/stdc++.h>
using namespace std;

int N, M, X, Y, K;
int maps[21][21];
int dice[4][3];
int dx[4] = {0, 0, -1, 1}; // 동, 서, 북, 남
int dy[4] = {1, -1, 0, 0}; // ``

void func(int ins);

int main() {
    cin >> N >> M >> X >> Y >> K;

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            cin >> maps[i][j];
        }
    }
    
    for (int i = 0; i < K; i++) {
        int inst;
        cin >> inst;
        func(inst - 1); // 명령어 인덱스 조정
    }
}

void func(int ins) {
    int px = X + dx[ins];
    int py = Y + dy[ins];
    
    if(px < 0 || px >= N || py < 0 || py >= M) return;

    // 좌표 이동
    X = px;
    Y = py;

    // 주사위 회전
    int tmp;
    switch (ins)
    {
        case 0: // 동쪽
            tmp = dice[1][2];
            dice[1][2] = dice[1][1];
            dice[1][1] = dice[1][0];
            dice[1][0] = dice[3][1];
            dice[3][1] = tmp;
            break;
        case 1: // 서쪽
            tmp = dice[1][0];
            dice[1][0] = dice[1][1];
            dice[1][1] = dice[1][2];
            dice[1][2] = dice[3][1];
            dice[3][1] = tmp;
            break;
        case 2: // 북쪽
            tmp = dice[0][1];
            dice[0][1] = dice[1][1];
            dice[1][1] = dice[2][1];
            dice[2][1] = dice[3][1];
            dice[3][1] = tmp;
            break;
        case 3: // 남쪽
            tmp = dice[3][1];
            dice[3][1] = dice[2][1];
            dice[2][1] = dice[1][1];
            dice[1][1] = dice[0][1];
            dice[0][1] = tmp;
            break;
        default:
            break;
    }

    // 주사위 바닥과 맵 동기화
    if (maps[X][Y] == 0) {
        maps[X][Y] = dice[3][1];
    } else {
        dice[3][1] = maps[X][Y];
        maps[X][Y] = 0;
    }

    // 주사위 윗면 출력
    cout << dice[1][1] << "\n";
}
