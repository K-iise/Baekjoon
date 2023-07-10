#include<iostream>
#include<string>
#include<algorithm>
#include <map>

using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
	map<int, int> E;
	int N, M, count = 0;

	cin >> N >> M;

	for (int i = 0; i < N; i++)
	{
		int tmp;
		cin >> tmp;
		E[tmp]++;
	}

	for (int i = 0; i < M; i++)
	{
		int tmp;
		cin >> tmp;
		E[tmp]++;
	}

	

	for (auto it = E.begin(); it != E.end(); it++)
	{
		if (it->second == 1)
			count++;
	}

	cout << count;
}



