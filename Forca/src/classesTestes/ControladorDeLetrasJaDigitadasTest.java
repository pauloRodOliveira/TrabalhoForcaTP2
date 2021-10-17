package classesTestes;

import classes.ControladorDeLetrasJaDigitadas;


class ControladorDeLetrasJaDigitadasTest {
    public static void main(String[] args) {
        /*// teste1
        try{
            System.out.println("\nTeste 1, isDigitada");
            ControladorDeLetrasJaDigitadas teste1 = new ControladorDeLetrasJaDigitadas();
            teste1.registre('a');
            System.out.println(teste1.isJaDigitada('a'));
            System.out.println(teste1.isJaDigitada('b'));
            teste1.registre('b');
            System.out.println(teste1.isJaDigitada('b'));
        }catch(Exception erro){
            System.err.println("Falha no método isDigitada, erro: " + erro);
        }

        //teste2
        try{
            System.out.println("\nTeste 2, ToString");
            ControladorDeLetrasJaDigitadas teste2 = new ControladorDeLetrasJaDigitadas();
            teste2.registre('f');
            teste2.registre('o');
            teste2.registre('r');
            teste2.registre('c');
            teste2.registre('a');
            System.out.println(teste2);
            teste2.registre('s');
            System.out.println(teste2);
        }catch(Exception erro){
            System.err.println("Falha no método toString, erro: " + erro);
        }

        //teste3
        try{
            System.out.println("\nTeste 3, equals");
            ControladorDeLetrasJaDigitadas teste3 = new ControladorDeLetrasJaDigitadas();
            ControladorDeLetrasJaDigitadas teste31 = new ControladorDeLetrasJaDigitadas();

            teste3.registre('a');
            teste31.registre('a');
            System.out.println(teste3.equals(teste31)); // true
            System.out.println("Objeto 1: " + teste3 + " " + "Objeto 2: " + teste31);

            teste3.registre('c');
            teste31.registre('b');
            System.out.println(teste3.equals(teste31)); // false
            System.out.println("Objeto 1: " + teste3 + " " + "Objeto 2: " + teste31);
        }catch(Exception erro){
            System.err.println("Falha no método equals, erro: " + erro);
        }
         */


        // teste5
        try{
            System.out.println("\nTeste 5, clone");
            ControladorDeLetrasJaDigitadas teste5 = new ControladorDeLetrasJaDigitadas();
            teste5.registre('a');
            ControladorDeLetrasJaDigitadas teste51 = (ControladorDeLetrasJaDigitadas) teste5.clone();
            System.out.println(teste51);
            teste51.registre('b');
            System.out.println(teste5);
            teste51.registre('c');
            System.out.println(teste5);
        }catch(Exception erro){
            System.err.println("Falha no método clone, erro: " + erro);
        }


        /*




        /*
        try{
            System.out.println("\nTeste 1");
            ControladorDeLetrasJaDigitadas teste = new ControladorDeLetrasJaDigitadas();
        }catch(Exception erro){
            System.err.println("Falha no método, erro: " + erro);
        }*/
    }
}