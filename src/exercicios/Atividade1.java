package exercicios;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[1], fields[0], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            List<String> emails = list.stream().filter(x -> x.getSalary() > salary).map(Employee::getEmail).sorted().toList();

            System.out.printf("Email of people whose salary is more than R$%.2f: ", salary);
            System.out.println();
            emails.forEach(System.out::println);

            double sum = list.stream().filter(x -> x.getName().charAt(0) =='M').map(Employee::getSalary).reduce(0.0, Double::sum);
            System.out.printf("Sum of salary from people whose name starts with 'M': %.2f", sum);

        } catch( IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();

    }

}
