#include <bits/stdc++.h>
using namespace std;

int N, M;
int arr[10];
bool checked[10];
int result[10];
void func(int k);
int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);
    cin >> N >> M;
    for (int i = 0; i < N; i++)
    {
        cin >> arr[i];
    }
    sort(arr, arr+N);

    func(0);
}

void func(int k){
    if(k == M) {
        for (int i = 0; i < k; i++)
        {
            cout << result[i] << " ";
        }
        cout << "\n";
        return;
    }

    for (int i = 0; i < N; i++)
    {
        if(!checked[i]){
            checked[i] = true;
            result[k] = arr[i];
            func(k+1);
            checked[i] = false;
        }
    }
    
}