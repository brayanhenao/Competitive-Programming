#include <bits/stdc++.h>
#define endl '\n'

using namespace std;
int main(){
    ios_base::sync_with_stdio(false);cin.tie(NULL);
    int a,b,c;
    while(cin>>a>>b>>c){
        cout<<max(a,max(b,c))<<" eh o maior"<<endl;
    }
}
