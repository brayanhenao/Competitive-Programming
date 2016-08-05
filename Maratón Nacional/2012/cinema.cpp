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

#define _ ios_base::sync_with_stdio(false);cin.tie(NULL); //optimizar la lectura y escritura usando cin y cout, no mezclar con stdin ni stdout
#define f(i, a) for(int i = 0; i < a; i++) //
#define E 2.718281828459045
#define PI 3.141592653589793
#define fill( a , c ) memset ( a , c , sizeof a )

int main(){_

    //esctructura general (La primera linea tine la cant casos de prueba)
    int R,C;
    while(cin>>R>>C){
        if(R==0 && C==0)break;
        int personas[R+1][C+1];
        int cine[R+1][C+1];
        fill(personas,0);
        fill(cine,0);
        int P;cin>>P;
        for(int i=0;i<P;i++){
            char f;cin>>f;
            int columna;cin>>columna;
            char pos;cin>>pos;
            int fila=f-'A';
            if(pos=='-'){
                personas[fila][columna-1]=1;
            }else{
                personas[fila][columna]=1;
            }
        }
        int Z;cin>>Z;
        for(int i=0;i<Z;i++){
            char f;cin>>f;
            int columna;cin>>columna;
            int fila=f-'A';
             cine[fila][columna]=1;
        }
        bool sepuede=true;

        for(int i=0;i<R;i++){
          for(int j=1;j<=C;j++){
            if(cine[i][j]==1){
                if(personas[i][j-1]==0){
                    personas[i][j-1]=1;
                }else if(personas[i][j]==0){
                    personas[i][j]=1;
                }else{
                    sepuede=false;
                    break;
                }
            }
          }
        }
        if(sepuede){
            cout<<"YES"<<endl;
        }else{
            cout<<"NO"<<endl;
        }
    }
    return 0;
}
