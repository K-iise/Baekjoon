#include<bits/stdc++.h>
using namespace std;

int N;
int number[12];
int op[4];
long long max_value = LLONG_MIN, min_value = LLONG_MAX;
void func(int k, long long current_value);
long long mop(int index, long long num1, long long num2);

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);
    cin >> N;

    for (int i = 0; i < N; i++)
    {
        cin >> number[i];
    }
    
    for (int i = 0; i < 4; i++)
    {
        cin >> op[i];
    }

    func(1, number[0]);

    cout << max_value << "\n" << min_value;

}

void func(int k, long long current_value){
    if(k == N){
        max_value = max(max_value, current_value);
        min_value = min(min_value, current_value);
        return;
    }


    for (int j = 0; j < 4; j++)
    {
        if(op[j] > 0){
            op[j]--;
            func(k+1, mop(j, current_value, number[k]));
            op[j]++;
        }
    }
        
    
    
}

long long mop(int index, long long num1, long long num2){
    if(index == 0){
        return num1 + num2;
    }
    else if(index == 1){
        return num1 - num2;
    }
    else if(index == 2){
        return num1 * num2;
    }
    else if(index == 3){
        return num1 / num2;
    }  
}
