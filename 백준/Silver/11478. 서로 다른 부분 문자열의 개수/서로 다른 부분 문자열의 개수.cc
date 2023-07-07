#include<iostream>
#include<string>
#include<algorithm>
#include<queue>
#include <map>

using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
	string str;

	cin >> str;

	int r = str.length();
	map<string, int> S;


	for (int i = 1; i <= r; i++)
	{
		for (int j = 0; j <= r; j++)
		{
			string tmp;
			if (i + j  <= r) {
				tmp = str.substr(j, i);
				S[tmp]++;
			}
		}
	}

	cout << S.size();
}



