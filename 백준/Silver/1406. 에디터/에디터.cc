#include <iostream>
#include <string>
#include <list>
using namespace std;

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);
    list<char> word;
    string str;

    cin >> str;

    for (int i = 0; i < str.length(); i++)  word.push_back(str[i]);
    
    list<char>::iterator c = word.end();

    int N;

    cin >> N;

    while(N > 0){
        char op, t;

        cin >> op;

        if(op == 'L' ){
            if( c != word.begin()) c--;
        }

        else if(op == 'D'){
            if( c != word.end()) c++;
        }

        else if(op == 'B')
        {
            if( c != word.begin() && !word.empty()) {
                c--;
                c = word.erase(c); 
            }
        }

        else {
            cin >> t;
            word.insert(c, t);
        }
        N--;
    }

    for(auto i : word){
        cout << i;
    }
}