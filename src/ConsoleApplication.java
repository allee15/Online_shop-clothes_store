
import Business.Store;
import java.util.Scanner;
public class ConsoleApplication {
    private static void comenzi() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("My barbie store");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println();
        System.out.println("Buna! Alege optiunea dorita, apasand tasta corespunzatoare: ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("|                   1. Login as admin                                  |");
        System.out.println("|                   2. Login as customer                               |");
        System.out.println("|                   0. EXIT                                            |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        System.out.println("18. Logout");
        System.out.println("|                   Ce vei alege? ^^                                   |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void main(String[] args){


        Store.initializare();
        while(true){
            comenzi();
        Scanner sc = new Scanner(System.in);
        int comanda = sc.nextInt();
        switch (comanda){
            case 0:
                System.out.println("                          Sayonara!                        ");
                return;
            case 1:
                Store.addAdmin();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Alege optiunea dorita, din nou, apasand tasta corespunzatoare: ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("|                   1. Adauga o categorie in magazin                   |");
                System.out.println("|                   2. Adauga un produs in magazin                     |");
                System.out.println("|                   3. Afiseaza toate produsele din magazin            |");
                System.out.println("|                   4. Afiseaza clientii din magazin                   |");
                System.out.println("|                   5. Afiseaza categoriile                            |");
                System.out.println("|                   0. EXIT                                            |");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("|                   Ce vei alege? ^^                                   |");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                int comandaAdmin=sc.nextInt();
                switch (comandaAdmin){
                    case 1:
                        Store.addCategory();
                        System.out.println("-----------------------------Done!--------------------------------");
                        break;
                    case 2:
                        Store.addProduct();
                        System.out.println("-----------------------------Done!--------------------------------");
                        break;
                    case 3:
                        Store.displayProduct();
                        System.out.println("-----------------------------Done!--------------------------------");
                        break;
                    case 4:
                        Store.displayCustomer();
                        System.out.println("-----------------------------Done!--------------------------------");
                        break;
                    case 5:
                        Store.displayCategory();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("-----------------------------Done!--------------------------------");
                }
                break;
            case 2:
                Store.addCustomer();

                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Alege optiunea dorita, din nou, apasand tasta corespunzatoare: ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("|                   1. Afiseaza toate produsele din magazin            |");
                System.out.println("|                   2. Adauga un rating                                |");
                System.out.println("|                   3. Adauga un produs in cosul de cumparaturi        |");
                System.out.println("|                   4. Sterge un produs din cosul de cumparaturi       |");
                System.out.println("|                   5. Adauga un cupon                                 |");
                System.out.println("|                   6. Aplicare reducere cupoane                       |");
                System.out.println("|                   7. Vizualizeaza cosul de cumparaturi               |");
                System.out.println("|                   8. Adauga adresa de livrare                        |");
                System.out.println("|                   9. Comanda produsele                               |");
                System.out.println("|                   10. Afiseaza comanda produselor                    |");
                System.out.println("|                   11. Afiseaza profil client                         |");
                System.out.println("|                   12. Afiseaza profil admin                          |");
                System.out.println("|                   13. Afiseaza categoriile                           |");
                System.out.println("|                   0. EXIT                                            |");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("|                   Ce vei alege? ^^                                   |");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                int comandaCustomer = sc.nextInt();
                switch (comandaCustomer){
                    case 1:
                        Store.displayProduct();
                        System.out.println("-----------------------------Done!--------------------------------");
                        break;
                    case 2:
                        Store.addRating();
                        System.out.println("-----------------------------Done!--------------------------------");
                        break;
                    case 3:
                        Store.addProductCart();
                        System.out.println("-----------------------------Done!--------------------------------");
                        break;
                    case 4:
                        Store.deleteProductCart();
                        System.out.println("-----------------------------Done!--------------------------------");
                        break;
                    case 5:
                        Store.addCoupon();
                        System.out.println("-----------------------------Done!--------------------------------");
                        break;
                    case 6:
                        Store.AplicareReducere();
                        System.out.println("-----------------------------Done!--------------------------------");
                        break;
                    case 7:
                        Store.displayCart();
                        System.out.println("-----------------------------Done!--------------------------------");
                        break;
                    case 8:
                        Store.addShipping();
                        System.out.println("-----------------------------Done!--------------------------------");
                        break;
                    case 9:
                        Store.addOrder();
                        System.out.println("-----------------------------Done!--------------------------------");
                        break;
                    case 10:
                        Store.displayOrder();
                        System.out.println("-----------------------------Done!--------------------------------");
                        break;
                    case 11:
                        Store.displayCustomer();
                        System.out.println("-----------------------------Done!--------------------------------");
                        break;
                    case 12:
                        Store.displayAdmin();
                        break;
                    case 13:
                        Store.displayCategory();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("!!!!!!!!!!!!!!!!!!!Comanda inexistenta!!!!!!!!!!!!!!!!!!!");
                }
                break;
            default:
                System.out.println("!!!!!!!!!!!!!!!!!!!Comanda inexistenta!!!!!!!!!!!!!!!!!!!");
        }


    }}


}
