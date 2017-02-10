#include <bits/stdc++.h>

#define endl '\n'

typedef long long ll;
using namespace std;
    const int MOD = int( 1e9+7 );
    ll facto[2000];


long long pow2(long long a, int b){
    int ret=1;
    while(b){
        if(b&1) ret=ret*a%MOD;
        a=a*a%MOD;
        b>>=1;
    }
    return ret;
}


int main(){
    facto[0]=facto[1]=1;
    for(int i=2;i<2000;i++){
        facto[i]=(facto[i-1]*i)%MOD;
    }

    long long t,n,m;
    cin>>t;
    while(t--){
        cin>>n>>m;
        ll answ=(facto[n+m-1]*pow2(facto[m-1]*facto[n] %MOD,MOD-2))%MOD;
        cout<<answ<<endl;
    }
    return 0;
}
