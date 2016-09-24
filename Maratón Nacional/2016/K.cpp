#include <bits/stdc++.h>
#define endl '\n'
#define ii pair<int, int>
using namespace std;

struct edge
{
    int to;
    int peso;
    edge(int t, int w):to(t),peso(w) {};
    bool operator < (const edge &o) const
    {
        return to > o.to;
    }
};

typedef pair<int,int> pi;

vector<int> dijkstra(vector<int> policias,vector<vector<edge> > g)
{
    vector<int> dist(g.size(),INT_MAX);
    bool visitados[g.size()]= {false};
    priority_queue< edge > cola;
    for(int i=0; i<policias.size(); i++)
    {
        dist[policias[i]]=0;
        cola.push(edge(0,policias[i]));
    }

    while(!cola.empty())
    {
        edge actual=cola.top();
        cola.pop();
        int u=actual.peso;
        int w=actual.to;
        visitados[u]=true;

        for(int i=0; i<g[u].size(); i++)
        {
            edge aux=g[u][i];
            int v=aux.to;
            int peso=aux.peso;
            if(!visitados[v] && dist[v]>dist[u]+peso)
            {
                dist[v]=dist[u]+peso;
                cola.push(edge(dist[v],v));
            }
        }

    }
    return dist;
}

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int n,m,b,p;
    while(cin>>n>>m>>b>>p)
    {
        vector<vector<edge> > grafo(n);
        int u,v,w;
        for(int i=0; i<m; i++)
        {
            cin>>u>>v>>w;
            grafo[u].push_back(edge(v,w));
            grafo[v].push_back(edge(u,w));
        }


        bool bancos[n]= {false};
        int aux;
        for(int i=0; i<b; i++)
        {
            cin>>aux;
            bancos[aux]=true;
        }
        vector<int> auxPoli;

        for(int i=0; i<p; i++)
        {
            cin>>aux;
            auxPoli.push_back(aux);
        }
        vector<int> auxdis=dijkstra(auxPoli,grafo);

//        cout<<" ---DEBUG ---"<<endl;
//        for(int i=0;i<auxdis.size();i++){
//                if(auxdis[i]==INT_MAX){
//                    cout<<"INFINITE"<<" ";
//                }else{
//                    cout<<auxdis[i]<<" ";
//                }
//            cout<<endl;
//        }
//        cout<<" ---DEBUG ---"<<endl;

        int answ=INT_MIN;
        for(int i=0; i<n; i++)
        {
            if(bancos[i])
            {
                answ=max(answ,auxdis[i]);
            }
        }

        int nbancos=0;
        for(int i=0; i<n; i++)
        {
            if(auxdis[i]==answ && bancos[i])
            {
                nbancos++;
            }
        }

        if(answ==INT_MAX)
        {
            cout<<nbancos<<" *"<<endl;
        }
        else
        {
            cout<<nbancos<<" "<<answ<<endl;
        }
        bool primero=true;
        for(int i=0; i<n; i++)
        {
            if(auxdis[i]==answ && bancos[i])
            {
                if(!primero)
                {
                    cout<<" ";
                }
                cout<<i;
                primero=false;
            }
        }
        cout<<endl;
    }





    return 0;
}
