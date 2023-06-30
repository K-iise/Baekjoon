#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

long long int dp[91];
int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
	int N;

	cin >> N;

	dp[1] = 1;
	dp[2] = 1;
	dp[3] = 2;

	for (int j = 4; j <= N; j++)
	{


		dp[j] = dp[j-1] + dp[j-2];

	}

	cout << dp[N];
}


