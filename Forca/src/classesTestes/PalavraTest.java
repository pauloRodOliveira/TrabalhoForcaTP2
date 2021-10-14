package classesTestes;

import classes.Palavra;
import classes.Teclado;

class PalavraTest {
    public static void main(String[] args){
        // teste 1
        try{
            System.out.println("\nTeste 1");
            Palavra teste1 = new Palavra("FORCA");
            System.out.println(teste1);
            Palavra teste1_2 = new Palavra("");
            System.out.println(teste1_2);
            Palavra teste1_3 = new Palavra(" ");
            System.out.println(teste1_3);
            System.out.println("Sucesso no método: construtor");
        }catch(Exception erro){
            System.err.println("Falha no método: construtor, erro: " + erro);
        }

        /*// teste
        try{
            System.out.println("\nTeste ");
            Palavra teste1 = new Palavra("PAULO");
            System.out.println("Sucesso no método: ");
        }catch(Exception erro){
            System.err.println("Falha no método: , erro: " + erro);
        }*/
    }
}
