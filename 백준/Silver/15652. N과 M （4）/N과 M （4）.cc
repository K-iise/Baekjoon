#include <bits/stdc++.h>
using namespace std;

int N, M;
int arr[10];
void func(int k, int start);
int main() {
    cin >> N >> M;
    func(0, 1);
}

void func(int k, int start){
    if(k == M){
        for (int i = 0; i < k; i++)
        {
            cout << arr[i] << " ";
        }
        cout << "\n";
        return;
    }

    for (int i = start; i <= N; i++)
    {
        arr[k] = i;
        func(k+1, i);
    }
    
}