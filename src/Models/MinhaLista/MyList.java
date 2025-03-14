package Models.MinhaLista;

public class MyList {
    public Palavra inicio;
    public Palavra fim;
    public int tamanho;

    public void InserirLinhas(String palavra, int linha){
        Palavra palavraNova = new Palavra(palavra, linha);
        if(inicio == null){
            inicio = fim = palavraNova;
        }
        else{
            fim.proximo = palavraNova;
            fim = palavraNova;
        }
        tamanho++;
    }
    public String BuscarLinhas(String palavra){
        Palavra atual = inicio;
        StringBuilder stringBuilder = new StringBuilder();
        while(atual != null){
            if(atual.elemento.equals(palavra)){
                if((stringBuilder.length()) > 0) stringBuilder.append(" ");
                stringBuilder.append(atual.linha);
            }
            atual  = atual.proximo;
        }
        return stringBuilder.length() > 0 ? palavra + " " +
                stringBuilder.toString() : palavra + " Não encontrada";
    }
    public void Imprimir(){
        Palavra atual = inicio;
        while(atual != null){
            System.out.println(atual.elemento + " " + atual.linha);
            atual = atual.proximo;
        }
    }
}
