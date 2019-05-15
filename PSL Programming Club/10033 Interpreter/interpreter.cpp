#include <bits/stdc++.h>

#define endl '\n'

using namespace std;

vector<int> ram;
vector<int> registers;

int getNthDigit(int number, int ndigit)
{
    return (48 + ((int)(number / pow(10, ndigit)) % 10)) - '0';
}

int processRegisterMovements()
{
    int cont = 0;
    for (int i = 0; i < ram.size(); i++)
    {
        int x = getNthDigit(ram[i], 2);
        int y = getNthDigit(ram[i], 1);
        int z = getNthDigit(ram[i], 0);

        cont++;

        switch (x)
        {
        case 0:
            if (registers[y] != 0)
            {
                i = registers[y] - 1;
            }
            break;
        case 1:
            return cont;
            break;
        case 2:
            registers[y] = z;
            registers[y] %= 1000;
            break;
        case 3:
            registers[y] += z;
            registers[y] %= 1000;
            break;
        case 4:
            registers[y] *= z;
            registers[y] %= 1000;
            break;
        case 5:
            registers[y] = registers[z];
            registers[y] %= 1000;
            break;
        case 6:
            registers[y] += registers[z];
            registers[y] %= 1000;
            break;
        case 7:
            registers[y] *= registers[z];
            registers[y] %= 1000;
            break;
        case 8:
            registers[y] = ram[registers[z]];
            registers[y] %= 1000;
            break;
        case 9:
            ram[registers[z]] = registers[y];
            ram[registers[z]] %= 1000;
            break;
        }
    }
    return cont;
}

int main()
{
    int ncasos;
    cin >> ncasos;
    while (ncasos--)
    {

        ram.assign(1000, 0);
        registers.assign(10, 0);

        string linea;
        int i = 0;
        while (cin >> linea)
        {
            ram[i] = stoi(linea);
            i++;
        }
        cout << processRegisterMovements() << endl;

        if (ncasos != 1)
        {
            cout << endl;
        }
    }
}
