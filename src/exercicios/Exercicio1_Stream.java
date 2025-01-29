package exercicios;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Exercicio1_Stream {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o caminho do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(";");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double average = list.stream().map(p -> p.getPrice()).reduce(0.0, (x,y) -> x + y) / list.size();

            System.out.printf("Preço médio: R$%.2f", average);
            System.out.println();

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream().filter(p -> p.getPrice() < average)
                    .map(p -> p.getName()).sorted(comp.reversed()).collect(Collectors.toList()); //toList

            names.forEach(System.out::println);

        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();

    }

}
