#include <bits/stdc++.h>
using namespace std;

int  N , M;
int arr[10];
int Narr[10];

void funN(int k);

int  main(){
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N >> M;

    for (int i = 0; i < N; i++)
    {
        cin >> arr[i];
    }

    sort(arr, arr+N);

    funN(0);

}

void funN(int k){
    if(k == M){
        for (int i = 0; i < M; i++)
        {
            cout << Narr[i] << " ";
        }
        cout << "\n";
        return;
    }

    for (int i = 0; i < N; i++)
    {
        Narr[k] = arr[i];
        funN(k+1);
    }
    
}