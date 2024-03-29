/* 38. Program to print a number with a summation of 2 prime numbers */

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class JAVA038 {
    public static void main(String[] args) {
        int n;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number to represent it with a pair of prime numbers: ");
            n = sc.nextInt();
            if (n > 0 && n < 100) {
                for (int i = 2; i <= (n - i); i = nextPrime(i)) {
                    if (isPrime(n - i)) {
                        System.out.println(i + " + " + (n - i) + " = " + n);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println(n + " can't be represented with a pair of 2 prime numbers!");
                }
                sc.close();
                System.exit(0);
            } else {
                System.out.println("Please enter a value from 1 to 99!");
            }
        }
    }

    public static boolean isPrime(int n) {
        boolean flag = n == 1 ? false : true;
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
            }
        }
        return flag;
    }

    public static int nextPrime(int n) {
        while (true) {
            n++;
            if (isPrime(n)) {
                break;
            }
        }
        return n;
    }
}