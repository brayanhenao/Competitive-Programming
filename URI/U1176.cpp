#include <bits/stdc++.h>
#define endl '\n'

using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);
    vector<unsigned long long> fibonacci(61);
    fibonacci[0]=0;
    fibonacci[1]=1;
    for(int i=2;i<61;++i){
        fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
    }
    int T,N;
    while(cin>>T)
    {
        while(T--){
            cin>>N;
            cout<<"Fib("<<N<<") = "<<fibonacci[N]<<endl;
        }
    }
    return 0;
}
