#include <bits/stdc++.h>

#define endl '\n'

using namespace std;

vector<int> ram;
vector<int> registers;
template <typename T>
std::ostream &operator<<(std::ostream &out, const std::vector<T> &v)
{
    if (!v.empty())
    {
        out << '[';
        std::copy(v.begin(), v.end(), std::ostream_iterator<T>(out, ", "));
        out << "\b\b]";
    }
    return out;
}
int processRegisterMovements()
{
    int cont = 0;
    for (int i = 0; i < ram.size(); i++)
    {
        int code = ram[i];
        int action = code / 100;
        int xAndY = code % 100;
        int x = xAndY / 10;
        int y = xAndY % 10;

        cont++;
        switch (action)
        {
        case 0:
            if (registers[y] != 0)
            {
                i = registers[x] - 1;
            }
            break;
        case 1:
            return cont;
            break;
        case 2:
            registers[x] = y;
            break;
        case 3:
            registers[x] += y;
            registers[x] %= 1000;
            break;
        case 4:
            registers[x] *= y;
            registers[x] %= 1000;
            break;
        case 5:
            registers[x] = registers[y];
            break;
        case 6:
            registers[x] += registers[y];
            registers[x] %= 1000;
            break;
        case 7:
            registers[x] *= registers[y];
            registers[x] %= 1000;
            break;
        case 8:
            registers[x] = ram[registers[y]];
            break;
        case 9:
            ram[registers[y]] = registers[x];
            break;
        }
    }
    return cont;
}

int main()
{
    string linea;
    int ncasos;
    getline(cin, linea);
    ncasos = stoi(linea);
    getline(cin, linea);
    while (ncasos--)
    {
        ram.assign(1000, 0);
        registers.assign(10, 0);

        int i = 0;
        while (getline(cin, linea))
        {
            if (linea.length() == 0)
            {
                break;
            }
            ram[i] = stoi(linea);
            i++;
        }

        int a = processRegisterMovements();
        cout << a << endl;

        if (ncasos != 0)
        {
            cout << endl;
        }
    }
}
