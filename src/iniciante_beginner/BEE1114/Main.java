package iniciante_beginner.BEE1114;

/**
 * Source: Beecrowd
 * @problem: 1114 - Fixed Password
 * @subject: Repetition
 * 
 * @author: Letícia Cruz
 * @date: 2025-05-07
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        final int senha = 2002;

        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();

        while (entrada != senha) {
            System.out.println("Senha Invalida");
            entrada = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();

    }
}
