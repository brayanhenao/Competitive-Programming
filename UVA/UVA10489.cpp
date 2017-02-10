#include <bits/stdc++.h>
#define endl '\n'

using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int a,b,c,aux;
        cin>>a>>b;
        int r=0;
        for(int i=0;i<b;++i){
            int answ=1;
            cin>>c;
            for(int j=0;j<c;++j){
                cin>>aux;
                answ*=aux;
                answ%=a;
            }
            r+=answ;
            r%=a;
        }
        cout<<r;
    }


    return 0;
}
