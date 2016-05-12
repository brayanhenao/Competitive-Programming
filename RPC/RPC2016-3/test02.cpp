#include <bits/stdc++.h>
#include<vector>
#define endl '\n'
using namespace std;



int main( ) {
  int maxnum=3000001;
  int nume=10000000000;

  vector< int > dp( maxnum, nume );

  int actual = 0;
  for( int i = 1; ; ++i ) {
    actual+=i;
    if(actual>=maxnum){
        break;
    }
    dp[actual] = 1;

    for( int j = 1; (j+actual) < maxnum; ++j ){
      dp[ j+actual ] = min( dp[ j+actual ], dp[ j ]+1 );
    }
  }

  int num = 0;
  while( cin >> num ){
    cout << dp[ num ] << endl;
  }

  return 1;

}
