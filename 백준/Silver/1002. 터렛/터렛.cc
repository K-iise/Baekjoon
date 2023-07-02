#include<iostream>
#include<string>
#include<stack>
#include<algorithm>
#include<cmath>
using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
	int x1, y1, r1, x2, y2, r2;
	double n, dis;

	cin >> n;
	
	for (int i = 0; i < n; i++)
	{
		cin >> x1 >> y1 >> r1 >> x2 >> y2 >> r2;

		dis = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));

		double sub = r1 > r2 ? r1 - r2 : r2 - r1;

		if (dis == 0 && r1 == r2)
			cout << -1 << "\n";
		else if (dis < r1 + r2 && sub < dis)
			cout << 2 << "\n";
		else if (dis == r1 + r2 || dis == sub)
			cout << 1 << "\n";
		else
			cout << 0 << "\n";
	}

}


