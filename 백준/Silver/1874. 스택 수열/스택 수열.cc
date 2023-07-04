#include<iostream>
#include<string>
#include<algorithm>
#include<cmath>
#include<stack>
using namespace std;
int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
	stack<int> st;

	int N, index = 0;
	string str = "";
	bool valid = true;

	cin >> N;

	st.push(index++);

	for (int i = 0; i < N; i++)
	{
		int tmp;
		cin >> tmp;
		while (st.top() < tmp) {
			st.push(index);
			index++;
			str += "+";
		}
		if (st.top() == tmp) {
			st.pop();
			str += "-";
		}
		else {
			valid = false;
		}
	}

	if (valid == true) {
		for (int i = 0; i < str.length(); i++)
		{
			cout << str[i] << "\n";
		}
	}
	else if (valid == false)
		cout << "NO\n";
	

}


