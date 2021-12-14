package br.com.dio.praticando.loops;

public class Main {

    public static void main(String[] args) {

        int[] vetor = {0, 1, 2, 3, 4, 5};
        int cont = 0;

        System.out.println("Valores do Vetor: ");
        while(cont < (vetor.length)){
            System.out.println("["+vetor[cont]+"]");
            cont++;
        }

        System.out.println("\nVetor Inverso: ");
        for (int i = vetor.length-1; i >= 0; i--){
            System.out.println("["+vetor[i]+"]");
        }
    }
}
