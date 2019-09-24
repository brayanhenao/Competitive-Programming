#include <bits/stdc++.h>

#define endl '\n'

using namespace std;

string suits[4] = {"Clubs", "Diamonds", "Hearts", "Spades"};
string values[14] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

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

string getDeckValue(int n)
{
    int suit = n / 13;
    int value = n % 14;
    return values[value] + " of " + suits[suit];
}

void applyShuffleToDeck(vector<int> deck, int movements[])
{
    vector<int> deck2 = deck;
    for (int i = 0; i < 52; i++)
    {
        cout << " i = " << i + 1 << " --------- card = " << movements[i];
        if (movements[i] != i + 1)
        {
            deck[i] = deck2[movements[i]];
        }
    }
}

void printDeck(vector<int> deck)
{
    for (size_t i = 0; i < deck.size(); i++)
    {
        cout << getDeckValue(deck[i]) << endl;
    }
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
        vector<int> cards;
        for (int i = 0; i < 52; i++)
        {
            cards.push_back(i + 1);
        }

        int nshuffles;
        getline(cin, linea);
        nshuffles = atoi(linea.c_str());

        int movements[nshuffles][52];

        for (int i = 0; i < nshuffles; i++)
        {
            int j = 0;
            while (j < 52)
            {
                getline(cin, linea);
                stringstream ss(linea);
                string token;
                while (getline(ss, token, ' '))
                {
                    movements[i][j] = atoi(token.c_str());
                    j++;
                }
            }
        }

        while (getline(cin, linea) && linea.length() != 0)
        {
            cout << linea << endl;
            int shuffleToApply = atoi(linea.c_str());
            applyShuffleToDeck(cards, movements[shuffleToApply - 1]);
        }

        cout << endl;

        printDeck(cards);
    }
}
