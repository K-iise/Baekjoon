#include<iostream>
#include<string>
#include<algorithm>
#include<queue>
#include <map>

using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
	int N, M;

	cin >> N;

	map<int, int> card;

	for (int i = 0; i < N; i++)
	{
		int tmp;
		cin >> tmp;
		card[tmp]++;
	}


	cin >> M;

	for (int i = 0; i < M; i++)
	{
		int tmp;
		cin >> tmp;
		cout << card[tmp] << " ";
	}
}



