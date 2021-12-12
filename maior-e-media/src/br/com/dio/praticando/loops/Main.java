package br.com.dio.praticando.loops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int val;
        int soma = 0;
        int maior = 0;
        //int media = (soma) / 5;

        for (int i=0;i < 5; i++){
            System.out.println("Informe um valor");
            val = sc.nextInt();

            soma = soma + val;
            if(val > maior) maior = val;
        }
        System.out.println("Média: "+(soma/5));
        System.out.println("O maior valor foi: "+maior);

    }
}
//val <= 5 && val2 <= 5 && val3 <= 5 && val4 <=5 && val5 <= 5
