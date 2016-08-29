#include <bits/stdc++.h>
using namespace std;

double factorial[2520];
double error = 1e-3;

int main()
{
    factorial[0] = 0;
	factorial[1] = 0;
    for (int i=2;i<2520; i++){
       factorial[i]=factorial[i-1]+log((double)i);
    }

    int N;cin>>N;
    int casos=1;
    int a,b,c;
    while(N--){
        cin>>a>>b>>c;
        double fa=0;double fb=0;double fc=0;

        for(int i=0;i<a;i++){
            int aux;cin>>aux;
			fa+=factorial[aux];
			//cout<<aux<<" ->"<<factorial[aux]<<'\n';
        }
        for(int i=0;i<b;i++){
            int aux;cin>>aux;
            fb+=factorial[aux];
			//cout<<aux<<" ->"<<factorial[aux]<<'\n';
        }
        for(int i=0;i<c;i++){
            int aux;cin>>aux;
            fc+=factorial[aux];
			//cout<<aux<<" ->"<<factorial[aux]<<'\n';
        }
        //cout<<fa<<"-"<<fb<<"-"<<fc<<'\n';
    }
    return 0;
}
