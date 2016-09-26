#include <bits/stdc++.h>
#define endl '\n'

using namespace std;

int main()
{
//    ios_base::sync_with_stdio(0);
//    cin.tie(0);
    int T,N;
    cin>>T;
    getchar();
    while(T--)
    {
        string linea;
        getline(cin,linea);
        istringstream iss(linea);

        vector<int> nums;
        while(iss>>N)
        {
            nums.push_back(N);
        }
        int maxgcd=0;
        for(int i=0; i<nums.size(); i++)
        {
            for(int j=i+1; j<nums.size(); j++)
            {
                maxgcd=max(maxgcd,__gcd(nums[i],nums[j]));
            }
        }
        cout<<maxgcd<<endl;
    }

    return 0;
}
