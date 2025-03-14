package Models.MinhaLista;

public class Palavra {
    protected String elemento;
    protected int linha;  //armazena a linha
    protected Palavra proximo = null;

    public Palavra(String elemento, int linha) {
        this.elemento = elemento;
        this.linha = linha;
    }
}
