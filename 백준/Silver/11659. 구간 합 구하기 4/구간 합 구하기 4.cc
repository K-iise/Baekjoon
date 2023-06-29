#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

long long int P[101];

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
	int N, M;

	cin >> N >> M;

	int* p = new int[N+1];
	int* np = new int[N + 1]{ 0, };

	for (int i = 1; i <= N; i++)
	{
		
		cin >> p[i];
		if (i == 0)
			np[i] = p[i];
		else
			np[i] = np[i-1] + p[i];
		
	}

	for (int i = 0; i < M; i++)
	{
		int s, j, sum = 0;

		cin >> s >> j;

		if (s == j)
			cout << p[s] << "\n";
		else
			cout << np[j] - np[s-1] << "\n";
	}
	
}


