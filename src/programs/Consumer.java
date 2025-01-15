package programs;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;

public class Consumer {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        list.forEach(new PriceUpdate());

        //double factor = 1.1
        // list.forEach(p -> p.setPrice((p.getPrice() * factor )));

        list.forEach(System.out::println);
        }
    }

