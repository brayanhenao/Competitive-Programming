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

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int N,M;

    while(cin>>N>>M)
    {
        if(N==0 && M==0)
        {
            break;
        }
        int jack[N];
        int jill[M];
        for(int i=0; i<N; i++)
        {
            cin>>jack[i];
        }
        for(int i=0; i<M; i++)
        {
            cin>>jill[i];
        }
        int i=0,j=0,cont=0;
        while(i<N && j<M)
        {
            if(jack[i]==jill[j])
            {
                cont++;
                i++;
                j++;
            }
            else if(jack[i]<jill[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }

        cout<<cont<<endl;
    }
    return 0;
}
