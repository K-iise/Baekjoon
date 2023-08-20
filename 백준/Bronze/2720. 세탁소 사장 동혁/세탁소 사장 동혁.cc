#include<iostream>
#include<algorithm>
#include<string>
#include<cmath>
using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);

	int T, C;

	cin >> T;

	for (int i = 0; i < T; i++)
	{
		int Q = 0, D = 0, N = 0, P = 0;

		cin.ignore();

		cin >> C;

		while (C != 0) {
			if (C >= 25) {
				Q += C / 25;
				C = C % 25;
			}
			else if (C >= 10) {
				D += C / 10;
				C =  C % 10;
			}
			else if (C >= 5) {
				N += C / 5;
				C =  C % 5;
			}
			else {
				P += C / 1;
				C = C % 1;
			}
		}

		cout << Q << " " << D << " " << N << " " << P << "\n";

	}
}




