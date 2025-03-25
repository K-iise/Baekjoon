#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int arr[10] = {};
    int N, max = 0;

    cin >> N;

    while(N > 0){
        int tmp = N % 10;

        if(tmp == 6 || tmp == 9){
            arr[6] > arr[9] ? arr[9]++ : arr[6]++;
        }
        else
            arr[tmp]++;

        N /= 10;
    }

    for(int i = 0; i < 10; i++){
        if(arr[i] > max)
            max = arr[i];
    }

    cout << max;
}