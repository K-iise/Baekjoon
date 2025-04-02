#include<iostream>
#include<stack>
using namespace std;

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N;
    cin >> N;
    stack<pair<int, int>> t;


    for(int i = 1; i <= N; i++){
        int tmp;
        cin >> tmp; // 탑 높이 입력.

        // 스택에서 현재 탑보다 낮은 탑은 제거
        while (!t.empty() && t.top().first < tmp) {
            t.pop();
        }

        // 스택이 비어 있으면 0, 아니면 스택의 top이 신호를 받는 탑
        if (t.empty()) {
            cout << "0 ";
        } else {
            cout << t.top().second << " ";
        }

        // 현재 탑을 스택에 추가 (높이, 인덱스)
        t.push({tmp, i});


    }


}