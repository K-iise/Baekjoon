#include<iostream>
#include<algorithm>
using namespace std;
int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int N;

	cin >> N;

	int dp[100001];
	int* dpa = new int[N];

	for (int i = 1; i <= N; i++)
	{
		cin >> dp[i];
	}
	
	int score = dp[1];

	for (int i = 2; i <= N; i++)
	{
		dp[i] = max(dp[i - 1] + dp[i], dp[i]);
		score = max(dp[i], score);
	}

	cout << score;

	

	
}




