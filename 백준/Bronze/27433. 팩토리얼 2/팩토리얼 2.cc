#include<iostream>
#include<algorithm>
using namespace std;
int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	long long int N;

	cin >> N;

	if (N == 0)
		cout << 1;
	else
	{
		long long int tmp = 1;

		for (int i = 1; i <= N; i++)
		{
			tmp *= i;
		}
		
		cout << tmp;
	}
	

	
}




