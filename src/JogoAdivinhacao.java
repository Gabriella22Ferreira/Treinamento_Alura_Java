import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tentativas = 5;

        Random  random= new Random(100); // gera um número aleatório em Java
        int numAleatorio = random.nextInt(1, 100);

        System.out.println(" Você tem " + tentativas + " tentativas. Boa sorte!");
        for (int contador = 1; contador <=5; contador ++) {

            System.out.println("Tente adivinhar o número: ");
            int resposta = leitor.nextInt();

            if (resposta == numAleatorio){
                System.out.println("Parabéns, você acertou o número!");

                break;
            }
            else {
                tentativas -= 1;
                System.out.println("Tente novamente, Você tem mais " + tentativas + " tentativas. ");
                if (tentativas == 0){
                    System.out.println("Você não conseguiu... Quem sabe na proxíma :(");
                }
            }
        }
    }
}