
import Business.Store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ConsoleApplication {


    public static void CSVFile(String numeActiune) {
        Date timestamp = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timestampString = dateFormat.format(timestamp);
        try {
            FileWriter fileWriter = new FileWriter("audit.csv", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.printf("%s,%s\n", numeActiune, timestampString);
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Eroare la scrierea in fisierul CSV: " + e.getMessage());
        }
    }


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

    public static void main(String[] args) throws SQLException {


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
                runAsAdmin();
                break;
            case 2:
                Store.addCustomer();
                runAsCustomer();
                break;
            default:
                System.out.println("!!!!!!!!!!!!!!!!!!!Comanda inexistenta!!!!!!!!!!!!!!!!!!!");
        }


    }}

    public static void runAsAdmin() throws SQLException {

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
        Scanner sc = new Scanner(System.in);
        int comandaAdmin=sc.nextInt();
        switch (comandaAdmin){
            case 1:
                Store.addCategory();
                CSVFile("Adding a category as admin");
                System.out.println("-----------------------------Done!--------------------------------");
                break;
            case 2:
                Store.addProduct();
                CSVFile("Adding a product as admin");
                System.out.println("-----------------------------Done!--------------------------------");
                break;
            case 3:
                Store.displayProduct();
                CSVFile("Displaying a product as admin");
                System.out.println("-----------------------------Done!--------------------------------");
                break;
            case 4:
                Store.displayCustomer();
                CSVFile("Displaying a customer as admin");
                System.out.println("-----------------------------Done!--------------------------------");
                break;
            case 5:
                Store.displayCategory();
                CSVFile("Displaying a category as admin");
                System.out.println("-----------------------------Done!--------------------------------");
                break;
            case 0:
                break;
            default:
                System.out.println("-----------------------------Done!--------------------------------");
        }
    }


    public static void runAsCustomer(){

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
        Scanner sc = new Scanner(System.in);
        int comandaCustomer = sc.nextInt();
        switch (comandaCustomer){
            case 1:
                Store.displayProduct();
                CSVFile("Displaying a product as customer");
                System.out.println("-----------------------------Done!--------------------------------");
                break;
            case 2:
                Store.addRating();
                CSVFile("Adding a rating as customer");
                System.out.println("-----------------------------Done!--------------------------------");
                break;
            case 3:
                Store.addProductCart();
                CSVFile("Adding a product to cart as customer");
                System.out.println("-----------------------------Done!--------------------------------");
                break;
            case 4:
                Store.deleteProductCart();
                CSVFile("Deleting a product from cart as customer");
                System.out.println("-----------------------------Done!--------------------------------");
                break;
            case 5:
                Store.addCoupon();
                CSVFile("Adding a coupon as customer");
                System.out.println("-----------------------------Done!--------------------------------");
                break;
            case 6:
                Store.AplicareReducere();
                CSVFile("Using a coupon as customer");
                System.out.println("-----------------------------Done!--------------------------------");
                break;
            case 7:
                Store.displayCart();
                CSVFile("Displayng the cart as customer");
                System.out.println("-----------------------------Done!--------------------------------");
                break;
            case 8:
                Store.addShipping();
                CSVFile("Add a shipping as customer");
                System.out.println("-----------------------------Done!--------------------------------");
                break;
            case 9:
                Store.addOrder();
                CSVFile("Placing an order as customer");
                System.out.println("-----------------------------Done!--------------------------------");
                break;
            case 10:
                Store.displayOrder();
                CSVFile("Displaying order details as customer");
                System.out.println("-----------------------------Done!--------------------------------");
                break;
            case 11:
                Store.displayCustomer();
                CSVFile("Displaying self details as customer");
                System.out.println("-----------------------------Done!--------------------------------");
                break;
            case 12:
                Store.displayAdmin();
                CSVFile("Displaying admin details as customer");
                System.out.println("-----------------------------Done!--------------------------------");
                break;
            case 13:
                Store.displayCategory();
                CSVFile("Displaying a category details as customers");
                System.out.println("-----------------------------Done!--------------------------------");
                break;
            case 0:
                break;
            default:
                System.out.println("!!!!!!!!!!!!!!!!!!!Comanda inexistenta!!!!!!!!!!!!!!!!!!!");
        }
    }

}
