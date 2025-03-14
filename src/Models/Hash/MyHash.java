package Models.Hash;

import Models.MinhaLista.MyList;

public class MyHash {
    private static final int tamanho = 26;
    private MyList[] tabela;

    public MyHash(){
        tabela = new MyList[tamanho];
        for(int cont = 0; cont < tamanho; cont++){
            tabela[cont] = new MyList();
        }
    }

    private int _Hash(String palavra){
        char primeiraLetra = Character.toLowerCase(palavra.charAt(0));
        return primeiraLetra - 'a';
    }

    public void AdicionarPalavraComLinha(String palavra, int linha){
        int indice = _Hash(palavra);
        tabela[indice].InserirLinhas(palavra, linha);
    }

    public String BuscarPalavraComLinhas(String palavra){
        int indice = _Hash(palavra);
        return tabela[indice].BuscarLinhas(palavra);
    }

    public void ExibirTabela(){
        for (int cont = 0; cont < tamanho; cont++){
            if(tabela[cont].tamanho > 0){
                System.out.println((char) ('a' + cont) + " -> ");
                tabela[cont].Imprimir();
            }
        }
    }
}