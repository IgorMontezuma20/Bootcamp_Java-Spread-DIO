package br.com.dio.praticando.loops;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num;
        int mult = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja o fatorial de qual número? ");
        num = sc.nextInt();

        System.out.print(num+"! = ");
        for (int i = num; i >= 1; i--) {
            mult = mult * i;
        }
        System.out.println(mult);
    }
}
