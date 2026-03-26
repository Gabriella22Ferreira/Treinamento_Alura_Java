import java.util.Scanner;

public class Loop {
    public  static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

//        for (int i = 0; i < 3; i++) {
//            System.out.println("Diga sua avaliação para o filme: ");
//            nota = leitor.nextDouble();
//            mediaAvaliacao += nota;
//        }


            while (nota != -1) {
                System.out.println("Diga sua avaliação para o filme ou -1 para encerrar ");
                nota = leitor.nextDouble();


                if (nota != -1){
                    mediaAvaliacao += nota;
                    totalDeNotas++;
                }


            }
            System.out.println("O total de notas digitadas foi: " + totalDeNotas);
        }
    }
