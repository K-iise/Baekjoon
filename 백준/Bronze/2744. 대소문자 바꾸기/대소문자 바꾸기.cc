#include<iostream>
#include<algorithm>
#include <queue>
#include <stack>
#include <cmath>
using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	//97~122 a~z
	//65~90 A~Z
	string str;
	int length, i;

	cin >> str;

	length = str.length();

	for (i = 0; i < length; i++)
	{
		if (str[i] >= 97 && str[i] <= 122)
		{
			str[i] -= 32;
		}
		else if (str[i] >= 65 && str[i] <= 90)
		{
			str[i] += 32;
		}
	}

	cout << str;
}



