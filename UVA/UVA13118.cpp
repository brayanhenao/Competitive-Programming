#include <bits/stdc++.h>
#define endl '\n'

using namespace std;


struct Estado
{

    int x,y,a,b,movimientos;
    Estado() {};
    Estado(int _x,int _y,int _a,int _b,int _movimientos):x(_x),y(_y),a(_a),b(_b),movimientos(_movimientos) {};
};



const int MX = 50;
char grafo[MX][MX];
int visitados[MX][MX][MX][MX];
int visto,R,C;

bool puedeMover(int x, int y)
{
    return x >= 0 && x < R && y >= 0 && y < C && grafo[x][y] == '.';
}

int bfs(Estado inicial,Estado esperado)
{


    queue<Estado> cola;
    int t=0;
    cola.push(inicial);
    while(!cola.empty())
    {
        Estado actual=cola.front();
        cola.pop();
        if(( esperado.x==actual.x )&& (esperado.y==actual.y) && (esperado.a==actual.a) && (esperado.b==actual.b))
        {
            return actual.movimientos;
        }

        int x=actual.x;
        int y=actual.y;
        int a=actual.a;
        int b=actual.b;

        //Abajo
        x++;
        a++;
        if(!puedeMover(x,y))
        {
            x=actual.x;
            y=actual.y;
        }
        if(!puedeMover(a,b))
        {
            a=actual.a;
            b=actual.b;
        }
        if(visitados[x][y][a][b]!=visto)
        {
            visitados[x][y][a][b]=visto;
            t++;
            cola.push(Estado(x,y,a,b,actual.movimientos+1));
        }

        //Arriba
        x=actual.x;
        y=actual.y;
        a=actual.a;
        b=actual.b;
        x--;
        a--;
        if(!puedeMover(x,y))
        {
            x=actual.x;
            y=actual.y;
        }
        if(!puedeMover(a,b))
        {
            a=actual.a;
            b=actual.b;
        }
        if(visitados[x][y][a][b]!=visto)
        {
            visitados[x][y][a][b]=visto;
            t++;
            cola.push(Estado(x,y,a,b,actual.movimientos+1));
        }

        //Derecha
        x=actual.x;
        y=actual.y;
        a=actual.a;
        b=actual.b;
        y++;
        b--;
        if(!puedeMover(x,y))
        {
            x=actual.x;
            y=actual.y;
        }
        if(!puedeMover(a,b))
        {
            a=actual.a;
            b=actual.b;
        }
        if(visitados[x][y][a][b]!=visto)
        {
            visitados[x][y][a][b]=visto;
            t++;
            cola.push(Estado(x,y,a,b,actual.movimientos+1));
        }

        //Izquierda
        x=actual.x;
        y=actual.y;
        a=actual.a;
        b=actual.b;
        y--;
        b++;
        if(!puedeMover(x,y))
        {
            x=actual.x;
            y=actual.y;
        }
        if(!puedeMover(a,b))
        {
            a=actual.a;
            b=actual.b;
        }
        if(visitados[x][y][a][b]!=visto)
        {
            visitados[x][y][a][b]=visto;
            t++;
            cola.push(Estado(x,y,a,b,actual.movimientos+1));
        }


    }
    return -1;
}

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    while(cin>>R>>C)
    {
        visto++;
        int a,b,c,d,x,y;
        cin>>x>>y>>a>>b>>c>>d;
        x--;y--;a--;b--;c--;d--;
        Estado esperado=Estado(x,y,x,y,0);
        Estado inicio=Estado(a,b,c,d,0);

        for(int i=0; i<R;i++)
        {
            for(int j=0; j<C; j++)
            {
                cin>>grafo[i][j];
            }
        }

        int answ=bfs(inicio,esperado);
        if(answ!=-1)
        {
            cout<<answ<<endl;
        }
        else
        {
            cout<<"NO LOVE"<<endl;
        }
    }
}



