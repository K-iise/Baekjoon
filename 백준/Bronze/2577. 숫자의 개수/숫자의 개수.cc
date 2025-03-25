#include <iostream>
using namespace std;

int main(){

    ios::sync_with_stdio(0);
    cin.tie(0);

    int arr[10] =  {};
    int A, B, C, result;

    cin >> A >> B >> C;

    result = A * B * C;

    while(result > 0) {
        int tmp = result % 10;
        arr[tmp]++;
        result /= 10;
    }


    for(int i = 0; i < 10; i++){
        cout << arr[i] << "\n";
    }
}