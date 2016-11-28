#include <bits/stdc++.h>

using namespace std;

bool checkBalance(string &s){    
    stack<char> pila;
    char tmp;
    char c;
    for(int i = 0; i < s.size(); i++){
        tmp = s[i];
        if(tmp == '{' || tmp == '[' || tmp == '(') pila.push(tmp);
        else{
            if(pila.empty()) return false;
            c = pila.top();
            pila.pop();
            
            switch(tmp){
                case '}':
                if(c != '{') return false;
                break;
                case ']':
                if(c != '[') return false;
                break;
                case ')':
                if( c != '(') return false;
            }
        }
            
        
    }
    
    if(pila.empty()) return true;
    else return false;
    
}

int main(){
    int t;
    cin >> t;
    for(int a0 = 0; a0 < t; a0++){
        string s;
        cin >> s;
        bool b = checkBalance(s);
        cout << (b? "YES\n": "NO\n");
    }
    return 0;
}

