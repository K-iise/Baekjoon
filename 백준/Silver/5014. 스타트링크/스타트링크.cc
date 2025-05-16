#include <bits/stdc++.h>
using namespace std;

int link[1000002];
bool bias[1000002];
int F, S, G, U, D;
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> F >> S >> G >> U >> D;

    fill(link, link + 1000002, INT_MAX);

    queue<int> Q;

    link[S] = 0;
    bias[S] = 1;
    Q.push(S);

    while (!Q.empty())
    {
        auto p = Q.front(); Q.pop();
        
        int up = p + U;
        int down = p - D;

        if(up <= F && link[up] > link[p] + 1 && !bias[up]){
            Q.push(up);
            bias[up] = 1;
            link[up] = link[p] + 1;
        }
        if(down >= 1 && link[down] > link[p] + 1 && !bias[down]){
            Q.push(down);
            bias[down] = 1;
            link[down] = link[p] + 1;
        }
    }

    if(link[G] == INT_MAX)
        cout << "use the stairs";
    else
        cout << link[G];
    
}