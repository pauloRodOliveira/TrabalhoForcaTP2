package classesTestes;

import classes.ControladorDeLetrasJaDigitadas;


class ControladorDeLetrasJaDigitadasTest {
    public static void main(String[] args) {
        // teste1

        try{
            System.out.println("\nTeste 1, registre");
            ControladorDeLetrasJaDigitadas teste1 = new ControladorDeLetrasJaDigitadas();
            teste1.registre('a');
            teste1.registre('a');
            System.out.println("Sucesso no método registre");
        }catch(Exception erro){
            System.err.println("Falha no método registre, erro: " + erro);
        }

        // teste2
        try{
            System.out.println("\nTeste 2, isDigitada");
            ControladorDeLetrasJaDigitadas teste2 = new ControladorDeLetrasJaDigitadas();
            teste2.registre('a');
            System.out.println(teste2.isJaDigitada('a'));
        }catch(Exception erro){
            System.err.println("Falha no método isDigitada, erro: " + erro);
        }

        //teste3
        try{
            System.out.println("\nTeste 3, ToString");
            ControladorDeLetrasJaDigitadas teste3 = new ControladorDeLetrasJaDigitadas();
            teste3.registre('f');
            teste3.registre('o');
            teste3.registre('r');
            teste3.registre('c');
            teste3.registre('a');
            System.out.println(teste3);
        }catch(Exception erro){
            System.err.println("Falha no método toString, erro: " + erro);
        }

        /*

        try{
            System.out.println("\nTeste 1");
            ControladorDeLetrasJaDigitadas teste = new ControladorDeLetrasJaDigitadas();
        }catch(Exception erro){
            System.err.println("Falha no método, erro: " + erro);
        }*/
    }
}