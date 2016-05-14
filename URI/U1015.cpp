#include <bits/stdc++.h>
#define endl '\n'

using namespace std;
int main(){
    ios_base::sync_with_stdio(false);cin.tie(NULL);
    double x1,y1,x2,y2;
    while(cin>>x1>>y1>>x2>>y2){
        cout<<fixed<<setprecision(4)<<sqrt(pow(x2-x1,2)+pow(y2-y1,2))<<endl;
    }
}
