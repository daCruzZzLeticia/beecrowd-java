package iniciante_beginner.BEE1003;

/**
 * Source: Beecrowd
 * @problem: 1003 - Simple Sum
 * @subject: Sequential
 * 
 * @author: Letícia Cruz
 * @date: 2025-04-18
 */

import java.io.IOException; // uso padrão do beecrowd para java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        // Lê entrada, declara váriáveis e atribui valores
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int SOMA = A + B; // calcula soma

        System.out.println("SOMA = " + SOMA); // imprime soma

        sc.close();

    }
}
