#include <bits/stdc++.h>

using namespace std;

int main()
{
    int p1,c1,p2,c2;
    cin>>p1>>c1>>p2>>c2;
    int res1=(p1*c1);
    int res2=(p2*c2);
    if(res1<res2){
        cout<<1<<'\n';
    }else if(res1>res2){
        cout<<-1<<'\n';
    }else{
        cout<<0<<'\n';
    }

    return 0;
}
