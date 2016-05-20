#include <bits/stdc++.h>
#include <cstring>
#define endl '\n'

using namespace std;

int main(){

    int T,a,b,c,die[26];
    bool tramposo;
    string dieta,desayuno,almuerzo;
    cin>>T;cin.ignore();
        while(T--){
            tramposo=false;

            memset(die,0,sizeof die);
            getline(cin,dieta);
            getline(cin,desayuno);
            getline(cin,almuerzo);

            a=dieta.length();
            for(int i=0;i<a;++i){
                die[(dieta[i]-65)]++;
            }
            b=desayuno.length();
            for(int i=0;i<b;++i){
                die[(desayuno[i]-65)]--;
            }
            c=almuerzo.length();
            for(int i=0;i<c;++i){
                die[(almuerzo[i]-65)]--;
            }

            for(int i=0;i<26;++i){
                if(die[i]<0){
                    tramposo=true;
                }
            }

            if(tramposo){
                cout<<"CHEATER";
            }else{
                for(int i=0;i<26;++i){
                   if(die[i]>0){
                     cout<<(char)(i+65);
                   }
                }
            }
            cout<<endl;
        }
    }
