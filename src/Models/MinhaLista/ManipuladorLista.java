package Models.MinhaLista;

public class ManipuladorLista {

    public MyList criarLista(){
        MyList lista = new MyList();
        return lista;
    }
    public Palavra inserirFim(Palavra fim, Palavra palavra){
        Palavra n = new Palavra(null, 0);
        n.elemento = palavra.elemento;
        n.proximo = null;
        if(fim != null){
            fim.proximo = n;
        }
        return n;
    }
    public void adicionarElemento(MyList lista, Palavra palavra){
        lista.fim = inserirFim(lista.fim, palavra);
        if(lista.inicio == null){
            lista.inicio = lista.fim;
        }
    }
    public void imprimir(MyList lista){
        Palavra q;
        for(q = lista.inicio; q != null; q=q.proximo){
            System.out.println(q.elemento);
        }
    }
}
