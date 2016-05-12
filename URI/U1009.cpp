#include <bits/stdc++.h>
#define endl '\n'

using namespace std;

int main() {
  ios_base::sync_with_stdio(false);cin.tie(NULL);
  string s;
  double a,b;
  while (cin >> s >> a >> b) {
    cout << "TOTAL = R$ " << fixed << setprecision(2) <<a+b*0.15 << endl;
  }
  return 0;
}
