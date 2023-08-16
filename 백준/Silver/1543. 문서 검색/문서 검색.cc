#include<iostream>
#include<algorithm>
#include<string>
using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	string str, T;
	int count = 0;

	getline(cin, str);
	getline(cin, T);

	bool check = true;

	for (int i = 0; i < str.length(); i++)
	{
		check = true;
		for (int j = 0; j < T.length(); j++)
		{
			if (str[i + j] != T[j]) {
				check = false;
				break;
			}
		}

		if (check) {
			count++;
			i += T.length()-1;
		}
	}


	cout << count;

}




