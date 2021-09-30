package classesTestes;

import classes.ControladorDeLetrasJaDigitadas;


class ControladorDeLetrasJaDigitadasTest {
    public static void main(String[] args) {
        // teste1

        try{
            System.out.println("\nTeste 1, registre");
            ControladorDeLetrasJaDigitadas teste1 = new ControladorDeLetrasJaDigitadas();
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

        //teste4
        try{
            System.out.println("\nTeste 4, equals");
            ControladorDeLetrasJaDigitadas teste4 = new ControladorDeLetrasJaDigitadas();
            ControladorDeLetrasJaDigitadas teste41 = new ControladorDeLetrasJaDigitadas();

            teste4.registre('a');
            teste41.registre('a');
            System.out.println(teste4.equals(teste41));
            System.out.println("Objeto 1: " + teste4 + " " + "Objeto 2: " + teste41);

            teste4.registre('c');
            teste41.registre('b');
            System.out.println(teste4.equals(teste41));
            System.out.println("Objeto 1: " + teste4 + " " + "Objeto 2: " + teste41);
        }catch(Exception erro){
            System.err.println("Falha no método equals, erro: " + erro);
        }

        // teste5
        try{
            System.out.println("\nTeste 5, clone");
            ControladorDeLetrasJaDigitadas teste5 = new ControladorDeLetrasJaDigitadas();
            teste5.registre('a');
            ControladorDeLetrasJaDigitadas teste51 = (ControladorDeLetrasJaDigitadas) teste5.clone();
            System.out.println(teste51);
            teste51.registre('b');
            System.out.println(teste5);
        }catch(Exception erro){
            System.err.println("Falha no método clone, erro: " + erro);
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