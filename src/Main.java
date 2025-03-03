import Models.Hash.MyHash;
import Models.MinhaLista.ManipuladorLista;
import Models.MinhaLista.Lista;
import Models.MinhaLista.No;
import Models.Hash.MyHash;

public class Main {
    public static void main(String[] args) {
        /*

        //Somente para testar a funcionalidade da lista encadeada
        ManipuladorLista manipuladorLista = new ManipuladorLista();
        No elemento1 = new No(10);
        No elemento2 = new No(20);
        No elemento3 = new No(30);
        No elemento4 = new No(40);
        No elemento5 = new No(80);

        Lista minhaLista = manipuladorLista.CriarLista();

        manipuladorLista.AdicionarElemento(minhaLista, elemento1);
        manipuladorLista.AdicionarElemento(minhaLista, elemento2);
        manipuladorLista.AdicionarElemento(minhaLista, elemento3);
        manipuladorLista.AdicionarElemento(minhaLista, elemento4);
        manipuladorLista.AdicionarElemento(minhaLista, elemento5);

        manipuladorLista.Imprimir(minhaLista);
         */
        MyHash hashtable = new MyHash();

        hashtable.adicionarPalavra("Arroz");
        hashtable.adicionarPalavra("Feijão");
        hashtable.adicionarPalavra("Macarrão");
        hashtable.adicionarPalavra("Linguiça");
        hashtable.adicionarPalavra("Bife");
        hashtable.adicionarPalavra("Cebola");
        hashtable.adicionarPalavra("Melancia");

        System.out.println("Tem arroz na tabela? " + hashtable.buscarPalavra("Arroz"));
        System.out.println("Tem linguiça na tabela? " + hashtable.buscarPalavra("Linguiça"));

        hashtable.removerPalavra("Linguiça");

        System.out.println("Tem linguiça na tabela? " + hashtable.buscarPalavra("Linguiça"));
    }
}
