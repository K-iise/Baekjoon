#include<iostream>
#include<algorithm>
using namespace std;
int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	string str, copy = "";
	int count = 0;

	cin >> str;
	
	for (int i = 0; i <= str.length(); i++)
	{
		if (str[i] == 'X')
			count++;

		else if (i == str.length()) {

			if (count == 4) {
				copy += "AAAA";
				count = 0;
			}
			else if (count == 2) {
				copy += "BB";
				count = 0;
			}
			else {
				break;
			}
		}

		else {

			if (count == 4) {
				copy += "AAAA";
				copy += str[i];
				count = 0;
			}
			else if (count == 2) {
				copy += "BB";
				copy += str[i];
				count = 0;
			}
			else if (count == 0) {
				copy += str[i];
			}
			else
				break;

			count = 0;
		}

		if (count == 4) {
			copy += "AAAA";
			count = 0;
		}


	}

	if (count != 0)
		cout << -1;
	else
		cout << copy;
	

	
}




