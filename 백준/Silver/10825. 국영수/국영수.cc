#include<bits/stdc++.h>
using namespace std;

int N;
int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;

    vector<tuple<int, int, int, string>> people;

    for (int i = 0; i < N; i++)
    {
        string name;
        int kor, eng, math;

        cin >> name >> kor >> eng >> math;

        people.push_back({-kor, eng, -math, name});
    }

    sort(people.begin(), people.end());

    for (int i = 0; i < N; i++)
    {
        cout << get<3>(people[i]) << "\n";
    }
    
    
}


