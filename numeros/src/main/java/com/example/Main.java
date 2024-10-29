package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int valor       = -1;

        System.out.print("Introduce un número: ");
        valor = Integer.parseInt(lectura.nextLine());
        lectura.close();

        System.out.println("El número " + valor + " es " + ((valor % 2 == 0) ? "par." : "impar."));
    }
}