package Esercizi.HashTable.Magazzino;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int selezione;
        Boolean loop = true;
        Menu mioMenu = new Menu();
        
        while (loop) {

            selezione = mioMenu.selezionaVoce();
            switch (selezione) {
                case 1:
                    System.out.println("\nHai scelto 1\n");
                    break;

                case 2:
                    System.out.println("\nHai scelto 2\n");
                    break;
            
                default:
                    Scanner tastiera = new Scanner(System.in);
                    String test = "";
                        try {
                            System.out.println("\nVuoi riprovare? (Y/N)");
                            test = tastiera.nextLine();
                            if(!test.toUpperCase().equals("Y")) {
                                System.out.println("Addio");
                                loop = false;
                            }
                        }
                        catch (InputMismatchException e) {
                            System.out.println("E");
                        }
                        tastiera.close();
                    
                break;
            }
        }
    }
}