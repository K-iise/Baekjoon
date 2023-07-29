#include<iostream>
#include<algorithm>
using namespace std;

int dp[501][501];
int dpa[501][501];
int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int N, M = 0;

	cin >> N;

	for (int i = 1; i <= N; i++)
	{
		for (int j = 1; j <= i; j++)
		{
			cin >> dp[i][j];
		}

	}


	for (int i = 1; i <= N; i++)
	{
		for (int j = 1; j <= i; j++)
		{
			dpa[i][j] = max(dpa[i - 1][j - 1], dpa[i - 1][j]) + dp[i][j];
		}
	}

	for (int i = 1; i <= N; i++)
	{
		M = max(M, dpa[N][i]);
	}
	cout << M;
}




