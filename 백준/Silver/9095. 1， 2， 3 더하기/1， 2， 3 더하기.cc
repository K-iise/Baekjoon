#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

int dp[12];
int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
	int N;

	cin >> N;

	dp[1] = 1;
	dp[2] = 2;
	dp[3] = 4;

	for (int i = 0; i < N; i++)
	{
		int tmp;

		cin >> tmp;

		for (int j = 4; j <= tmp; j++)
		{
			dp[j] = dp[j - 3] + dp[j - 2] + dp[j - 1];
		}
		cout << dp[tmp] << "\n";
	}
	
}


