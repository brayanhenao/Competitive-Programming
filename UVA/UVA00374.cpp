#include <bits/stdc++.h>
#define endl '\n'

using namespace std;
typedef long long ll;

ll modpow(ll x,ll y,ll p){
    ll answ=1;
    x%=p;
    while(y>0){
        if(y&1){
            answ=(answ*x)%p;
        }

        y>>=1;
        x=(x*x)%p;
    }
    return answ;
}
int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);
    ll a,b,p;
    while(cin>>a>>b>>p){
        cout<<modpow(a,b,p)<<endl;
    }
}
