#include <bits/stdc++.h>
using namespace std;

int N , M;
int arr[10];
bool checked[10];
void func(int k);

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cin >> N >> M;
    func(0);
}

void func(int k){
    if(k == M){
        for (int i = 0; i < k; i++)
        {
            cout << arr[i] << " ";
        }
        cout << "\n";
        return;
    }

    for (int i = 1; i <= N; i++)
    {
        if(!checked[i]){

            if(k == 0){
                arr[k] = i;
                checked[i] = true;
                func(k+1);
                checked[i] = false;
            }
            
            else if(arr[k-1] < i){
                arr[k] = i;
                checked[i] = true;
                func(k+1);
                checked[i] = false;
            }
            
        }
    }
    
}