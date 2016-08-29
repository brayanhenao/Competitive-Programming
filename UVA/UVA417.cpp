#include <bits/stdc++.h>
using namespace std;

map<string,int> mapa;
string letras="abcdefghijklmnopqrstuvwxyz";

void llenarMapa()
{
    int contador=1;
    string key,aux1,aux2,aux3,aux4,aux5;

    for(int i=0; i<26; i++)
    {
        key=letras[i];
        mapa[key]=contador;
        contador++;
    }

    for(int i=0; i<26; i++)
    {
        aux1=letras[i];
        for(int j=i+1; j<26; j++)
        {
            aux2=letras[j];
            key=aux1+aux2;
            mapa[key]=contador;
            contador++;
        }
    }

    for(int i=0; i<26; i++)
    {
        aux1=letras[i];
        for(int j=i+1; j<26; j++)
        {
            aux2=letras[j];
            for(int k=j+1; k<26; k++)
            {
                aux3=letras[k];
                key=aux1+aux2+aux3;
                mapa[key]=contador;
                contador++;
            }
        }
    }

    for(int i=0; i<26; i++)
    {
        aux1=letras[i];
        for(int j=i+1; j<26; j++)
        {
            aux2=letras[j];
            for(int k=j+1; k<26; k++)
            {
                aux3=letras[k];
                for(int l=k+1; l<26; l++)
                {
                    aux4=letras[l];
                    key=aux1+aux2+aux3+aux4;
                    mapa[key]=contador;
                    contador++;
                }
            }
        }
    }

    for(int i=0; i<26; i++)
    {
        aux1=letras[i];
        for(int j=i+1; j<26; j++)
        {
            aux2=letras[j];
            for(int k=j+1; k<26; k++)
            {
                aux3=letras[k];
                for(int l=k+1; l<26; l++)
                {
                    aux4=letras[l];
                    for(int m=l+1; m<26; m++)
                    {
                        aux5=letras[m];
                        key=aux1+aux2+aux3+aux4+aux5;
                        mapa[key]=contador;
                        contador++;
                    }
                }
            }
        }
    }

}
int main()
{
    string cadena;
    llenarMapa();
    while(cin>>cadena){
        cout<<mapa[cadena]<<'\n';
    }
    return 0;
}

