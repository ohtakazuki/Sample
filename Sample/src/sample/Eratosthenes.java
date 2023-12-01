package sample;

import java.util.ArrayList;
import java.util.List;

public class Eratosthenes {

    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<Integer>();

        for (int i = 1; i <= 100; i++) {
            if ((i == 2 || i == 3 || i == 5 || i == 7) || i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                primeNumbers.add(i);
            }
        }

        primeNumbers.forEach((primeNumber) -> System.out.print(primeNumber + ", "));
    }

}
