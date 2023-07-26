#include<iostream>
#include<algorithm>
#include <vector>
using namespace std;

bool check(int a, int b);
int number[1000001];
int s = 1000000;
int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);


	for (int i = 2; i <= s; i++)
	{
		number[i] = i;
	}

	
	for (int i = 2; i <= s; i++)
	{
		if (number[i] == 0) continue;
		
		for (int j = 2*i; j <= s; j += i)
		{
			number[j] = 0;
		}
		
	}

	int T;
	cin >> T;

	for (int i = 0; i < T; i++)
	{
		int tmp, count = 0;
		cin >> tmp;

		for (int i = 2; i < tmp; i++)
		{
			if (tmp == number[tmp-i] + number[i]) {
				count++;

				if (tmp - i == i)
					count++;
			}
			
		}

		cout << count / 2 << "\n";
	}

	

	
}




