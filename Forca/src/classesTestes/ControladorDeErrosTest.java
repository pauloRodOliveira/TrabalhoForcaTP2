package classesTestes;

import classes.ControladorDeErros;

class ControladorDeErrosTest {
    public static void main(String[] args){
        //teste do construtor
        try{
            ControladorDeErros construtor = new ControladorDeErros(3);
            System.out.println("Sucesso no construtor de ControladorDeErros");
        }catch(Exception erro){
            System.err.println("Falha no construtor de ControladorDeErros.");
        }
    }
}