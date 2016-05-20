#include <bits/stdc++.h>
#include <algorithm>

using namespace std;

#define MAXN 100
#define MOD 987654321

int primos[MAXN];

//long long f(int x){
//	int c[MAXN] = {0};
//
//	for (int i = 1; i <= x; i++)
//		for (int j = i; j != 1; j /= p[j])
//			c[p[j]]++;
//
//	long long ans = 1;
//
//	for (int i = 1; i <= x; i++)
//		ans = (ans * (c[i] + 1)) % MOD;
//
//	return ans;
//}

int main(){
	primos[0] = primos[1] = 1;
	for (int i = 2; i < MAXN; i++)
		if (!primos[i]){
			primos[i] = i;
			for (int j = i; j < MAXN; j += i)
				if (!primos[j])
					primos[j] = i;
		}

	int N, K;
	while(cin>>N){
            cout<<endl;
        for(int i=0;i<60;i++){
            cout<<i<<"---"<<primos[i]<<endl;
        }
	}
//	while (scanf("%d %d", &N, &K) != EOF)
//		printf("%lld\n", (f(N) - f(K) + MOD) % MOD);
}
