#include<iostream>
#include<string>
#include<algorithm>
#include<queue>
#include <map>

using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
	int n, m, k, result=0;
	
	cin >> n >> m >> k;

	result += n; result += m; result += k;

	if (n == 60 && m == 60 && k == 60)
		cout << "Equilateral";
	else if (result == 180 && n == m || n == k || m == k)
		cout << "Isosceles";
	else if (result == 180)
		cout << "Scalene";
	else
		cout << "Error";
}



