import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int maioresDeIdade = 0;

        System.out.println("Digite as idades das pessoas.");
        System.out.println("Digite 0 para encerrar.");

        do {
            System.out.print("Idade: ");
            idade = scanner.nextInt();

            if (idade >= 18) {
                maioresDeIdade++;
            }

        } while (idade != 0);

        System.out.println("Quantidade de maiores de idade: " + maioresDeIdade);

        scanner.close();
    }
}


