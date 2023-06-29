#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

long long int P[101];

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
	int T;

	cin >> T;

	P[1] = 1; P[2] = 1;
	P[3] = 1; P[4] = 2;

	for (int i = 0; i < T; i++)
	{
		int tmp;
		cin >> tmp;

		for (int i = 5; i <= tmp; i++)
		{
			P[i] = P[i - 3] + P[i - 2];
		}

		cout << P[tmp] << "\n";

	}

	
}


