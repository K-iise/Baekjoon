#include<iostream>
#include<algorithm>
#include<string>
#include<cmath>
using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	string N;
	int B, index = 0;
	long long int R = 0;

	cin >> N >> B;
	
	for (int i = N.length()-1; i >= 0; i--)
	{
		if (N[i] >= 'A') {
			R = R +  (N[i] - 'A' + 10) * pow(B, index);
		}
		else {
			R = R + (N[i] - '0') * pow(B, index);
		}
		index++;
	}
	cout << R;
}




