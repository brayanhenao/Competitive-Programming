#include <bits/stdc++.h>
#define endl '\n'

using namespace std;
struct Nodo
{
    char info;
    Nodo* izq;
    Nodo* der;
};
bool primero=true;
Nodo* crearRaiz(char letra)
{
    Nodo* raiz=new Nodo();
    raiz->info=letra;
    raiz->izq=NULL;
    raiz->der=NULL;
    return raiz;
}

Nodo* insertar(Nodo* raiz, char letra)
{
    if(raiz==NULL)
    {
        raiz=crearRaiz(letra);
        return raiz;
    }
    else if(letra>=raiz->info)
    {
        raiz->der=insertar(raiz->der,letra);
    }
    else
    {
        raiz->izq=insertar(raiz->izq,letra);
    }
    return raiz;
}

bool buscar(struct Nodo* raiz,char buscado)
{
    if(raiz==NULL)
    {
        return false;
    }
    else if(raiz->info==buscado)
    {
        return true;
    }
    else if(raiz->info>buscado)
    {
        return buscar(raiz->izq,buscado);
    }
    else
    {
        return buscar(raiz->der,buscado);
    }
}

void postOrden(struct Nodo* raiz)
{
    if(raiz==NULL)
    {
        return;
    }
    postOrden(raiz->izq);
    postOrden(raiz->der);
    if(primero)
    {
        cout<<raiz->info;
        primero=false;
    }
    else
    {
        cout<<" "<<raiz->info;
    }
}

void preOrden(struct Nodo* raiz)
{
    if(raiz==NULL)
    {
        return;
    }
    if(primero)
    {
        cout<<raiz->info;
        primero=false;
    }
    else
    {
        cout<<" "<<raiz->info;
    }

    preOrden(raiz->izq);
    preOrden(raiz->der);
}

void InOrden(struct Nodo* raiz)
{
    if(raiz==NULL)
    {
        return;
    }
    InOrden(raiz->izq);
    if(primero)
    {
        cout<<raiz->info;
        primero=false;
    }
    else
    {
        cout<<" "<<raiz->info;
    }
    InOrden(raiz->der);
}




int main()
{
    string cadena;
    Nodo* raiz=NULL;
    while(getline(cin,cadena))
    {
        if(cadena=="POSFIXA")
        {
            primero=true;
            postOrden(raiz);
            cout<<endl;
        }
        else if(cadena=="PREFIXA")
        {
            primero=true;
            preOrden(raiz);
            cout<<endl;
        }
        else if(cadena=="INFIXA")
        {
            primero=true;
            InOrden(raiz);
            cout<<endl;
        }
        else if(cadena[0]=='I')
        {
            raiz=insertar(raiz,cadena[2]);
        }
        else
        {
            if(buscar(raiz,cadena[2]))
            {
                cout<<cadena[2]<<" existe"<<endl;
            }
            else
            {
                cout<<cadena[2]<<" nao existe"<<endl;
            }
        }
    }

}
