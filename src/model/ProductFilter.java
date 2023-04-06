package model;

public class ProductFilter implements java.util.Comparator<Product> {
    @Override
    public int compare(Product p1,Product p2){
        return p1.getName().compareTo(p2.getName());
    }

}
