import java.util.Scanner;

public class DesafioHoraPraticaAlura {
    public static void main (String[] args){

    Scanner leitura = new Scanner(System.in);

    System.out.println("Digite a primeira nota: ");
    double nota1 = leitura.nextDouble();

    System.out.println("Digite a segunda nota: ");
    int nota2 = leitura.nextInt();

    int nota3 = (int) nota1 ;
    System.out.println(nota3);

    double media= (nota1 + nota2)/2;
    System.out.println(media);

    }
}