#include<iostream>
#include<string>
#include<algorithm>
#include<queue>
#include <map>

using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
	int N, M;

	cin >> N;

	map<string, string, greater<string>> people;

	for (int i = 0; i < N; i++)
	{
		string str1, str2;

		cin >> str1 >> str2;

		people[str1] = str2;
	}

	

	for (auto it = people.begin(); it != people.end(); it++)
	{
		if (it->second == "enter")
			cout << it->first << "\n";
	}
}



