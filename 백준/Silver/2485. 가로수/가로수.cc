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

	int N, l, count = 0;
	int tree[100001];
	int distance[100001];

	cin >> N;

	for (int i = 0; i < N; i++)
	{
		cin >> tree[i];
	}
	
	for (int i = 0; i < N-1; i++)
	{
		distance[i] = tree[i + 1] - tree[i];
	}

	l = distance[0];

	for (int i = 1; i < N-1; i++)
	{
		l = gcd(l, distance[i]);
	}

	for (int i = 0; i < N - 1; i++)
	{
		count += (distance[i] / l) - 1;
	}
	
	cout << count;
}

int gcd(int a, int b) {
	if (a%b == 0)
		return b;
	else
		return gcd(b, a % b);
}


