import org.w3c.dom.ranges.Range;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void roundCheck

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tente adivinhar o número aleatório!  (1 - 20)" +
                "\nPara parar digite '0'");
        while (true) {
            System.out.print(" Seu número: ");
            int num = scanner.nextInt();
            int randNum = random.nextInt(19) + 1;

            System.out.println(" Meu número: " + randNum);
            if (num == randNum) {
                System.out.println("Acertou! Ganha 10 pontos!");
            } else if (num == randNum + 1 || num == randNum - 1) {
                System.out.println("Por pouco! Ganha 5 pontos");
            } else {
                System.out.println("Não acertou. Tente novamente");
            }
        }
    }
}
