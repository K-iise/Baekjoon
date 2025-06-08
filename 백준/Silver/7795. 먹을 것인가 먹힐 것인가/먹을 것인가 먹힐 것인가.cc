#include<bits/stdc++.h>
using namespace std;

bool compare(int a, int b){
    return a > b;
}

int main(){
    int T;

    cin >> T;

    for (int i = 0; i < T; i++)
    {
        int A, B;
        cin >> A >> B;
        int count = 0;
        vector<int> An;
        vector<int> Bn;

        for (int i = 0; i < A; i++)
        {
            int x;
            cin >> x;
            An.push_back(x);
        }
        
        for (int i = 0; i < B; i++)
        {
            int x;
            cin >> x;
            Bn.push_back(x);
        }

        sort(An.begin(), An.end(), compare);
        sort(Bn.begin(), Bn.end(), compare);

        for(int Ax : An){

            bool flag = false;
            int Bsize = Bn.size();

            for(int Bx : Bn){

                if(Ax > Bx){
                    flag = true;
                    break;
                }

                Bsize--;
            }

            if(flag) count += Bsize;

        }

        cout << count << "\n";
    }
    
}