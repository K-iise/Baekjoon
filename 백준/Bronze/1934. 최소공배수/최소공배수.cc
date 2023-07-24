#include<iostream>
#include<algorithm>
#include <queue>
#include <stack>
#include <vector>
using namespace std;

int gcd(int a, int b);
int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int N, A, B;

	cin >> N;

	for (int i = 0; i < N; i++)
	{
		cin >> A >> B;

		cout << (A * B) /gcd(A, B) << "\n";
	}
	
}

int gcd(int a, int b) {
	if (a%b == 0)
		return b;
	else
		return gcd(b, a % b);
}


