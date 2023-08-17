package Seminar1;

import java.util.Scanner;

//Необходимо написать алгоритм, считающий сумму всех чисел
//от 1 до N.
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = getSum(n);
        System.out.println("sum = " + sum);
    }

    private static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
