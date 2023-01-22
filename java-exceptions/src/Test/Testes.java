package Test;

import java.util.Arrays;

public class Testes {
    public static void main(String[] args) {
        int[] n = {1, 2, 2};
        System.out.println(metodo1(n));
    }

    public static int metodo1(int[] n) {
        int result = 0;
        for (int number: n) {
            result += number*number;
        };
        return result;
    }
}
