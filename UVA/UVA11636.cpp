#include <bits/stdc++.h>
#define endl '\n';
using namespace std;
int main()
{
 int n,caso=1;
 while(cin>>n){
    if(n<=0){
        break;
    }
    int contador=0,copias=1;
    while(copias<n){
        copias+=copias;
        contador++;
    }
    cout<<"Case "<<caso<<": "<<contador<<endl;
    caso++;
 }
 return 0;
}
