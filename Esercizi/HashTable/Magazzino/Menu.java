package Esercizi.HashTable.Magazzino;
import java.util.Scanner;

public class Menu {
    private Scanner tastiera = new Scanner(System.in);

    private void mostraMenu() {
        System.out.println("1 - Aggiungi un prodotto");
        System.out.println("2 - Visualizza magazzino");
    }

    public int selezionaVoce()
    {
        int selezione;
        mostraMenu();
        try {
            selezione = tastiera.nextInt();
        }
        catch(Exception e) {
            System.out.println("Scelta non valida...");
            selezione = 0;
        }   
    tastiera.nextLine();
    return selezione;
    }
    

}
