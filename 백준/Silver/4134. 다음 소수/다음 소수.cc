#include<iostream>
#include<string>
#include<algorithm>
#include <queue>
#include <vector>
#include <cmath>
using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	long long int N;

	cin >> N;

	for (int i = 0; i < N; i++)
	{
		long long int tmp;
		cin >> tmp;

		double st = sqrt(tmp);

		
		if (st < 3) {
			while (1) {
				long long int count = tmp - 2;

				for (int i = 2; i < tmp; i++)
				{
					if (tmp % i == 0)
						break;
					count--;
				}

				if (count == 0) {
					cout << tmp << "\n";
					break;
				}
				tmp++;
			}
		}

		else {

			while (1) {
				long long int index = st-1;
				for (int i = 2; i <= st; i++)
				{
					if (tmp % i == 0)
						break;
					index--;
				}

				if (index == 0) {
					cout << tmp << "\n";
					break;
				}
				tmp++;
			}
		}
		
	}

}



