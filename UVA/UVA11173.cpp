#include <iostream>
#include <bits/stdc++.h>
#define endl '\n'
using namespace std;

int main() {
		int t;
		cin>>t;
		while(t--){
			int n,k;
			cin>>n>>k;
			int resul=k^(k>>1);
			cout<<resul<<endl;
		}
	}


