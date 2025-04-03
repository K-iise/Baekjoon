#include<bits/stdc++.h>
using namespace std;

int main(){

    ios::sync_with_stdio(0);
    cin.tie(0);

    int N;
    cin >> N;
    queue<int> que;

    while(N--){
        string str;
        cin >> str;

        if(str == "push"){
            int tmp;
            cin >> tmp;
            que.push(tmp);
        }
        else if(str == "pop"){
            if(que.empty()) cout << "-1\n";
            else{
                cout << que.front() << "\n";
                que.pop();
            }
        }
        else if(str == "size"){
            cout << que.size() << "\n";
        }
        else if(str == "empty"){
            if(que.empty()) cout << "1\n";
            else cout << "0\n";
        }
        else if(str == "front"){
            if(que.empty()) cout << "-1\n";
            else cout << que.front() << "\n";
        }
        else if(str == "back"){
            if(que.empty()) cout << "-1\n";
            else cout << que.back() << "\n";
        }
    }
}