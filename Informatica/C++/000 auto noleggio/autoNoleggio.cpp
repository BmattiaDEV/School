#include <iostream>
#include <fstream> 
using namespace std;

struct archivio
{
    string targa;
    string marca;
    string modelli;
    int anniImmatricolazione;
    bool disponibile;
};

int main()
{
    archivio autoNoleggio[10];
    bool fileEsiste = true;
    int scelta;

    ifstream fin("auto.txt");
    if(!fin.is_open())
    {
        cout<<"il file non si è aperto correttamento\n";
        fileEsiste = false;
    }

    cout<<"----MENU----\n1. inserire auto nuova\n2. visualizza tutte le auto\n3. visualizza le auto disponibili\n";
    cin>>scelta;

    switch(scelta)
    {
        case 1:
    }
}

void letturaMacchineDalFile(auto autonoleggio,bool fileEsiste)
{
    int nMacchine;
    string autina;
    fin>>nMacchine;
    if(fileEsiste)
    {
        while(int i > nMacchine)
        {
            fin>>autoNoleggio[i].targa;
            fin>>autoNoleggio[i].marca;
            fin>>autoNoleggio[i].modello;
            fin>>autoNoleggio[i].annoImmatriccolazione;
            fin>>autina;
            if(autina == "disponibile" or autina == "Disponibile"){
                autoNoleggio[i].disponibile = true;
            }
            else autoNoleggio[i].disponibile = false;
            i++;
        }
    }

    else
    {
        cerr<<"il file non e' aperto\n";
    }
}

