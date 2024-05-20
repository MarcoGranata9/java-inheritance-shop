package org.learning.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti prodotti vuoi inserire?");
        int arrayL;
        arrayL = Integer.parseInt(scanner.nextLine());
        Product[] cart = new Product[arrayL];

        for (int i = 0; i < cart.length; i++) {
            System.out.println("Che tipo di prodotto vuoi inserire?");
            System.out.println("1 Smartphone");
            System.out.println("2 Televisione");
            System.out.println("3 Cuffie");
            int prodType;

            prodType = Integer.parseInt(scanner.nextLine());

            switch (prodType) {
                case 1:
                    System.out.println("Inserisci il nome dello smartphone");
                    String name = scanner.nextLine();
                    System.out.println("Inserisci la descrizione dello smartphone");
                    String desc = scanner.nextLine();
                    System.out.println("Inserisci il prezzo dello smartphone");
                    String price = scanner.nextLine();
                    System.out.println("Inserisci la memoria dello smartphone");
                    String storage = scanner.nextLine();

                    Smartphone s = new Smartphone(name, desc, price, storage);
                    cart[i] = s;
                    break;
                case 2:
                    System.out.println("Inserisci il nome del televisore");
                    String name2 = scanner.nextLine();
                    System.out.println("Inserisci la descrizione del televisore");
                    String desc2 = scanner.nextLine();
                    System.out.println("Inserisci il prezzo del televisore");
                    String price2 = scanner.nextLine();
                    System.out.println("Inserisci l' altezza del televisore");
                    int height = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci la larghezza del televisore");
                    int width = Integer.parseInt(scanner.nextLine());
                    System.out.println("Il televisore è smart? s/n");
                    boolean smart;
                    if (scanner.nextLine().equals("s")) {
                        smart = true;
                    } else if (scanner.nextLine().equals("n")) {
                        smart = false;
                    } else {
                        smart = false;
                    }
                    Television t = new Television(name2, desc2, price2, height, width, smart);
                    cart[i] = t;

                    System.out.println(t.smart);
                    break;
                case 3:
                    System.out.println("Inserisci il nome delle cuffie");
                    String name3 = scanner.nextLine();
                    System.out.println("Inserisci la descrizione delle cuffie");
                    String desc3 = scanner.nextLine();
                    System.out.println("Inserisci il prezzo delle cuffie");
                    String price3 = scanner.nextLine();
                    System.out.println("Inserisci il colore delle cuffie");
                    String color = scanner.nextLine();
                    System.out.println("Le cuffie sono wireless? s/n");
                    boolean wireless;
                    if (scanner.nextLine().equals("s")) {
                        wireless = true;
                    } else if (scanner.nextLine().equals("n")) {
                        wireless = false;
                    } else {
                        wireless = false;
                    }

                    Headphones h = new Headphones(name3, desc3, price3, color, wireless);
                    cart[i] = h;

                    break;
                default:
                    System.out.println("Tasto errato");
                    break;
            }
        }
        System.out.println(Arrays.toString(cart));
        scanner.close();
    }
}
