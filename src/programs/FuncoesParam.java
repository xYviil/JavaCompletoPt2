package programs;

import entities.Product;
import util.ProductService;

import java.util.ArrayList;
import java.util.List;

public class FuncoesParam {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        ProductService ps = new ProductService();
        double sum = ps.filteredSum(list, product -> product.getPrice() < 100);

        System.out.printf("Sum = %.2f", sum);

    }
}
