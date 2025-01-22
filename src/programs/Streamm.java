package programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamm {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10); // aplica uma função a cada elemento da stream
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(1, x -> x + 2); // seed é o 1 elemento
        System.out.println(Arrays.toString(st3.limit(10).toArray())); // dá um fim ao processamento

        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]); // Sequência de Fibonacci
        System.out.println(Arrays.toString(st4.limit(25).toArray()));
    }
}
