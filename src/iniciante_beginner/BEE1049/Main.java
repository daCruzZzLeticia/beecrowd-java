/**
 * Source: Beecrowd
 * @problem: 1049 - Animal
 * @subject: Selection
 * 
 * @author: Letícia Cruz
 * @date: 2025-05-11
 */

package iniciante_beginner.BEE1049;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String categoria1 = sc.nextLine();
        String categoria2 = sc.nextLine();
        String categoria3 = sc.nextLine();

        if (categoria1.equals("vertebrado")) {
            if (categoria2.equals("ave")) {
                if (categoria3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (categoria3.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if (categoria2.equals("inseto")) {
                if (categoria3.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (categoria3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }

        sc.close();

    }

}