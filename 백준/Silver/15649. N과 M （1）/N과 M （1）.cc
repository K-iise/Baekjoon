#include<iostream>
#include<string>
#include<algorithm>
#include<queue>

using namespace std;
int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
	int N, M;

	cin >> N >> M;

	int* nt = new int[N];

	for (int i = 0; i < N; i++)
	{
		nt[i] = i+1;
	}
	
	do {

		for (int i = 0; i < M; i++) {
			cout << nt[i] << " ";
		}

		cout << '\n';
		reverse(nt + M, nt + N);
	} while (next_permutation(nt, nt+N));
}



