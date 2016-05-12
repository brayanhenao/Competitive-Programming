#include <bits/stdc++.h>
#define endl '\n'

using namespace std;

int main() {
  ios_base::sync_with_stdio(false);cin.tie(NULL);
  int a,b;
  double c;
  while (cin >> a >> b >> c) {
    cout<< "NUMBER = "<<a<< endl;
    cout<< "SALARY = U$ "<<fixed<<setprecision(2)<<b*c<<endl;
  }
  return 0;
}
