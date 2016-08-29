#include <bits/stdc++.h>
using namespace std;

double factorial[2520];
double error = 1e-3;

int main()
{
    int n;
    vector<int> numeros;
    while(cin>>n)
    {
        if(n==0)
        {
            break;
        }

        while(cin>>n)
        {
            if (n==0)
            {
                break;
            }
            numeros.push_back(n);
        }
        int d=0;
        for(int i=1; i<numeros.size(); i++)
        {
            int aux=numeros[i-1]-numeros[i];
            d=  __gcd(d,aux);
        }
        numeros.clear();
        cout<<abs(g)<<'\n';
    }

    return 0;
}

