package org.learning.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
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

            System.out.println("Inserisci il nome del prodotto");
            String name = scanner.nextLine();
            System.out.println("Inserisci la descrizione del prodotto");
            String desc = scanner.nextLine();
            System.out.println("Inserisci il prezzo del prodotto");
            String price = scanner.nextLine();

            switch (prodType) {
                case 1:
                    System.out.println("Inserisci la memoria dello smartphone");
                    String storage = scanner.nextLine();

                    Smartphone s = new Smartphone(name, desc, price, storage);
                    cart[i] = s;
                    break;
                case 2:
                    System.out.println("Inserisci l' altezza del televisore");
                    int height = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci la larghezza del televisore");
                    int width = Integer.parseInt(scanner.nextLine());
                    System.out.println("Il televisore è smart? s/n");
                    boolean smart;
                    String input2 = scanner.nextLine();
                    if (input2.equals("s")) {
                        smart = true;
                    } else if (input2.equals("n")) {
                        smart = false;
                    } else {
                        smart = false;
                    }
                    Television t = new Television(name, desc, price, height, width, smart);
                    cart[i] = t;

                    System.out.println(t.smart);
                    break;
                case 3:
                    System.out.println("Inserisci il colore delle cuffie");
                    String color = scanner.nextLine();
                    System.out.println("Le cuffie sono wireless? s/n");
                    boolean wireless;
                    String input3 = scanner.nextLine();
                    if (input3.equals("s")) {
                        wireless = true;
                    } else if (input3.equals("n")) {
                        wireless = false;
                    } else {
                        wireless = false;
                    }

                    Headphones h = new Headphones(name, desc, price, color, wireless);
                    cart[i] = h;

                    break;
                default:
                    System.out.println("Tasto errato");
                    break;
            }
        }
        System.out.println(Arrays.toString(cart));

        System.out.println("Possiedi una carta fedeltà? s/n");
        String fidelity = scanner.nextLine();
        BigDecimal totPrice = BigDecimal.ZERO;
        if (fidelity.equals("s")) {
            for (int i = 0; i < cart.length; i++) {
                System.out.println(cart[i].getFidelityPrice());
                totPrice = totPrice.add(cart[i].getFidelityPrice());
            }
        } else if (fidelity.equals("n")) {
            for (int i = 0; i < cart.length; i++) {
                System.out.println(cart[i].getFullPrice());
                totPrice = totPrice.add(cart[i].getFullPrice());
            }
        } else {
            System.out.println("Tasto errato");
        }
        System.out.println(totPrice.setScale(2, RoundingMode.HALF_EVEN));
        scanner.close();
    }
}
