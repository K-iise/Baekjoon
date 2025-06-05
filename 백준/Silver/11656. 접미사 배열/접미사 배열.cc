#include<bits/stdc++.h>
using namespace std;

bool compare(string a, string b);

int main(){
    string str;

    cin >> str;
    
    int strlen = str.length();
    string strs[strlen];

    for (int i = 0; i < strlen; i++)
    {
        string tmp = str.substr(i, strlen);
        strs[i] = tmp;
    }

    sort(strs, strs+strlen, compare);

    for (int i = 0; i < strlen; i++)
    {
        cout << strs[i] << "\n";
    }
    
    
}

bool compare(string a, string b){
    for (int i = 0; i < a.length(); i++)
    {
        if(a[i] < b[i])
            return a < b;
        else
            continue;
    }

    return a < b;
    
}