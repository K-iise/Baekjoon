#include<iostream>
#include<string>
#include<algorithm>
#include<cmath>
#include<stack>
using namespace std;
int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    

	string str;

	while (1) {

		stack<char> s;

		getline(cin, str);

		if (str == ".") {
			break;
		}

		else {
			for (int i = 0; i < str.length(); i++)
			{
				if (str[i] == '(' || str[i] == '[') {
					s.push(str[i]);
				}
				else if (str[i] == ')') {
					if (!s.empty()) {
						if (s.top() == '(') {
							s.pop();
						}
						else
							break;
					}
					else {
						s.push(str[i]);
						break;
					}
				}
				else if (str[i] == ']') {
					if (!s.empty()) {
						if (s.top() == '[') {
							s.pop();
						}
						else
							break;
					}
					else {
						s.push(str[i]);
						break;
					}
				}
			}

			if (s.empty())
				cout << "yes\n";
			else
				cout << "no\n";
		}

		while (!s.empty()) s.pop();

	}

}


