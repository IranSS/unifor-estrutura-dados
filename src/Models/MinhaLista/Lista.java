package Models.MinhaLista;

public class Lista {
    public No inicio;
    public No fim;
    public int tamanho;

    public void inserirNoInicio(String elemento){
        No novoNo = new No(elemento);
        if(inicio == null){
            inicio = fim = novoNo;
        }
        else{
            novoNo.proximo = inicio;
            inicio = novoNo;
        }
        tamanho++;
    }
    public void inserirFim(String elemento){
        No novoNo = new No(elemento);
        if(fim == null){
            inicio = fim = novoNo;
        }
        else{
            fim.proximo = novoNo;
            fim = novoNo;
        }
        tamanho++;
    }
    public boolean contem(String elemento){
        No atual = inicio;
        while(atual != null){
            if(atual.elemento.equals(elemento)){
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }
    public boolean remover(String elemento){
        if(inicio == null) return false;

        if(inicio.elemento.equals(elemento)){
            inicio = inicio.proximo;
            if(inicio == null) fim = null;
            tamanho--;
            return true;
        }
        No atual = inicio;
        while (atual.proximo != null){
            if(atual.proximo.elemento.equals(elemento)){
                atual.proximo = atual.proximo.proximo;
                if(atual.proximo == null) fim = atual;
                tamanho--;
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }
    public void imprimir(){
        No atual = inicio;
        while(atual != null){
            System.out.println(atual.elemento + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
    @Override
    public String toString() {
        String out = "";
        No no = inicio;
        while(no != null){
            out += no.elemento + " ";
            no = no.proximo;
        }
        return out;
    }
}
