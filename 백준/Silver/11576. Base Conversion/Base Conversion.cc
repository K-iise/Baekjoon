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

	int A, B, M, R = 0;
	stack<int> st;
	cin >> A >> B;
	cin.ignore();
	cin >> M;

	for (int i = 1; i <= M; i++)
	{
		int tmp;
		cin >> tmp;
		R = R + tmp * pow(A, M - i);
	}

	while (R != 0) {
		st.push(R % B);
		R = R / B;
	}
	
	while (!st.empty()) {
		cout << st.top() << " ";
		st.pop();
	}
}



