#include<iostream>
#include<string>
#include<cctype>
#include<algorithm>
using namespace std;
string str[51];

bool compare(string a, string b){

    // A와 B의 길이가 다르면 짧은 것이 먼저 온다.
    if(a.length() != b.length()){
        return a.length() < b.length();
    }
    // 서로 길이가 같다면 A의 모든 자리수의 합과 B의 모든 자리수의
    // 합을 비교해서 작은 합을 가지는 것이 먼저온다.
    else if(a.length() == b.length()){
        int asum = 0, bsum = 0;

        for (int i = 0; i < a.length(); i++)
        {
            
            if(isdigit(a[i])) asum += a[i] - '0';
            if(isdigit(b[i])) bsum += b[i] - '0';
        }
        
        if(asum != bsum)
            return asum < bsum;
        else
            return a < b;
    }

}

int main(){

    ios::sync_with_stdio(0);
    cin.tie(0);

    int N;
    
    cin >> N;

    for (int i = 0; i < N; i++)
    {
        cin >> str[i];
    }

    sort(str, str+N, compare);

    for (int i = 0; i < N; i++)
    {
        cout << str[i] << "\n";
    }
    
    
}