package br.com.dio.praticando.loops;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numAleatorios = new int[20];

        for (int i = 0; i < numAleatorios.length;i++){
            int num = random.nextInt(100);
            numAleatorios[i] = num;
        }
        System.out.print("Números Aleaatórios: ");
        for (int numero : numAleatorios ) {
            System.out.print(numero+ " ");
        }
        System.out.print("\nNúmeros Sucessores dos Aleatórios: ");
        for (int numero : numAleatorios ) {
            System.out.print((numero+1)+ " ");
        }
    }
}
