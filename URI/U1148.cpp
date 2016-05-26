#include <bits/stdc++.h>
#define MAXN 510
#define endl '\n'

using namespace std;

const int infinito = 1 << 30;
int grafo[MAXN][MAXN];

int dijkstra(int origen, int destino, int N)
{
    int distanciaMin, nextv;
    int distancias[N];
    bool visitado[N];

    for (int i = 0; i < N; ++i)
    {
        distancias[i] = infinito;
        visitado[i] = false;
    }

    distancias[origen] = 0;

    for (int i = 0; i < N; ++i)
    {
        distanciaMin = infinito;

        if (visitado[destino]) break;

        for (int j = 0; j < N; ++j)
        {
            if (distancias[j] < distanciaMin && !visitado[j])
            {
                distanciaMin = distancias[j];
                nextv = j;
            }
        }

        if (distanciaMin == infinito) break;

        visitado[nextv] = true;

        for (int j = 0; j < N; ++j)
            if (distanciaMin + grafo[nextv][j] < distancias[j])
                distancias[j] = distanciaMin + grafo[nextv][j];
    }

    return distancias[destino];
}

int main()
{
    int  N, E, X, Y, H, querrys, inicio, fin;

    while(cin>>N>>E)
    {
        if(N==0 && E==0)
        {
            break;
        }
        for (int i = 0; i < N; ++i)
        {
            for (int j = 0; j < N; ++j)
            {
                grafo[i][j] = infinito;
            }
        }
        while(E--)
        {
            cin>>X>>Y>>H;
            X--;
            Y--;
            grafo[X][Y] = H;
            if(grafo[Y][X] != infinito)
            {
                grafo[X][Y] = grafo[Y][X] = 0;
            }
        }

        cin>>querrys;

        while(querrys--)
        {
            cin>>inicio>>fin;
            inicio--;
            fin--;
            int dist = dijkstra(inicio, fin, N);
            if(dist == infinito)
            {
                cout<<"Nao e possivel entregar a carta"<<endl;
            }
            else
            {
                cout<<dist<<endl;
            }
        }
        cout<<endl;
    }

    return 0;
}

