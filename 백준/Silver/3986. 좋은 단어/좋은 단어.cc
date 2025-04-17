#include <bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);
    int N, count = 0;

    cin >> N;

    for (int i = 0; i < N; i++){
        string str;
        stack<char> word;
        cin >> str;

        for(int j = 0; j < str.length(); j++){
            if(!word.empty()){
                if(word.top() == str[j])
                    word.pop();
                else
                    word.push(str[j]);
            } else{
                word.push(str[j]);
            }
        }

        if(word.empty()) count++;
    }

    cout << count;
    
    
}