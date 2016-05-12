#include<bits/stdc++.h>
using namespace std;

 const int MOD = int( 1e9+7 );
const int MAX = int( 1e5 +1 );

 long long f[MAX];
 long long in[MAX];

long long pow2(long long x, long long y)
{
    if (y == 0)
        return 1;
    long long p = pow2(x, y/2) % MOD;
    p = (p * p) % MOD;

    return (y%2 == 0)? p : (x * p) % MOD;
}

long long C(int n, int r)
{

return ( ( f[ n ]*in[ r ] )%MOD *in[ n-r ] )%MOD;

}

int main()
{
    f[0]=f[1]=1;
    for (int i=2; i<=MAX;i++){
        f[i]= (f[i-1]*i) % MOD;
    }
    for(int i=1;i<=MAX;++i){
        in[i]=pow2(f[i],MOD-2);
    }
    int n,r;
    while(cin>>n>>r){
        if(r==0 || r==(n-1)){
            cout<<"2"<<'\n';
        }else{
        n--;
        long long answ=C(n,r)*2;
        cout<<answ%MOD<<'\n';
        }
    }

}
