
/**
 * Source: Beecrowd
 * @problem: 1002 - Area of a Circle
 * @subject: Sequential
 * 
 * @author: Letícia Cruz
 * @date: 2025-05-01
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        final double pi = 3.14159;
        double raio = sc.nextDouble();
        double area = pi * raio * raio;

        System.out.printf("A=%.4f\n", area);

        sc.close();

    }
}