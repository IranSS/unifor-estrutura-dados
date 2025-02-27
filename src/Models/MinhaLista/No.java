package Models.MinhaLista;

public class No<T>{
    protected T elemento;
    protected No<T> proximo = null;

    public No(T elemento) {
        this.elemento = elemento;
    }
}
