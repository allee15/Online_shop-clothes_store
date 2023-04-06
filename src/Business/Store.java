package Business;

import model.*;

import java.util.*;
import java.text.SimpleDateFormat;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.*;
import static java.lang.Integer.parseInt;


public class Store {
    public static List<Product> products=new ArrayList<>();
    public static List<Customer> customers=new ArrayList<>();
    public static List<Admin> admins=new ArrayList<>();
    public static List<Category> categories=new ArrayList<>();

    public static List<Coupon> coupons=new ArrayList<>();

    public static List<Rating>  ratings=new ArrayList<>();
    public static List<Shipping> shippings=new ArrayList<>();
    public static List<Order> orders=new ArrayList<>();

    public static List<Cart> itemsCarts=new ArrayList<>();
    public static void initializare(){
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


        Coupon coupon1=new Coupon("012345",20.0, true);
        coupons.add(coupon1);


    }

    public static void addCategory(){
            Scanner scanner = new Scanner(System.in);
            System.out.println();
             System.out.println("Dati id-ul categoriei:");
             int idCateg=0;
             while (true) {
                 try {
                idCateg = Integer.parseInt(scanner.nextLine());
                System.out.println("id: " + idCateg);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

            System.out.println("Dati numele categoriei");
            String name=scanner.nextLine();
            System.out.println("Dati descrierea categoriei");
            String description=scanner.nextLine();
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
            Scanner scanner=new Scanner(System.in);
            System.out.println();
            System.out.println("Dati id-ul adminului:");
            int id=0;
             while (true) {
              try {
                  id = Integer.parseInt(scanner.nextLine());
                  System.out.println("id: " + id);
                  break;
              } catch (NumberFormatException e) {
                  System.out.println("Invalid input. Please enter an integer.");
              }
          }

        System.out.println("Dati username-ul adminului:");
        String username=scanner.nextLine();
        System.out.println("Dati parola adminului:");
        String password=scanner.nextLine();
        System.out.println("Dati emailul adminului:");
        String email=scanner.nextLine();
        System.out.println("Dati prenumele adminului:");
        String firstName=scanner.nextLine();
        System.out.println("Dati numele de familie al adminului:");
        String lastName=scanner.nextLine();
        System.out.println("Dati rolul adminului:");
        String role=scanner.nextLine();
        System.out.println("Dati statusul adminului:");
        String status=scanner.nextLine();
        Admin admin_nou= new Admin(id,username,password,email,firstName,lastName,role,status);
        admins.add(admin_nou);
    }
    public static void displayAdmin(){
        for(Admin admin:admins){
            System.out.println(admin);
            System.out.println();
        }
    }


    public static void addShipping(){
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        System.out.println("Dati id-ul shippingului:");
        int idShipping=0;
        while (true) {
            try {
                idShipping = Integer.parseInt(scanner.nextLine());
                System.out.println("id: " + idShipping);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

        System.out.println("Dati orasul in care se doreste livrarea:");
        String city=scanner.nextLine();
        System.out.println("Dati tara in care se doreste livrarea:");
        String country=scanner.nextLine();
        System.out.println("Dati adresa locuintei:");
        String address=scanner.nextLine();
        System.out.println("Dati adresa postala:");
        String postalCode=scanner.nextLine();

        Shipping shipping_nou=new Shipping(idShipping,city,country,address,postalCode);
        shippings.add(shipping_nou);

    }

    public static void displayShipping(){
        for(Shipping shipping:shippings){
            System.out.println(shipping);
            System.out.println();
        }
    }


    public static void addOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Dati id-ul comenzii:");
        int idOrder=0;
        while (true) {
            try {
                idOrder = Integer.parseInt(scanner.nextLine());
                System.out.println("id: " + idOrder);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }


        System.out.println("Dati numele dumneavoastra");
        String name_customer=scanner.nextLine();
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

        System.out.println("Dati metoda de plata:");
        String metoda_plata=scanner.nextLine();

        System.out.println("Dati data de livrare in acest format: 'dd/MM/yyyy");
        String data1=scanner.nextLine();

        Date dataLivrare = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dataLivrare = dateFormat.parse(data1);
        }catch(Exception e){
            System.out.println("Ati oferit o data gresita");
        }
//        31/12/2022

        System.out.println("Dati id-ul shippingului:");
        int idShipping1=0;
        while (true) {
            try {
                idShipping1 = Integer.parseInt(scanner.nextLine());
                System.out.println("id: " + idShipping1);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        Shipping shipping1 = null;
        for (Shipping s1 : shippings) {
            if (s1.getIdShipping()==idShipping1) {
                shipping1 = s1;
                break;
            }
        }


        Cart cart=customer.getCart();
        List<Product> produse=cart.getProducts();
        Order order=new Order(idOrder,metoda_plata,shipping1,dataLivrare,produse);
//        customer.adaugareComanda(order);
        orders.add(order);

    }

    public static void displayOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Dati id-ul comenzii:");
        int idOrder=0;
        while (true) {
            try {
                idOrder = Integer.parseInt(scanner.nextLine());
                System.out.println("id: " + idOrder);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        Order order1 = null;
        for (Order o1 : orders) {
            if (o1.getIdOrder()==idOrder) {
                order1 = o1;
                break;
            }
        }
        System.out.println(order1);

    }

    public static void addCustomer(){
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Dati id-ul:");
        int idUser=0;
        while (true) {
            try {
                idUser = Integer.parseInt(scanner.nextLine());
                System.out.println("id: " + idUser);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }


        System.out.println("Dati username-ul:");
        String username=scanner.nextLine();
        System.out.println("Dati parola:");
        String password=scanner.nextLine();
        System.out.println("Dati emailul:");
        String email=scanner.nextLine();
        System.out.println("Dati prenumele:");
        String firstName=scanner.nextLine();
        System.out.println("Dati numele:");
        String lastName=scanner.nextLine();
        System.out.println("Dati numarul de telefon:");
        String phone=scanner.nextLine();
        System.out.println("Dati adresa");
        String address=scanner.nextLine();

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
        Product product_nou= new Product(id,name,description,price,disponibility,quantity,category,new HashSet<Rating>());
        products.add(product_nou);



    }

    public static void displayProduct() {
        productSortare();
        for (Product product : products) {
            System.out.println(product);
            System.out.println();
        }
    }



    public static void addRating(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();


        System.out.println("Scrieti un comentariu");
        String comment=scanner.nextLine();
        System.out.println("Dati numarul de stelute:");
        int nr=0;
        while (true) {
            try {
                nr = Integer.parseInt(scanner.nextLine());
                System.out.println("nr_stelute: " + nr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        System.out.println("Dati numele dumneavoastra");
        String name_customer=scanner.nextLine();
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
        String name_product=scanner.nextLine();
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
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        System.out.println("Dati numele dumneavoastra");
        String name_customer=scanner.nextLine();
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
        String name_product=scanner.nextLine();
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

        Cart cart=customer.getCart();
        cart.adaugareProdus(product);

    }

    public static void deleteProductCart(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        System.out.println("Dati numele dumneavoastra");
        String name_customer=scanner.nextLine();
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
        String name_product=scanner.nextLine();
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

        Cart cart=customer.getCart();
        cart.stergeProdus(product);

    }

    public static void addCoupon(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        System.out.println("Dati numele dumneavoastra");
        String name_customer=scanner.nextLine();
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

        System.out.println("Dati codul cuponului:");
        String code=scanner.nextLine();
        System.out.println("Este valid cuponul?Selectati:'true' sau 'false'");
        Boolean valid= Boolean.valueOf(scanner.nextLine());
        System.out.println("Dati procentul de reducere al cuponului");

        Double percentage=1.0;
        while (true) {
            try {
                percentage= parseDouble(scanner.nextLine());
                System.out.println("percentage: " + percentage);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }


        Coupon cupon_nou= new Coupon(code,percentage,valid);
        coupons.add(cupon_nou);
        Cart cart=customer.getCart();
        cart.adaugareCoupon(cupon_nou);



    }

    public static void AplicareReducere(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        System.out.println("Dati numele dumneavoastra");
        String name_customer=scanner.nextLine();
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


        Cart cart=customer.getCart();

        Double suma = cart.Total(cart.getProducts(),cart.getCoupons());

        System.out.println("Totalul dupa aplicarea reducerilor este de: "+suma);


    }



    public static void displayCart(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        System.out.println("Dati numele dumneavoastra");
        String name_customer=scanner.nextLine();
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
        Cart cart=customer.getCart();
        System.out.println(cart);
    }
    public static void productSortare(){
        Collections.sort(products, new ProductFilter());
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
