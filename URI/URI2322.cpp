#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    int aux;
    cin>>n;
    bool check[n+1];
    memset(check,0,sizeof check);
    check[0]=true;

    for(int i=0;i<n-1;i++){
       cin>>aux;
       check[aux]=true;
    }

    for(int i=1;i<n+1;i++){
        if(!check[i]){
            cout<<i<<'\n';
            break;
        }
    }
    return 0;
}
