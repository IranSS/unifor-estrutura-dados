package Models.MinhaLista;

public class No{
    protected String elemento;
    protected No proximo = null;

    public No(String elemento) {
        this.elemento = elemento;
    }
}
