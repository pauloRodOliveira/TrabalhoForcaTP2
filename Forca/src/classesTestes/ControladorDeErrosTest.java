package classesTestes;

import classes.ControladorDeErros;

class ControladorDeErrosTest {
    public static void main(String[] args){
        //teste do construtor
        try{
            ControladorDeErros teste1 = new ControladorDeErros(3);
            System.out.println("Sucesso no construtor de ControladorDeErros");
        }catch(Exception erro){
            System.err.println("Falha no construtor de ControladorDeErros.");
        }

        //teste do registreUmErro
        try{
            ControladorDeErros teste2 = new ControladorDeErros(3);
                                                                  //   ^ quantidade máxima é 3, ou seja, se erro passar de 3 ele não vai registrar.
            teste2.registreUmErro(); // erros = 1
            teste2.registreUmErro(); // erros = 2
            teste2.registreUmErro(); // erros = 3
            //teste2.registreUmErro();  // erros = 4 -> erro
            System.out.println("Sucesso em registrar erro.");
        }catch(Exception erro){
            System.err.println("Falha em registrar erro.");
        }

        //teste do isAtingidoMaximoDeErros
        try{
            ControladorDeErros teste3 = new ControladorDeErros(3);
            teste3.registreUmErro(); // erros = 1
            teste3.registreUmErro(); // erros = 2
            teste3.registreUmErro(); // erros = 3
            if(teste3.isAtingidoMaximoDeErros()) System.out.println("Sucesso em utilizar o método isAtingidoMaximoDeErros.");
        }catch(Exception erro){
            System.err.println("Falha em utilizar o método isAtingidoMaximoDeErros.");
        }

        // teste do equals
        try{
            ControladorDeErros teste4 = new ControladorDeErros(3);
            ControladorDeErros referencia1 = new ControladorDeErros(3);
            ControladorDeErros referencia2 = new ControladorDeErros(4);
            System.out.println(teste4.equals(referencia1));
            System.out.println(teste4.equals(referencia2));
        }catch(Exception erro){

        }
    }
}