import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int score = 0, bound;

        System.out.println("_____Tente Adivinhar o Número Aleatório_____");
        System.out.println("Escolha a Dificuldade: \n" +
                "1 -> (1 - 5)\n" +
                "2 -> (1 - 10)\n" +
                "3 -> (1 - 20)");
        int difficulty = scanner.nextInt();

        switch (difficulty) {
            case 1:
                bound = 4;
                break;
            case 2:
                bound = 9;
                break;
            case 3:
                bound = 19;
                break;
            default:
                System.out.println("Opção Inválida!");
                return;
        }

        System.out.println("Para parar digite '0'");

        while (true) {
            System.out.print(" Seu número: ");
            int num = scanner.nextInt();
            if (num == 0) break;

            int randNum = random.nextInt(bound) + 1;

            System.out.println(" Meu número: " + randNum);
            if (num == randNum) {
                System.out.print("Acertou! Ganha 10 pontos!   ");
                score += 10;
            } else if (num == randNum + 1 || num == randNum - 1) {
                System.out.print("Por pouco! Ganha 5 pontos.  ");
                score += 5;
            } else {
                System.out.print("Não acertou. Tente novamente");
            }

            System.out.println("        Seus pontos: " + score);
        }
    }
}
