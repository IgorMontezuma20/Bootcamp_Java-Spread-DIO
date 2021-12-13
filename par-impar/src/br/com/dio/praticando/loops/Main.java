package br.com.dio.praticando.loops;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantNum;
        int numero;
        int quantPares=0;
        int quantImpares=0;

        System.out.println("Deseja inserir quantos números? ");
        quantNum = sc.nextInt();

        for (int i = 0; i < quantNum; i++) {
            System.out.println("Número: ");
            numero = sc.nextInt();
            if((numero % 2) == 0){
                quantPares++;
            }else{
                quantImpares++;
            }
        }
        System.out.println("Pares: "+quantPares);
        System.out.println("Impares: "+quantImpares);
    }
}
