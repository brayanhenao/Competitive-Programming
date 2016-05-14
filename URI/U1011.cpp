#include <bits/stdc++.h>
#define endl '\n'

using namespace std;
int main(){
    ios_base::sync_with_stdio(false);cin.tie(NULL);
    double r;
    double pi=3.14159;
    while(cin>>r){
        cout<<"VOLUME = "<<fixed<<setprecision(3)<<pi*r*r*r*(4.0/3)<<endl;
    }
}
