package br.com.dio.praticando.loops;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] consoantes = new String[6];

        int quantConsoantes = 0;
        int cont = 0;

        do{
            System.out.println("Digite uma letra: ");
            String letra = sc.nextLine();

            if(!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e")||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))){

                    consoantes[cont] = letra;
                    quantConsoantes++;
            }
            cont++;
        }while(cont < consoantes.length);

        System.out.println("Consoantes: ");
        for ( String consoante : consoantes) {
            if(consoante != null) {
                System.out.println(consoante);
            }
        }
        System.out.println("Quantidade de consoantes: "+quantConsoantes);
    }
}
