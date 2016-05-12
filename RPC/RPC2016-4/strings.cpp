#include <bits/stdc++.h>
#define endl '\n'

using namespace std;
    const int MAX = int( 2e6 );
int main(){

   
    char cadena[MAX];
    int q,l,r,n;
    while(scanf("%s",cadena)==1){
           n=strlen( cadena );

    scanf("%d", &q);
        while(q--){
           scanf("%d %d",&l, &r);

           printf( "%c\n", cadena[ ((l-1)+(r-1))%n ] );
    }
	}
	return 0;

}
