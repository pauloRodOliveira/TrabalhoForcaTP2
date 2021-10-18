package classes;

public class Tracinhos implements Cloneable {
    private char texto[];

    public Tracinhos(int qtd) throws Exception {
        // verifica se qtd não é positiva, lançando uma exceção.
        // instancia this.texto com um vetor com tamanho igual qtd.
        // preenche this.texto com underlines (_).
        if (qtd <= 0) throw new Exception("Palavra inválida");
        texto = new char[qtd];
        for (char c:
                this.texto) {
            c = '_';
        }
    }

    public void revele(int posicao, char letra) throws Exception {
        // verifica se posicao é negativa ou então igual ou maior
        // do que this.texto.length, lançando uma exceção.
        // armazena a letra fornecida na posicao tambem fornecida
        // do vetor this.texto
        if(posicao<0||posicao>this.texto.length-1) throw new Exception ("Posição inválida!");
        this.texto[posicao] = letra;
    }

    public boolean isAindaComTracinhos() {
        // percorre o vetor de char this.texto e verifica
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario
        for (char c:
                this.texto) {
            if(c=='_') return true;

        }
        return false;
    }

    public String toString() {
        // retorna um String com TODOS os caracteres que há
        // no vetor this.texto, intercalados com espaços em
        // branco
        //return ""; // Paulo: to colocando return para não dar erro na hora de compilar, mas pode apagar depois
        StringBuilder strBd = new StringBuilder(this.texto.length*2);
        for (char c:
                this.texto) {
            strBd.append(c).append(" ");
        }
        String palavra = strBd.toString();
        return palavra;
    }

    public boolean equals(Object obj) {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
        //return true; // Paulo: to colocando return para não dar erro na hora de compilar, mas pode apagar depois
        if(obj ==null) return false;
        if(this==obj) return true;
        Tracinhos other = (Tracinhos) obj;
        if(other.texto==this.texto) return true;
        return false;
    }

    public int hashCode() {
        // calcular e retornar o hashcode de this
        int ret = 17;
        ret = 17*ret + new Integer(this.texto.toString()).hashCode();
        return ret;
    }

    public Tracinhos(Tracinhos t) throws Exception // construtor de cópia
    {
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conteúdo de t.texto para this.texto
        this.texto = new char[t.texto.length];
        this.texto = t.texto;
    }

    public Object clone() {
        // retornar uma copia de this
        Tracinhos tracinhosCopia = null;
        try{
            tracinhosCopia = new Tracinhos(this);
        }
        catch (Exception erro){
            System.err.println(erro);
        }
        return tracinhosCopia;
    }
}

