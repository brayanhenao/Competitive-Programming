#include <bits/stdc++.h>
#define endl '\n'
using namespace std;


int main(){
    ios_base::sync_with_stdio(false);cin.tie(NULL);
    int n,m;
     while(cin>>n>>m){
        vector<int> nums;
        bool puede=true;
        if(m==1 || m==0 || n==1 || n==0){
            cout<<"Boring!"<<endl;
        }else{
            while(n>=1){
            nums.push_back(n);
            if(n%m!=0){
                if(n!=1){
                     puede=false;
                break;
                }

            }
            n/=m;
        }

        if(!puede){
            cout<<"Boring!"<<endl;
        }else{
            bool primero=true;
            for(int i=0;i<nums.size();i++){
            if(primero){
                cout<<nums[i];
                primero=false;
            }else{
                cout<<" "<<nums[i];
            }

            }
            cout<<endl;
        }
        }
    }

    return 0;
}
