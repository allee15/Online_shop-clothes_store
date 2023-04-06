import model.Category;
import model.Product;
import Business.Store;
import java.util.Scanner;
public class ConsoleApplication {
    private static void comenzi() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("My barbie store");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println();
        System.out.println("Buna! Alege optiunea dorita, apasand tasta corespunzatoare: ");
        System.out.println("1. Login as admin");
        System.out.println("2. Login as customer");
        System.out.println("3. Adauga o categorie in magazin");
        System.out.println("4. Adauga un produs in magazin");
        System.out.println("5. Afiseaza toate produsele din magazin");
        System.out.println("6. Adauga un rating");
        System.out.println("7. Adauga un produs in cosul de cumparaturi");
        System.out.println("8. Logout");
        System.out.println("9. Afiseaza client");
        System.out.println("Ce vei alege? ^^");
    }
    public static void main(String[] args){


        Store.init();
        while(true){
            comenzi();
        Scanner sc = new Scanner(System.in);
        Integer comanda = sc.nextInt();
        switch (comanda){
            case 1:
                Store.addAdmin();
                break;
            case 2:
                Store.addCustomer();
                break;
            case 3:
                Store.addCategory();
                System.out.println("Done!");
                break;
            case 4:
                Store.addProduct();
                System.out.println("Done!");
                break;
            case 5:
                Store.displayProduct();
                System.out.println("Done!");
                break;
            case 6:
                Store.addRating();
                System.out.println("Done!");
                break;
            case 7:

                break;
            case 8:
                break;
            case 9:
                Store.displayCustomer();
                break;
            default:
                System.out.println("Comanda inexistenta!");
        }


    }}


}
