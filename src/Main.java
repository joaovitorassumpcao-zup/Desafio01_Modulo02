import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Tente adivinhar o número aleatório!  (1 - 10)  Para parar digite '0'");

        while (true) {
            System.out.print(" Seu número: ");
            int num = scanner.nextInt();
            if (num == 0) break;

            int randNum = random.nextInt(9) + 1;

            System.out.println(" Meu número: " + randNum);
            if (num == randNum) {
                System.out.println("Acertou! Ganha 10 pontos!");
                score += 10;
            } else if (num == randNum + 1 || num == randNum - 1) {
                System.out.println("Por pouco! Ganha 5 pontos");
                score += 5;
            } else {
                System.out.println("Não acertou. Tente novamente");
            }

            System.out.println("Seus pontos: " + score);
        }
    }
}
