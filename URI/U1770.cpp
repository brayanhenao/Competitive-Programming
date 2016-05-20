#include <bits/stdc++.h>
#define endl '\n'

using namespace std;

typedef struct cancion{
    int duracion;
    bool escuchada;
}cancion;

cancion playlist[101];

int main(){
    ios_base::sync_with_stdio(false);cin.tie(NULL);
    int canciones_album,canciones_playlist;
    int tiempo,idcancion,escuchadas;
    while(cin>>canciones_album>>canciones_playlist){
        escuchadas=tiempo=0;
        for(int i=0;i<canciones_album;++i){
            cin>>playlist[i].duracion;
            playlist[i].escuchada=false;
        }
        for(int i=0;i<canciones_playlist;++i){
            cin>>idcancion;
            idcancion--;
            if(escuchadas<canciones_album){
                tiempo+=playlist[idcancion].duracion;
                if(!playlist[idcancion].escuchada){
                    escuchadas++;
                    playlist[idcancion].escuchada=true;
                }
            }
        }

        if(escuchadas<canciones_album){
            cout<<"-1"<<endl;
        }else{
            cout<<tiempo<<endl;
        }
    }
}
