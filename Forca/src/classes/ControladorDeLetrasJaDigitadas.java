package classes;

public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        // torna this.letrasJaDigitadas igual ao String vazio
        this.letrasJaDigitadas = "";
    }

    public boolean isJaDigitada (char letra)
    {
        // percorrer o String this.letrasJaDigitadas e verificar se ele
        // possui a letra fornecida, retornando true em caso afirmativo
        // ou false em caso negativo
        int tamanho = this.letrasJaDigitadas.length();

        for(int aux = 0; aux <= (tamanho - 1); aux++){
            char letraJaDigitada = this.letrasJaDigitadas.charAt(aux);
            if(letra == letraJaDigitada){
                return true;
            }
        }

        return false; // Paulo: to colocando return para não dar erro na hora de compilar, mas pode apagar depois
    }

    public void registre (char letra) throws Exception
    {
        // verifica se a letra fornecida ja foi digitada (pode usar
        // o método this.isJaDigitada, para isso), lancando uma exceção
        // em caso afirmativo.
        // concatena a letra fornecida a this.letrasJaDigitadas.

        if(isJaDigitada(letra)) throw new Exception("Impossível registrar, letra já digitada");

        this.letrasJaDigitadas = this.letrasJaDigitadas + letra;
    }

    public String toString ()
    {
        // retorna um String com TODAS as letras presentes em
        // this.letrasJaDigitadas separadas por vírgula (,).
        int tamanho = letrasJaDigitadas.length();
        String virgulaLetrasDigitadas = "";

        for(int aux = 0; aux <= (tamanho - 1); aux++){
            char letraJaDigitada = letrasJaDigitadas.charAt(aux);
            if(aux < 1) virgulaLetrasDigitadas += letraJaDigitada;
            else virgulaLetrasDigitadas += ", " + letraJaDigitada;
        }

        return virgulaLetrasDigitadas; // Paulo: to colocando return para não dar erro na hora de compilar, mas pode apagar depois
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

