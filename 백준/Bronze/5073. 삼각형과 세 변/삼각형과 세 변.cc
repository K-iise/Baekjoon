#include<iostream>
#include<string>
#include<algorithm>
#include <map>

using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
	while (1) {

		int n, m, k; 
		int max = 0, r = 0;

		cin >> n >> m >> k;

		n > m ? max = n : max = m;
		max > k ? max : max = k;
		
		if (max == n)
			r = m + k;
		else if (max == m)
			r = n + k;
		else
			r = n + m;

		if (n == 0 && m == 0 && k == 0)
			break;

		if (n == m && m == k)
			cout << "Equilateral\n";
		else if (max >= r)
			cout << "Invalid\n";
		else if (n == m || n == k || m == k)
			cout << "Isosceles\n";
		else if (n != m && n != k && m != k)
			cout << "Scalene\n";
		
		
		
	}
}



