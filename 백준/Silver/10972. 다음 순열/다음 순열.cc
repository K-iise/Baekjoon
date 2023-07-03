#include<iostream>
#include<algorithm>
#include<cmath>
using namespace std;


int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
	int N;

	cin >> N;

	int* pn = new int[N];

	for (int i = 0; i < N; i++)
	{
		cin >> pn[i];
	}

	if (next_permutation(pn, pn + N)) {
		for (int i = 0; i < N; i++)
		{
			cout << pn[i] << " ";
		}
	}
	else
		cout << -1;
}


