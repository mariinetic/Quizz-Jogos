import java.util.Scanner;

public class GameQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Quiz de Jogos de Terror!");
        System.out.println("Responda às perguntas para descobrir se você é mais parecido com Silent Hill ou Resident Evil.");

        int scoreSilentHill = 0;
        int scoreResidentEvil = 0;

        System.out.println("Pergunta 1: Você prefere um ambiente mais psicológico e misterioso ou mais de ação e sobrevivência?");
        System.out.println("1. Psicológico e misterioso");
        System.out.println("2. Ação e sobrevivência");
        int answer1 = scanner.nextInt();
        if (answer1 == 1) {
            scoreSilentHill++;
        } else if (answer1 == 2) {
            scoreResidentEvil++;
        }

        System.out.println("Pergunta 2: Você gosta mais de resolver enigmas complexos ou enfrentar hordas de inimigos?");
        System.out.println("1. Resolver enigmas complexos");
        System.out.println("2. Enfrentar hordas de inimigos");
        int answer2 = scanner.nextInt();
        if (answer2 == 1) {
            scoreSilentHill++;
        } else if (answer2 == 2) {
            scoreResidentEvil++;
        }

        System.out.println("Pergunta 3: Você prefere uma narrativa mais psicológica e perturbadora ou uma narrativa mais voltada para a ação e sobrevivência?");
        System.out.println("1. Psicológica e perturbadora");
        System.out.println("2. Ação e sobrevivência");
        int answer3 = scanner.nextInt();
        if (answer3 == 1) {
            scoreSilentHill++;
        } else if (answer3 == 2) {
            scoreResidentEvil++;
        }

        System.out.println("Resultados:");
        if (scoreSilentHill > scoreResidentEvil) {
            System.out.println("Você é mais parecido com Silent Hill!");
        } else if (scoreResidentEvil > scoreSilentHill) {
            System.out.println("Você é mais parecido com Resident Evil!");
        } else {
            System.out.println("Você tem um equilíbrio entre Silent Hill e Resident Evil!");
        }

        scanner.close();
    }
}
