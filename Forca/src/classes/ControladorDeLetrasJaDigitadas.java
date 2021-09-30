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

        return false;
    }

    public void registre (char letra) throws Exception
    {
        // verifica se a letra fornecida ja foi digitada (pode usar
        // o método this.isJaDigitada, para isso), lancando uma exceção
        // em caso afirmativo.
        // concatena a letra fornecida a this.letrasJaDigitadas.
        if(letra == ' ') throw new Exception("Impossível registrar, valor nulo");

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

        return virgulaLetrasDigitadas;
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj são iguais
        if (this == obj) return true;
        if(obj == null) return false;
        ControladorDeLetrasJaDigitadas aux = (ControladorDeLetrasJaDigitadas)obj;

        if(aux.letrasJaDigitadas != this.letrasJaDigitadas) return false;
        else return true;
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        int ret = 1;

        ret = 2*ret + new Integer(this.letrasJaDigitadas).hashCode();

        return ret;
    }

    public ControladorDeLetrasJaDigitadas(ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas) throws Exception // construtor de cópia
    {
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
        ControladorDeLetrasJaDigitadas c = controladorDeLetrasJaDigitadas;
        this.letrasJaDigitadas = c.letrasJaDigitadas;
    }

    public Object clone ()
    {
        // criar uma cópia do this com o construtor de cópia e retornar
        ControladorDeLetrasJaDigitadas copia = new ControladorDeLetrasJaDigitadas();

        copia.letrasJaDigitadas = this.letrasJaDigitadas;

        return copia;
    }
}

