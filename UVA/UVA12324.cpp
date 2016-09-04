#include <bits/stdc++.h>
#define endl '\n';

using namespace std;
typedef pair<int,bool> pi;

int main()
{
    vector<pair<pi,int> >tiempos;
    vector<int> dm;
    int n;
    while(cin>>n){
        if(n==0){
            break;
        }
        int a,b;
    tiempos.clear();
    dm.clear();
    for(int i=0;i<n;i++){
        cin>>a>>b;
        tiempos.push_back(make_pair(make_pair(a,0),i));
        dm.push_back(b);
    }
    if(tiempos.size()==1){
            pair<int,bool> xd=tiempos[0].first;
        cout<<xd.first<<endl;
    }else{
        vector<pair<pi,int> > aux;
        for(int i=dm.size()-1;i>=0;i--){
            if(dm[i]!=0){
                if(i!=dm.size()-1){
                    aux.clear();
                for(int j=i+1;j<dm.size();j++){
                    aux.push_back(tiempos[j]);
                }
                sort(aux.begin(),aux.end());
                int contbolas=dm[i];
                for(int k=aux.size()-1;k>=0 && contbolas>0;k--){
                    pair<pi,int> actual= aux[k];
                    pi t=actual.first;
                    if(!t.second){
                        t.first/=2;
                        t.second=1;
                        contbolas--;
                        tiempos[actual.second]=make_pair(t,actual.second);
                    }
                }
                contbolas=0;
                }
            }
        }
        int tiempoTotal=0;
        for(int i=0;i<tiempos.size();i++){
            pi xde=tiempos[i].first;
            tiempoTotal+=xde.first;
        }
        cout<<tiempoTotal<<endl;
    }

    }
    return 0;
}
