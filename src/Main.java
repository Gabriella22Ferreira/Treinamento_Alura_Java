public class Main {
    public static void main (String[] args){

        System.out.println("Esse é o Filmes ON");

        int anoDeLancamento = 2003;


        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String nomeDoFIlme = "Kill Bill: Volume 1";

        double media = (9.8 + 6.3 + 8.0) / 3;


        String sinopse;
        sinopse = """
                Filme: %s
                Filme de vingança com loira bonita!
                Muito Bom!
                Média: %.2f
                Nota do Filme: %.2f
                Ano de lançamento: %d   
                """ .formatted(nomeDoFIlme, media,notaDoFilme, anoDeLancamento) ;
        System.out.println(sinopse);



        //conversão de dado - ele ta usando Casting q é um recurso utilizado em Java para converter um tipo de dado em outro.
        //O casting é utilizado para permitir que tipos de dados incompatíveis possam ser utilizados em uma mesma operação ou expressão.
        int classificacao;
        classificacao =  (int) (media / 2);
        System.out.println(classificacao);
    }
}
