#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

long long int dp[1001];
int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
	int N;

	cin >> N;

	dp[1] = 1;
	dp[2] = 3;
	dp[3] = 5;

	for (int j = 4; j <= N; j++)
	{


		dp[j] = (dp[j - 1] + (2 * dp[j - 2])) % 10007; 
		

	}

	cout << dp[N];
}


