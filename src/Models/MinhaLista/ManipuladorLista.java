package Models.MinhaLista;

public class ManipuladorLista {

    public Lista criarLista(){
        Lista lista = new Lista();
        return lista;
    }
    public No inserirFim(No fim, No no){
        No n = new No(null);
        n.elemento = no.elemento;
        n.proximo = null;
        if(fim != null){
            fim.proximo = n;
        }
        return n;
    }
    public void adicionarElemento(Lista lista, No no){
        lista.fim = inserirFim(lista.fim, no);
        if(lista.inicio == null){
            lista.inicio = lista.fim;
        }
    }
    public void imprimir(Lista lista){
        No q;
        for(q = lista.inicio; q != null; q=q.proximo){
            System.out.println(q.elemento);
        }
    }
}
