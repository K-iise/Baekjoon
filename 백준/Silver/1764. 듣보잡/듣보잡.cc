#include<iostream>
#include<string>
#include<algorithm>
#include <map>

using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
	map<string, int> E;
	int N, M, count = 0;

	cin >> N >> M;

	for (int i = 0; i < N; i++)
	{
		string tmp;
		cin >> tmp;
		E[tmp]++;
	}

	for (int i = 0; i < M; i++)
	{
		string tmp;
		cin >> tmp;
		E[tmp]++;
	}

	

	for (auto it = E.begin(); it != E.end(); it++)
	{
		if (it->second == 2)
			count++;
	}

	cout << count << "\n";

	for (auto it = E.begin(); it != E.end(); it++)
	{
		if (it->second == 2)
			cout << it->first << "\n";
	}
}



