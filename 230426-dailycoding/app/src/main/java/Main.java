import org.checkerframework.checker.units.qual.C;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.next();
        Integer[] array = new Integer[numbers.length()];

        for (int i = 0; i < numbers.length(); i += 1) {
            array[i] = Integer.parseInt(numbers.substring(i, i + 1));
        }

        Arrays.sort(array, ((o1, o2) -> o2 - o1));

        for (int i = 0; i < numbers.length(); i += 1) {
            System.out.println(array[i]);
        }
    }
}
