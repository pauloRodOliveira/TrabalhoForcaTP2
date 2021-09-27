package classes;

public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        // torna this.letrasJaDigitadas igual ao String vazio
    }

    public boolean isJaDigitada (char letra)
    {
        // percorrer o String this.letrasJaDigitadas e verificar se ele
        // possui a letra fornecida, retornando true em caso afirmativo
        // ou false em caso negativo
        return true; // Paulo: to colocando return para não dar erro na hora de compilar, mas pode apagar depois
    }

    public void registre (char letra) throws Exception
    {
        // verifica se a letra fornecida ja foi digitada (pode usar
        // o método this.isJaDigitada, para isso), lancando uma exceção
        // em caso afirmativo.
        // concatena a letra fornecida a this.letrasJaDigitadas.
    }

    public String toString ()
    {
        // retorna um String com TODAS as letras presentes em
        // this.letrasJaDigitadas separadas por vírgula (,).
        return ""; // Paulo: to colocando return para não dar erro na hora de compilar, mas pode apagar depois
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj são iguais
        return true; // Paulo: to colocando return para não dar erro na hora de compilar, mas pode apagar depois
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        return 1; // Paulo: to colocando return para não dar erro na hora de compilar, mas pode apagar depois
    }

    public ControladorDeLetrasJaDigitadas(
            ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas)
            throws Exception // construtor de cópia
    {
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
    }

    public Object clone ()
    {
        // criar uma cópia do this com o construtor de cópia e retornar
        return true; // Paulo: to colocando return para não dar erro na hora de compilar, mas pode apagar depois
    }
}

