#include<iostream>
#include<algorithm>
#include<string>
#include<cmath>
using namespace std;

int arr[41] = { 0, };

int cnt1 = 0, cnt2 = 0;

int fibo(int N) {
	if (N == 1 || N == 2) {
		cnt1++;
		return 1;
	}
	else return (fibo(N - 1) + fibo(N - 2));
}

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int N;

	cin >> N;

	fibo(N);

	arr[1] = arr[2] = 1;

	for (int i = 3; i <= N; i++)
	{
		arr[i] = arr[i - 1] + arr[i - 2];
		cnt2++;
	}

	cout << cnt1 << " " << cnt2;
}




