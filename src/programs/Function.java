package programs;

import entities.Product;
import util.UppercaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Function {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        //List <String> names = list.stream().map(new UppercaseName()).toList();
        //names.forEach(System.out::println);



    }
}
