#include<bits/stdc++.h>
#include<vector>
using namespace std;
#define endl '\n'
 
int main() {
int n ;
    while(cin>>n){
        vector<vector<int> >acumulados(n,vector<int>(10,0));
 
        int nume;
        for(int i=0; i<n;i++){
            cin>>nume;
            acumulados[i][nume]++;
        }
        for(int i=0;i<10;i++){
            for(int j=1;j<=n-1;j++){
                int aux=acumulados[j-1][i];
                acumulados[j][i]+=aux;
            }
        }
        int secu; cin>>secu;
        while(secu--){
            int l,r;
            cin>>l>>r;
            int resul=0;
            for(int i=0; i<10;i++){
                if(l-2<0){
                if((acumulados[r-1][i]-0)>=1){
                    resul++;
                }
                }else{
                if((acumulados[r-1][i]-acumulados[l-2][i])>=1){
                    resul++;
                }
                }
            }
 
            cout<<resul<<endl;
        }
 
 
        }
  return 0;
 
  }