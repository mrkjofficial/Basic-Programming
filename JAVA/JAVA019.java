/* 19. Program to print table of user’s choice */

import java.util.Scanner;

public class JAVA019 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its table: ");
        num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%02d x %02d = %02d", num, i, num * i));
        }
    }
}