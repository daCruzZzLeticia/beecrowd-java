/**
 * Source: Beecrowd
 * @problem: 1005 - Average 1
 * @subject: Sequential
 * 
 * @author: Letícia Cruz
 * @date: 2025-05-02
 */

package iniciante_beginner.BEE1005;

import java.io.IOException; // uso padrão do beecrowd para java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        // Lê entrada, declara váriáveis e atribui valores
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        // Cálculo da media: multiplica peso com nota correpondente e divide tudo pela
        // soma dos pesos
        double MEDIA = (A * 3.5 + B * 7.5) / 11;

        System.out.printf("MEDIA = %.5f\n", MEDIA); // imprime média com 5 casas decimais

        sc.close();
    }
}