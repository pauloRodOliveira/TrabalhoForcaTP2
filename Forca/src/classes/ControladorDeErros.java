package classes;

public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {
        // verifica se qtdMax fornecida não é positiva, lançando
        // uma exceção.
        // armazena qtdMax fornecida em this.qtdMax.
        if(qtdMax < 0) throw new Exception("Quantidade de erros inválida");

        this.qtdMax = qtdMax;
    }

    public void registreUmErro () throws Exception
    {
        // verifica se this.qtdErr ja é igual a this.qtdMax,
        // lançando excecao em caso positivo ou
        // incrementando this.qtdErr em caso negativo

    }

    public boolean isAtingidoMaximoDeErros  ()
    {
        // returna true se this.qtdErr for igual a this.qtdMax,
        // ou então false, caso contrario.
        return true; // Paulo: to colocando return para não dar erro na hora de compilar, mas pode apagar depois
    }

    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
        return true; // Paulo: to colocando return para não dar erro na hora de compilar, mas pode apagar depois
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        return 1; // Paulo: to colocando return para não dar erro na hora de compilar, mas pode apagar depois
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception // construtor de cópia
    {
        // copiar c.qtdMax e c.qtdErr, respectivamente em, this.qtdMax e this.qtdErr
    }

    public Object clone ()
    {
        // returnar uma cópia de this
        return true; // Paulo: to colocando return para não dar erro na hora de compilar, mas pode apagar depois
    }
}

