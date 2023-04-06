package Business;

import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.*;
import static java.lang.Integer.parseInt;


public class Store {
    public static ArrayList<Product> products=new ArrayList<>();
    public static ArrayList<Customer> customers=new ArrayList<>();
    public static ArrayList<Admin> admins=new ArrayList<>();
    public static ArrayList<Category> categories=new ArrayList<>();

    public static ArrayList<Coupon> coupons=new ArrayList<>();

    public static ArrayList<Rating>  ratings=new ArrayList<>();
    public static ArrayList<Shipping> shippings=new ArrayList<>();
    public static ArrayList<Order> orders=new ArrayList<>();

    public static ArrayList<Cart> itemsCarts=new ArrayList<>();
    public static void init(){
           Category c1=new Category(2,"Footwear","Terrific");
           Category c2=new Category(1,"Clothing","Awesome");
        categories.add(c1);
        categories.add(c2);
         Cart cart=new Cart();
        Customer customer1=new Customer(1,"customer1","123456","customer1@yahoo.com", "cutomer1","customer1","072546548","Str Academiei",cart);
        customers.add(customer1);
        Rating rating1 = new Rating(10,"Super",customer1);
        ratings.add(rating1);
        Product p1=new Product();
        p1.addRatingProduct(rating1);
        products.add(p1);
//        product.addRating(
//        Product p1=new Product(1,"shirt","frumos",1.0,true,2, c1);
//        products.add(p1);
        Admin a1=new Admin(1,"admin1","123456","admin1@yahoo,com","Denisa","Bucur","admin", "available");
        admins.add(a1);

        Shipping shipping1=new Shipping(1,"Focsani","Romania","Strada Academiei","000000",new Date());
        shippings.add(shipping1);
        Order order1= new Order(1,"card",new Date(),shipping1);
        orders.add(order1);
        Coupon coupon1=new Coupon("012345",20.0, true);
        coupons.add(coupon1);


    }

    public static void addCategory(){
            Scanner reader = new Scanner(System.in);
            System.out.println();
             System.out.println("Dati id-ul categoriei:");
             int idCateg=0;
             while (true) {
                 try {
                idCateg = Integer.parseInt(reader.nextLine());
                System.out.println("id: " + idCateg);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

            System.out.println("Dati numele categoriei");
            String name=reader.nextLine();
            System.out.println("Dati descrierea categoriei");
            String description=reader.nextLine();
            Category categorie_noua= new Category(idCateg,name,description);
            categories.add(categorie_noua);

    }
    public static void displayCategory(){
            for(Category category:categories){
                System.out.println(category);
                System.out.println();
            }
    }
    //    public void removeCategory(Category category) {
    //        categories.remove(category);
    //    }

    public static void addAdmin(){
            Scanner reader=new Scanner(System.in);
            System.out.println();
            System.out.println("Dati id-ul adminului:");
            int id=0;
             while (true) {
              try {
                  id = Integer.parseInt(reader.nextLine());
                  System.out.println("id: " + id);
                  break;
              } catch (NumberFormatException e) {
                  System.out.println("Invalid input. Please enter an integer.");
              }
          }

        System.out.println("Dati username-ul adminului:");
        String username=reader.nextLine();
        System.out.println("Dati parola adminului:");
        String password=reader.nextLine();
        System.out.println("Dati emailul adminului:");
        String email=reader.nextLine();
        System.out.println("Dati prenumele adminului:");
        String firstName=reader.nextLine();
        System.out.println("Dati numele de familie al adminului:");
        String lastName=reader.nextLine();
        System.out.println("Dati rolul adminului:");
        String role=reader.nextLine();
        System.out.println("Dati statusul adminului:");
        String status=reader.nextLine();
        Admin admin_nou= new Admin(id,username,password,email,firstName,lastName,role,status);
        admins.add(admin_nou);
    }
    public static void displayAdmin(){
        for(Admin admin:admins){
            System.out.println(admin);
            System.out.println();
        }
    }

    public static void addCoupon(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Dati codul cuponului:");
        String code=reader.nextLine();
        System.out.println("Este valid cuponul?Selectati:'true' sau 'false'");
        Boolean valid= Boolean.valueOf(reader.nextLine());
        System.out.println("Dati procentul de reducere al cuponului");
        Double percentage= Double.valueOf(reader.nextLine());

        Coupon cupon_nou= new Coupon(code,percentage,valid);
        coupons.add(cupon_nou);

    }
    public static void displayCoupon(){
        for(Coupon coupon:coupons){
            System.out.println(coupon);
            System.out.println();
        }
    }

    public static void addShipping(){
        Scanner reader=new Scanner(System.in);
        System.out.println();
        System.out.println("Dati id-ul shippingului:");
        int idShipping=0;
        while (true) {
            try {
                idShipping = Integer.parseInt(reader.nextLine());
                System.out.println("id: " + idShipping);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

        System.out.println("Dati orasul in care se doreste livrarea:");
        String city=reader.nextLine();
        System.out.println("Dati tara in care se doreste livrarea:");
        String country=reader.nextLine();
        System.out.println("Dati adresa locuintei:");
        String address=reader.nextLine();
        System.out.println("Dati adresa postala:");
        String postalCode=reader.nextLine();
        System.out.println("Dati dataLivrare:");
        String data1=reader.nextLine();
        Date dataLivrare = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dataLivrare = dateFormat.parse(data1);
        }catch(Exception e){
            System.out.println("Ati oferit o data gresita");
        }

        Shipping shipping_nou=new Shipping(idShipping,city,country,address,postalCode,dataLivrare);
        shippings.add(shipping_nou);

    }

    public static void displayShipping(){
        for(Shipping shipping:shippings){
            System.out.println(shipping);
            System.out.println();
        }
    }

    public static void addCustomer(){
        Scanner reader = new Scanner(System.in);

        System.out.println();
        System.out.println("Dati id-ul:");
        int idUser=0;
        while (true) {
            try {
                idUser = Integer.parseInt(reader.nextLine());
                System.out.println("id: " + idUser);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }


        System.out.println("Dati username-ul:");
        String username=reader.nextLine();
        System.out.println("Dati parola:");
        String password=reader.nextLine();
        System.out.println("Dati emailul:");
        String email=reader.nextLine();
        System.out.println("Dati prenumele:");
        String firstName=reader.nextLine();
        System.out.println("Dati numele:");
        String lastName=reader.nextLine();
        System.out.println("Dati numarul de telefon:");
        String phone=reader.nextLine();
        System.out.println("Dati adresa");
        String address=reader.nextLine();

        Customer client_nou= new Customer(idUser,username,password,email,firstName,lastName,phone,address,new Cart());
        customers.add(client_nou);

    }

    public static void displayCustomer(){
        for(Customer customer:customers){
            System.out.println(customer);
            System.out.println();
        }
    }
    public static void addProduct(){
        Scanner scanner = new Scanner(System.in);


        System.out.println();
        System.out.println("Dati id-ul:");
        int id=0;
        while (true) {
            try {
                id= Integer.parseInt(scanner.nextLine());
                System.out.println("id: " + id);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        System.out.println("Dati numele produsului:");
        String name=scanner.nextLine();
        System.out.println("Dati descriera produsului:");
        String description=scanner.nextLine();
        System.out.println("Dati pretul produsului:");
        Double price=1.0;
        while (true) {
            try {
                price= parseDouble(scanner.nextLine());
                System.out.println("price: " + price);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        System.out.println("Este disponibil produsul? Selectati'true' sau 'false':");
        Boolean disponibility= Boolean.valueOf(scanner.nextLine());
        System.out.println("Dati cantitatea produsului:");
        Integer quantity=Integer.parseInt(scanner.nextLine());
        System.out.println("Dati numele categoriei:");
        String name_category=scanner.nextLine();
        Category category = null;
        for (Category c : categories) {
            if (c.getName().equalsIgnoreCase(name_category)) {
                category = c;
                break;
            }
        }
        if (category == null) {
            System.out.println("Categoria nu a fost gasita.");

        }
        Product product_nou= new Product(id,name,description,price,disponibility,quantity,category,new ArrayList<Rating>());
        products.add(product_nou);



    }

    public static void displayProduct() {
        for (Product product : products) {
            System.out.println(product);
            System.out.println();
        }
    }



    public static void addRating(){
        Scanner reader = new Scanner(System.in);
        System.out.println();


        System.out.println("Scrieti un comentariu");
        String comment=reader.nextLine();
        System.out.println("Dati numarul de stelute:");
        int nr=0;
        while (true) {
            try {
                nr = Integer.parseInt(reader.nextLine());
                System.out.println("nr_stelute: " + nr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        System.out.println("Dati numele dumneavoastra");
        String name_customer=reader.nextLine();
        Customer customer = null;
        for (Customer c1 : customers) {
            if (c1.getLastName().equalsIgnoreCase(name_customer)) {
                customer = c1;
                break;
            }
        }
        if (customer == null) {
            System.out.println("Clientul nu a fost gasit.");

        }
        System.out.println("Dati titlul produsului");
        String name_product=reader.nextLine();
        Product product = null;
        for (Product pr : products) {
            if (pr.getName().equalsIgnoreCase(name_product)) {
                product = pr;
                break;
            }
        }
        if (product == null) {
            System.out.println("Produsul nu a fost gasit.");
        }

        Rating rating_nou=new Rating(nr,comment,customer);
        product.addRatingProduct(rating_nou);
        ratings.add(rating_nou);
    }

    public static void addProductCart(){
        Scanner reader = new Scanner(System.in);
        System.out.println();

        System.out.println("Dati numele dumneavoastra");
        String name_customer=reader.nextLine();
        Customer customer = null;
        for (Customer c1 : customers) {
            if (c1.getLastName().equalsIgnoreCase(name_customer)) {
                customer = c1;
                break;
            }
        }
        if (customer == null) {
            System.out.println("Clientul nu a fost gasit.");

        }
        System.out.println("Dati titlul produsului");
        String name_product=reader.nextLine();
        Product product = null;
        for (Product pr : products) {
            if (pr.getName().equalsIgnoreCase(name_product)) {
                product = pr;
                break;
            }
        }
        if (product == null) {
            System.out.println("Produsul nu a fost gasit.");
        }

//        Cart cart = customer.getCart().adaugareProdus(product);
    }



//
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    public void removeProduct(Product product) {
//        products.remove(product);
//    }
//
//    public void addCustomer(Customer customer) {
//        customers.add(customer);
//    }
//
//
//
//    public void removeCustomer(Customer customer) {
//        customers.remove(customer);
//    }
//    public void addAdmin(Admin admin){admins.add(admin);}
//    public void removeAdmin(Admin admin){admins.remove(admin);}



/*
    public ArrayList<Product> getProductsByCategory(String categoryName) {
        ArrayList<Product> productsByCategory = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equals(categoryName)) {
                productsByCategory.add(product);
            }
        }
        return productsByCategory;
    }


    public void displayAllProducts() {
        for (Product product : products) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }
    }

    public void displayAllCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer.getUserName() + " - " + customer.getEmail());
        }
    }

    public void displayAllAdmins() {
        for (Admin admin : admins) {
            System.out.println(admin.getUserName() + " - " + admin.getEmail());
        }
    }*/


}
