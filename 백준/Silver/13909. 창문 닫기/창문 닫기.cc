#include<iostream>
#include<algorithm>
#include <queue>
#include <vector>
#include <cmath>
using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int N, count = 0;

	cin >> N;

	
	for (int i = 1; i*i <= N; i++)
	{
		count++;
	}

	cout << count;
	
}



