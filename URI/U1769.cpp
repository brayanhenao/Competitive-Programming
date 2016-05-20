#include <bits/stdc++.h>
#define endl '\n'

using namespace std;

int main(){
    ios_base::sync_with_stdio(false);cin.tie(NULL);
    string linea;
    int idiz,idder,sumab1,sumab2,b1,b2;
    bool caso1,caso2,caso3,caso4;
    while(getline(cin,linea)){
            caso1=caso2=caso3=caso4=false;
            idiz=1;
            idder=9;
            sumab1=sumab2=0;
        for(int i=0;i<11;++i){
            if(linea[i]!='.'){
                sumab1+=(idiz*(linea[i]-'0'));
                sumab2+=(idder*(linea[i]-'0'));
                idder--;
                idiz++;
            }
        }
        b1=linea[12]-'0';
        b2=linea[13]-'0';
        if((b1==sumab1%11) && (b2==sumab2%11)){
            caso1=true;
        }
        if((b1==0 && sumab1%11==10) && (b2==0 && sumab2%11==10)){
            caso2=true;
        }
        if((b1==0 && sumab1%11==10) && (b2==sumab2%11)){
            caso3=true;
        }
        if((b1==sumab1%11) && (b2==0 && sumab2%11==10)){
            caso4=true;
        }

        if(caso1||caso2||caso3||caso4){
            cout<<"CPF valido"<<endl;
        }else{
            cout<<"CPF invalido"<<endl;
        }
    }
}
