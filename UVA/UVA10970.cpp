#include <bits/stdc++.h> //todos los headers del standart precompilados
using namespace std;

typedef long long           ll;
typedef unsigned long long  ull;
typedef long double         lf;
typedef pair< int, int >    pii;
typedef vector< bool >      vb;
typedef vector< double >    vd;
typedef vector< ll >        vll;
typedef vector< int >       vi;
typedef vector< vi >        vvi;

const int MOD = int( 1e9+7 );
const int MAX = int( 2e6 );

#define f(i, a) for(int i = 0; i < a; i++) //
#define E 2.718281828459045
#define PI 3.141592653589793
#define fill ( a , v ) memset ( a , v , sizeof a )
#define endl '\n'

int main(){
    ios_base::sync_with_stdio(false);cin.tie(NULL);
    int N,M;

    while(cin>>N>>M){
        cout<<((N*M)-1)<<endl;
    }
    return 0;
}
