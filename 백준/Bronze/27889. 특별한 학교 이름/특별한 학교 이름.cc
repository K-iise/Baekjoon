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

	string N;

	cin >> N;

	if (N == "NLCS")
		cout << "North London Collegiate School";
	else if (N == "BHA")
		cout << "Branksome Hall Asia";
	else if (N == "KIS")
		cout << "Korea International School";
	else if (N == "SJA")
		cout << "St. Johnsbury Academy";
}



