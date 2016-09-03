#include <bits/stdc++.h>
#define endl '\n'

using namespace std;
typedef long long ll;

map<ll,int> valores;
vector<ll> coeficientes;


ll fastPow(ll a,int b,ll m){
    if(b==0)return 1;
    else if(b==1) return a;
    return a*fastPow(a,b-1,m)%m;
}

ll polinomio(int grado, ll fuerza,ll ruleta)
{
    ll suma=0;
    for(int i=grado; i>=0; i--)
    {
        ll aux=(coeficientes[i]*fastPow(fuerza,i,ruleta))%ruleta;
        suma+=aux;
        suma%=ruleta;
    }
    return suma;
}

int main()
{
    int k;
    ll n,m,aux;
    while(cin>>n>>m)
    {
        if(n==0 & m==0)
        {
            break;
        }
        cin>>k;
        coeficientes.clear();
        valores.clear();
        for(int i=0; i<=k; i++)
        {
            cin>>aux;
            coeficientes.push_back(aux);
        }
        ll aux2;
        for(int i=0;i<=m;i++){
            aux2= polinomio(k,i,n+1);
            valores[aux2]=i;
        }
        cout<<valores.size()<<endl;
    }
    return 0;
}
