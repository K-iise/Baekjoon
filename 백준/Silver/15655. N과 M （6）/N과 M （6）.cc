#include <bits/stdc++.h>
using namespace std;

int N, M;
bool checked[10];
int arr[10];
int arr2[10];
void func(int k);
int main(){
    cin >> N >> M;

    for (int i = 0; i < N; i++)
    {
        cin >> arr[i];
    }
    
    sort(arr, arr+N);

    func(0);
}

void func(int k){
    if(k == M){
        for (int i = 0; i < k; i++)
        {
            cout << arr2[i] << " ";
        }
        cout << "\n";
    }

    for (int i = 0; i < N; i++)
    {
        if(!checked[i] && arr2[k-1] < arr[i]){
            checked[i] = true;
            arr2[k] = arr[i];
            func(k+1);
            checked[i] = false;
        }

        
    }
    

}