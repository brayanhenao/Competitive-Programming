#include <bits/stdc++.h> //Next palindromic numbers
using namespace std;
#define _ ios_base::sync_with_stdio(false);cin.tie(NULL);

bool sum1(string &s){
    int i = s.size()-1;
    while(i >=0){
        if(s[i]!= '9'){
            s[i] = s[i]+1;
            return true;
        }else{
            s[i]='0';
        }
        i--;
    }

    s = "1"+s;
    //retorna false cuando por ejemplo cuando un 99 se convierte en 100 o un 999 en 1000, etc
    return false;
}

void nextPalindrome(string &s){
    string firstHalf, secondHalf,revFirstHalf;    
    if(s.size()%2 == 0){
        firstHalf = s.substr(0, s.size()/2);
        secondHalf = s.substr(s.size()/2, s.size());
        revFirstHalf = firstHalf;
        reverse(revFirstHalf.begin(), revFirstHalf.end());
        if(revFirstHalf > secondHalf){
            s = firstHalf + revFirstHalf;
            return;
        }else{
            if(sum1(firstHalf)){
                revFirstHalf = firstHalf;
                reverse(revFirstHalf.begin(), revFirstHalf.end());
                s = firstHalf + revFirstHalf;
                return;
            }else{
                revFirstHalf = firstHalf.substr(0, firstHalf.size()-1);
                reverse(revFirstHalf.begin(), revFirstHalf.end());
                s = firstHalf + revFirstHalf;
                return;
            }
        }
    }else{
        firstHalf = s.substr(0, s.size()/2);
        secondHalf = s.substr(s.size()/2 +1, s.size());
        revFirstHalf = firstHalf;
        reverse(revFirstHalf.begin(), revFirstHalf.end());
        if(revFirstHalf > secondHalf){
            s = firstHalf + s[s.size()/2] + revFirstHalf;
            return;
        }else{
            if(s[s.size()/2]!= '9'){
                s = firstHalf + (++s[s.size()/2]) + revFirstHalf;
                return;
            }else{
                if(sum1(firstHalf)){
                    revFirstHalf = firstHalf;
                    reverse(revFirstHalf.begin(), revFirstHalf.end());
                    s=firstHalf + '0' + revFirstHalf;
                    return;
                }else{
                    revFirstHalf = firstHalf;
                    reverse(revFirstHalf.begin(), revFirstHalf.end());
                    s=firstHalf + revFirstHalf;
                    return;
                }
            }
        }
    }

}

int main(){
    int n;
    string s;
    while(cin >> n >> s){
        while(n--){
            nextPalindrome(s);
            cout << s << '\n';
        }
    }
    return 0;
}