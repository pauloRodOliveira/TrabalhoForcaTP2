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
            teste2.registreUmErro();  // erros = 4 -> erro
            System.out.println("Sucesso em registrar erro.");
        }catch(Exception erro){
            System.err.println("Falha em registrar erro.");
        }
    }
}