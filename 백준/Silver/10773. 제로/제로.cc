#include<iostream>
#include<algorithm>
#include<cmath>
#include<stack>
using namespace std;


int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
	stack<int> p;
	int N, result = 0;

	cin >> N;

	for (int i = 0; i < N; i++)
	{
		int tmp;
		cin >> tmp;
		if (tmp == 0)
			p.pop();
		else
			p.push(tmp);
	}

	while (!p.empty()) {
		result += p.top();
		p.pop();
	}

	cout << result;
}


