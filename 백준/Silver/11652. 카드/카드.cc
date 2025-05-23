#include <bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N;

    cin >> N;

    map<long long int, int> map;

    for (int i = 0; i < N; i++)
    {
        long long int tmp;
        cin >> tmp;
        map[tmp]++;
    }
    
    long long int maxcount = 0;
    long long int index = 0;

    for(auto& val : map){
        if(val.second > maxcount){
            maxcount = val.second;
            index = val.first;
        }
    }

    cout << index;
    



}