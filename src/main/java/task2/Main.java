package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> findNPerfectNumbers(int n) {
        List<Integer> perfectNumbers = new ArrayList<>();
        int number = 1;

        while (perfectNumbers.size() < n) {
            if(isPerfect(number)) {
                perfectNumbers.add(number);;
            }
            number++;
        }
        return perfectNumbers;
    }

    private static boolean isPerfect(int n) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i < n; i++){
            if(n % i == 0) {
                divisors.add(i);
            }
        }
        Integer divisorsSum = divisors.stream().reduce(0, Integer::sum) ;

        return n == divisorsSum;
    }

    public static void main(String[] args) {
        System.out.println(findNPerfectNumbers(4));
    }
}
