#include<iostream>
#include<algorithm>
#include <vector>
using namespace std;

int number[1000001];
int s = 300000;
int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);


	for (int i = 2; i <= s; i++)
	{
		number[i] = i;
	}

	
	for (int i = 2; i <= s; i++)
	{
		if (number[i] == 0) continue;
		
		for (int j = 2*i; j <= s; j += i)
		{
			number[j] = 0;
		}
		
	}

	while (1) {

		int N, TwoN;
		int count = 0;
		
		cin >> N;

		if (N == 0)
			break;

		TwoN = 2 * N;

		for (int i = N + 1; i <= TwoN; i++)
		{
			if (number[i] != 0)
				count++;
		}

		cout << count << "\n";
	}


	
}




