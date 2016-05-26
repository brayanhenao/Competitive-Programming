#include <bits/stdc++.h>
#define endl '\n'

using namespace std;
int main(){
    ios_base::sync_with_stdio(false);cin.tie(NULL);
    double pi=3.141592654;
    double a,b,c,res;
    while(cin>>a>>b>>c){
        res=tan(a*pi/180.0)*b+c;
        cout<<fixed<<setprecision(2)<<res*5<<endl;
    }
}
