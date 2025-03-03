package Models.Hash;

import Models.MinhaLista.Lista;

public class MyHash {
    private static final int tamanho = 26;
    private Lista[] tabela;

    public MyHash(){
        tabela = new Lista[tamanho];
        for(int i = 0; i < tamanho; i++){
            tabela[i] = new Lista();
        }
    }
    private int hash(String palavra){
        char primeiraLetra = Character.toLowerCase(palavra.charAt(0));
        return primeiraLetra - 'a';
    }
    public void adicionarPalavra(String palavra){
        int indice = hash(palavra);
        tabela[indice].inserirFim(palavra);
    }
    public boolean buscarPalavra(String palavra){
        int indice = hash(palavra);
        return tabela[indice].contem(palavra);
    }
    public boolean removerPalavra(String palavra){
        int indice = hash(palavra);
        return tabela[indice].remover(palavra);
    }
    public void exibirTabela(){
        for(int i = 0; i < tamanho; i++){
            if(tabela[i].tamanho > 0){
                System.out.print((char) ('a' + i) + " -> ");
                tabela[i].imprimir();
            }
        }
    }
}
