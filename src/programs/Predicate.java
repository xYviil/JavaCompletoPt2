package programs;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Predicate {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        //double min = 100;
        //Predicate<Product> pred = p -> p.getPrice() >= 100.0;  <- PODE SUBSTITUIR POR "MIN".
        //list.removeIf(pred);

        list.removeIf(new ProductPredicate());

        for (Product p : list) {
            System.out.println(p);
        }

    }

}
