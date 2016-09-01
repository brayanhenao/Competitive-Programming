#include <bits/stdc++.h>
#define endl '\n';
using namespace std;
int main()
{
 int n;
 cout<<"PERFECTION OUTPUT\n";
 while(cin>>n){
 cout.width(5);
    if(n==0){
        break;
    }
    int sumaFactores=0;
    for(int i=1;i<=n/2;i++){
        if(n%i==0){
            sumaFactores+=i;
        }
    }
    if(sumaFactores==n){
        cout<<right<<n<<"  PERFECT\n";
    }else if(sumaFactores>n){
        cout<<right<<n<<"  ABUNDANT\n";
    }else{
        cout<<right<<n<<"  DEFICIENT\n";
    }
 }
    cout<<"END OF OUTPUT"<<endl;
 return 0;
}
