package br.com.dio.praticando.loops;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja a tabuada de qual número? ");
        num = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num+" X "+i+" = "+num*i);
        }sc.close();
    }
}
