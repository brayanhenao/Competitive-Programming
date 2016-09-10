#include <algorithm>
#include <bits/stdc++.h>

using namespace std;

typedef long long ll;

const int MOD = int( 1e9+7 );
const int MAX = int( 1e6 +10 );


ll f[MAX];
ll in[MAX];

ll pow2(ll x, ll y)
{
    if (y == 0)
        return 1;
    ll p = pow2(x, y/2) % MOD;
    p = (p * p) % MOD;

    return (y%2 == 0)? p : (x * p) % MOD;
}

ll inverso(ll x){
	ll b = MOD-2;
	ll r = 1;

	for (; b; b /= 2){
		if (b % 2)
			r = (r * x) % MOD;
		x = (x * x) % MOD;
	}

	return r;
}

ll N, M, t1, t2;

int main(){
    f[0]=f[1]=1;
	for (int i = 1; i < MAX; i++){
       f[i] = (f[i-1] * i) % MOD;
	}
   	while(cin>>N>>M>>t1>>t2){
        ll n = M - 1;

		ll combinatoria1 = 0;
		if ((N-t1-n)>=0){
			combinatoria1 = f[N-t1+1];
			combinatoria1 = (combinatoria1 * inverso(f[M])) % MOD;
			combinatoria1 = (combinatoria1 * inverso(f[N-t1-n])) % MOD;
		}

		ll combinatoria2 = 0;
		if ((N-(t2+1)-n)>=0){
			combinatoria2 = f[N-(t2+1)+1];
			combinatoria2 = (combinatoria2 * inverso(f[M])) % MOD;
            combinatoria2 = (combinatoria2 * inverso(f[N-(t2+1)-n])) % MOD;
		}
		cout<<(combinatoria1 - combinatoria2 + MOD) % MOD<<endl;

    }
	return 0;
}
