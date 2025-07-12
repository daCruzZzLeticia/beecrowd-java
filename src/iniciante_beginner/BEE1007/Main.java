/**
 * Source: Beecrowd
 * @problem: 1007 - Difference
 * @subject: Sequential
 * 
 * @author: Letícia Cruz
 * @date: 2025-07-02
 */

package iniciante_beginner.BEE1007;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int diferenca = (a * b - c * d);

        System.out.println("DIFERENCA = " + diferenca);

        scanner.close();

    }
}