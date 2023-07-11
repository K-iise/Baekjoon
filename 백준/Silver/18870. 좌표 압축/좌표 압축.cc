#include<iostream>
#include<string>
#include<algorithm>
#include <map>
#include <vector>
using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	

	int N;

	cin >> N;

	vector<int> t, s;

	//	좌표값 입력.
	for (int i = 0; i < N; i++)
	{
		int tmp;
		cin >> tmp;
		t.push_back(tmp);
		s.push_back(tmp);
	}

	
	sort(t.begin(), t.end());	// 정렬
	t.erase(unique(t.begin(), t.end()), t.end());	// 정렬 후 중복 제거.
	
	
	for (int i = 0; i < N; i++)
	{
		cout << lower_bound(t.begin(), t.end(), s[i]) - t.begin() << " ";
	}
}



