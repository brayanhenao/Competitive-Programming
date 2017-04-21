#include <bits/stdc++.h>

using namespace std;

int main()
{
    double n;

        double totalTaxes=0;
        cin>>n;
        if(n<2000){
            cout<<"Isento"<<'\n';
        }else{
        while(n>2000){
            if(n>2000 &&n<=3000){
                totalTaxes+=((n-2000)*0.08);
                n-=(n-2000);
            }else if(n>3000 && n<=4500){
                 totalTaxes+=((n-3000)*0.18);
                n-=(n-3000);
            }else if(n>4500){
                 totalTaxes+=((n-4500)*0.28);
                n-=(n-4500);
            }

            }
            printf("R$ %.2f",totalTaxes);
            cout<<'\n';
         }

}
