package classesTestes;

import classes.ControladorDeErros;

class ControladorDeErrosTest {
    public static void main(String[] args){
        /*//teste do construtor
        try{
            ControladorDeErros teste1 = new ControladorDeErros(3);
            System.out.println("Sucesso no construtor de ControladorDeErros");
        }catch(Exception erro){
            System.err.println("Falha no construtor de ControladorDeErros. Erro: " + erro);
        }

        try{
            ControladorDeErros teste1_2 = new ControladorDeErros(-3);
            System.out.println("Sucesso no construtor de ControladorDeErros");
        }catch(Exception erro){
            System.err.println("Falha no construtor de ControladorDeErros. Erro: " + erro);
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
            System.err.println("Falha em registrar erro. Erro: " + erro);
        }

        //teste do isAtingidoMaximoDeErros
        try{
            ControladorDeErros teste3 = new ControladorDeErros(3);
            teste3.registreUmErro(); // erros = 1
            teste3.registreUmErro(); // erros = 2
            teste3.registreUmErro(); // erros = 3
            System.out.println("\n" + teste3.isAtingidoMaximoDeErros());
            System.out.println("Sucesso em utilizar o método isAtingidoMaximoDeErros.");
        }catch(Exception erro){
            System.err.println("Falha em utilizar o método isAtingidoMaximoDeErros.");
        }

        try{
            ControladorDeErros teste3_2 = new ControladorDeErros(3);
            teste3_2.registreUmErro(); // erros = 1
            teste3_2.registreUmErro(); // erros = 2
            System.out.println("\n" + teste3_2.isAtingidoMaximoDeErros());
            System.out.println("Sucesso em utilizar o método isAtingidoMaximoDeErros.");
        }catch(Exception erro){
            System.err.println("Falha em utilizar o método isAtingidoMaximoDeErros.");
        }



        // teste do equals
        try{
            ControladorDeErros teste4 = new ControladorDeErros(3);
            ControladorDeErros teste4_2 = new ControladorDeErros(3);
            ControladorDeErros teste4_3 = new ControladorDeErros(4);
            System.out.println("\nO teste4 é igual ao teste4_2? Resposta: " + teste4.equals(teste4_2));
            System.out.println("\nO teste4 é igual ao teste4_3? Resposta: " + teste4.equals(teste4_3));
        }catch(Exception erro){}
        */


        //teste do clone
        try{
            ControladorDeErros teste5 = new ControladorDeErros(3);
            ControladorDeErros teste5_2 = (ControladorDeErros) teste5.clone();
            System.out.println(teste5.clone());
            System.out.println(teste5_2);
            teste5_2.registreUmErro();
            System.out.println(teste5_2);
            System.out.println(teste5);
            System.out.println("Sucesso no método clone.");
        }catch(Exception erro){
            System.err.println("Falha no método clone. Erro: " + erro);
        }

        //teste do ConstrutorDeCopia
        try{
            ControladorDeErros teste6 = new ControladorDeErros(3);
            System.out.println("Sucesso no método ConstrutorDeCopia.");
        }catch(Exception erro){
            System.err.println("Falha no método ConstrutorDeCopia.");
        }

        /*
        // teste do toString
        try{
            ControladorDeErros teste6 = new ControladorDeErros(3);
            System.out.println(teste6.toString());
            System.out.println("Sucesso no método toString.");
        }catch(Exception erro){
            System.err.println("Falha no método toString.");
        }


         */
    }
}