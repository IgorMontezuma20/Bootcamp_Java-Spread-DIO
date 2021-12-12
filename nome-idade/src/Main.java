import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idade, opc=1;
        String nome = " ";
        Scanner sc = new Scanner(System.in);

        while (opc == 1) {
            System.out.println("Informe seu nome: ");
            nome = sc.nextLine();

            System.out.println("Informe sua idade: ");
            idade = sc.nextInt();
            System.out.println("\n");

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade+"\n\n");

            System.out.print("Deseja efetuar o processo novamente? \n");
            opc = sc.nextInt();

            sc.close();
        }
    }
}
