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
        System.out.println("8. Sterge un produs din cosul de cumparaturi");
        System.out.println("9. Adauga un cupon");
        System.out.println("10. Aplicare reducere cupoane");
        System.out.println("11. Vizualizeaza cosul de cumparaturi");
        System.out.println("12. Adauga adresa de livrare");
        System.out.println("13. Comanda produsele");
        System.out.println("14. Afiseaza comanda produselor");
        System.out.println("15. Afiseaza profil client");
        System.out.println("16. Afiseaza profil admin");
        System.out.println("17. Afiseaza categoriile");
        System.out.println("18. Logout");
        System.out.println("Ce vei alege? ^^");
    }
    public static void main(String[] args){


        Store.initializare();
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
                Store.addProductCart();
                System.out.println("Done!");
                break;
            case 8:
                Store.deleteProductCart();
                System.out.println("Done!");
                break;
            case 9:
                Store.addCoupon();
                System.out.println("Done!");
                break;
            case 10:
                Store.AplicareReducere();
                System.out.println("Done!");
                break;
            case 11:
                Store.displayCart();
                System.out.println("Done!");
                break;
            case 12:
                Store.addShipping();
                System.out.println("Done!");
                break;
            case 13:
                Store.addOrder();
                System.out.println("Done!");
                break;
            case 14:
                Store.displayOrder();
                System.out.println("Done");
                break;
            case 15:
                Store.displayCustomer();
                System.out.println("Done");
                break;
            case 16:
                Store.displayAdmin();
                break;
            case 17:
                Store.displayCategory();
                break;
            case 18:
                System.out.println("Done");
                break;
            default:
                System.out.println("Comanda inexistenta!");
        }


    }}


}
