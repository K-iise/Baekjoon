#include <iostream>
#include <stack>
using namespace std;

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);
    int N;
    string str;
    stack<int> S;

    cin >> N;

    for(int i = 0; i < N; i++){
        cin >> str;

        if(str == "push"){
            int emp;
            cin >> emp;
            S.push(emp);
        }
        else if(str == "pop"){
            if(S.empty())
                cout << -1 << "\n";
            else{
                cout << S.top() << "\n";
                S.pop();
            }
        }
        else if(str == "size"){
            cout << S.size() << "\n";
        }

        else if(str == "empty"){
            if(S.empty()) cout << "1\n";
            else cout << "0\n";
        }
        else if(str == "top"){
            if(S.empty()) cout << "-1\n";
            else cout << S.top() << "\n";
        }

    }
    

}