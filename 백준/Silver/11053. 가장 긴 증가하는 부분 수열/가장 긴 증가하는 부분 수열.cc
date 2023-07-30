#include<iostream>
#include<algorithm>
using namespace std;

int dp[1001];
int srray[1001];
int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int N, length = 0;

	cin >> N;

	for (int i = 1; i <= N; i++)
	{
		cin >> srray[i];
		dp[i] = 1;
	}
	

	for (int i = 1; i <= N; i++)
	{
		for (int j = 1; j < i; j++)
		{
			if (srray[i] > srray[j]) {
				dp[i] = max(dp[j]+ 1, dp[i]);
			}
		}
		
	}

	for (int i = 1; i <= N; i++)
	{
		length = max(length, dp[i]);
	}

	cout << length;
}




