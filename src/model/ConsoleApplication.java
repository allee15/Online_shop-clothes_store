package model;

import java.util.ArrayList;
import java.util.Scanner;
public class ConsoleApplication {

    public static void main(String[] args){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("My barbie store");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println();
        System.out.println("Buna! Alege optiunea dorita, apasand tasta corespunzatoare: ");
        System.out.println("1. Login");
        System.out.println("2. Adauga o categorie in magazin");
        System.out.println("3. Adauga un produs in magazin");
        System.out.println("4. Afiseaza toate produsele din magazin");
        System.out.println("5. Afiseaza toate hainele");
        System.out.println("6. Sterge un produs");
        System.out.println("7. Logout");
        System.out.println("Ce vei alege? ^^");

        Scanner sc = new Scanner(System.in);
        Integer comanda = sc.nextInt();
        switch (comanda){
            case 1:
                System.out.println("Logheza te in sistem"); //va urma
                break;
            case 2:
                Category c2 = new Category(2,"Footwear","Terrific");
                System.out.println("Done!");
                break;
            case 3:
                Category c1 = new Category(1,"Clothing","Awesome");
                Product p1 = new Product(1,"Dress", "A shinny pink dress", 59.99, true, c1);
                System.out.println("Done!");
                break;
            case 4:
                System.out.println("All products:");
                //store.displayAllProducts();
                break;
            case 5:
                //ArrayList<Product> clothingProducts = store.getProductsByCategory("Clothing");
                //for (Product product : clothingProducts) {
                //    System.out.println(product.getName() + " - " + product.getPrice());
                //}
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                System.out.println("Comanda inexistenta!");
        }
    }

}
