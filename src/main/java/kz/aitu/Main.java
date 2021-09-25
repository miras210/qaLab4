package kz.aitu;

import org.junit.Before;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int i = sc.nextInt();
        System.out.println("Enter the second number");
        int j = sc.nextInt();
        System.out.println("Enter the operation: +, -, /, or *");
        String c = sc.next();
        try {
            calculate(i, j, c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void calculate(int i, int j, String c) throws Exception {
        switch (c) {
            case "+":
                System.out.println(getSum(i, j));
                break;
            case "-":
                System.out.println(getDiff(i, j));
                break;
            case "/":
                System.out.println(getDiv(i, j));
                break;
            case "*":
                System.out.println(getMult(i, j));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    public static int getSum(int i, int j) {
        return i + j;
    }

    public static int getDiff(int i, int j) {
        return i - j;
    }

    public static double getDiv(int i, int j) throws Exception {
        if (j == 0) throw new Exception("Error: can not divide to zero");
        return 1.0 * i / j;
    }

    public static int getMult(int i, int j) {
        return i * j;
    }
}
