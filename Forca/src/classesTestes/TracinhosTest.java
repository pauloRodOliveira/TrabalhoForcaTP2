package classesTestes;

import classes.Tracinhos;

public class TracinhosTest {
    public static void main(String[] args) {

//*
//Teste do Construtor
        try {
            Tracinhos testeTracinhos1 = new Tracinhos(8);
            System.out.println("Construtor funcionando!");
        } catch (Exception erro) {
            System.err.println("Erro no Construtor");
        }

        try {
            Tracinhos testeTracinhos2 = new Tracinhos(-10);
            System.out.println("Teste qtd abaixo de 0");
        } catch (Exception erro) {
            System.err.println("Erro no Construtor");
        }

        //Teste do Revele
        try {
            Tracinhos testeTracinhos3 = new Tracinhos(5);
            testeTracinhos3.revele(2, 'a');
            testeTracinhos3.revele(0, 'd');
            testeTracinhos3.revele(5, 'x');
        } catch (Exception erro) {
            System.err.println("Posição inválida!");
        }

        //Teste do isAindaComTracinhos

        try {
            Tracinhos testeTracinhos4 = new Tracinhos(4);
            testeTracinhos4.isAindaComTracinhos();
            System.out.println("Palavra contém tracinhos!");
        } catch (Exception erro) {
            System.err.println("Erro na verificação!");
        }

    //Teste toString
        try {
            Tracinhos testeTracinhos5 = new Tracinhos(6);
            System.out.println(testeTracinhos5.toString());
        } catch (Exception erro) {
            System.err.println("Erro no toString");
        }

    //Teste Equals
        try {
            Tracinhos testeTracinhos6 = new Tracinhos(4);
            Tracinhos testeTracinhos6Equals = new Tracinhos(6);
            if (testeTracinhos6.equals(testeTracinhos6Equals)) {
                System.out.println("Objetos iguais!");
            } else
                System.out.println("Objetos diferentes!");
        } catch (Exception erro) {
            System.err.println("Erro ao comparar!");
        }
    //Teste Clone

        try {
            Tracinhos testeTracinhos7 = new Tracinhos(7);
            System.out.println(testeTracinhos7);
            System.out.println(testeTracinhos7.clone());
            System.out.println("Clone!");
        } catch (Exception erro) {
            System.err.println("Erro ao clonar!");
        }

    }

}
