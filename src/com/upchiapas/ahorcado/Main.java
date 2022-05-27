package com.upchiapas.ahorcado;

import com.upchiapas.ahorcado.models.Juego;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Juego ahorcado = new Juego((byte)3,"manzana");
        Scanner teclado = new Scanner(System.in);
        while (ahorcado.isLive() ){
            System.out.print("\nLetra: ");
            if (ahorcado.buscarLetra(teclado.nextLine().charAt(0))){
                for (char letra : ahorcado.getAux()){
                    if (letra != '\0')
                        System.out.print(letra);
                    else
                        System.out.print(" _ ");
                }
            }
            else
                System.out.println("La letra no se encontró \n Número de vidas: " + ahorcado.getNumeroVidas());
        }

    }
}
