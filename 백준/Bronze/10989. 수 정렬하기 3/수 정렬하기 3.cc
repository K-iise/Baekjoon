#include<iostream>
#include<string>
#include<algorithm>
#include <map>

using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int N;

	cin >> N;

	int n[10001] = { 0 };

	for (int i = 0; i < N; i++)
	{
		int tmp;
		cin >> tmp;
		n[tmp]++;
	}

	

	for (int i = 1; i < 10001; i++)
	{
		for (int j = 0; j < n[i]; j++)
		{
			cout << i << "\n";
		}
	}
}



