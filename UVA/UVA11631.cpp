#include <bits/stdc++.h>
using namespace std;

typedef long long           ll;
typedef unsigned long long  ull;
typedef long double         lf;
typedef pair< int, int >    pii;
typedef vector< bool >      vb;
typedef vector< double >    vd;
typedef vector< ll >        vll;
typedef vector< int >       vi;
typedef vector< vi >        vvi;

const int MOD = int( 1e9+7 );
const int MAX = int( 2e6 );


#define f(i, a) for(int i = 0; i < a; i++)
#define E 2.718281828459045
#define PI 3.141592653589793
#define fill ( a , v ) memset ( a , v , sizeof a )
#define endl '\n'
int N,M;
struct edge
{
    int to;
    int peso;
    edge(int t, int w):to(t),peso(w) {};
    bool operator < (const edge &o) const
    {
        return peso > o.peso;
    }
};

int prim(vector<vector<edge> > grafo)
{
    int answ=0;

    priority_queue<edge> cola;
    cola.push(edge(0,0));
    vector<int> distancias(N,INT_MAX);
    bool visitado[N]= {false};
    distancias[0]=0;
    while(!cola.empty())
    {
        edge actual=cola.top();
        cola.pop();
        int u=actual.to;
        int w=actual.peso;
        if(!visitado[u])
        {
            visitado[u]=true;
            for(int i=0; i<grafo[u].size(); i++)
            {
                edge aux=grafo[u][i];
                int to=aux.to;
                int peso=aux.peso;
                if(!visitado[to] && peso<distancias[to])
                {
                    distancias[to]=peso;
                    cola.push(edge(to,peso));
                }
            }
        }
    }
    for(int i=0; i<N; i++)
    {
        answ+=distancias[i];
    }
    return answ;
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);


    while(cin>>N>>M)
    {
        if(N==0 && M==0)
        {
            break;
        }
        vector<vector<edge> > grafo(N);
        int u,v,w,totalcost=0;
        for(int i=0; i<M; i++)
        {
            cin>>u>>v>>w;
            totalcost+=w;
            grafo[u].push_back(edge(v,w));
            grafo[v].push_back(edge(u,w));
        }
        int mincost=prim(grafo);
//        cout<<mincost<<endl;
        cout<<totalcost-mincost<<endl;
    }
    return 0;
}
