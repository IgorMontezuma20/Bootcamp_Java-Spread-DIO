package br.com.dio.praticando.loops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num = 0;
        Scanner sc = new Scanner(System.in);

        while(num <=10){
            System.out.println("Escolha um numero de 0 até de e digite-o: ");
            num = sc.nextInt();
            System.out.println("Você diditou o número: "+num);
            if(num !=10){
                System.out.println("O valor é diferente de 10.\nPrograma encerrando...");
            }
        }
        sc.close();
    }
}
