#include<iostream>
#include<string>
#include<algorithm>
#include<queue>

using namespace std;
int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
	int N;

	queue<int> t;

	string mtr;

	cin >> N;
	
	cin.ignore();

	for (int i = 0; i < N; i++)
	{
		getline(cin, mtr);

		if (mtr == "pop") {
			if (t.empty())
				cout << -1 << "\n";
			else {
				cout << t.front() << "\n";
				t.pop();
			}
		}
		else if (mtr == "size") {
			if (!t.empty())
				cout << t.size() << "\n";
			else
				cout << 0 << "\n";
		}
		else if (mtr == "empty") {
			if (t.empty())
				cout << 1 << "\n";
			else
				cout << 0 << "\n";
		}
		else if (mtr == "front") {
			if (t.empty())
				cout << -1 << "\n";
			else
				cout << t.front() << "\n";
		}
		else if (mtr == "back") {
			if (t.empty())
				cout << -1 << "\n";
			else
				cout << t.back() << "\n";
		}
		else {
			string tmp = mtr.substr(5);
			int cnt = stoi(tmp);
			t.push(cnt);
		}
	}
}


