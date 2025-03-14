import Models.Hash.MyHash;
import Models.IndiceRemissivo;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        MyHash hashtable = new MyHash();

            IndiceRemissivo indice = new IndiceRemissivo();
            // Processa o arquivo de texto
            indice.ProcessarTexto("src/ArquivosDeTexto/texto.txt");

            // Gera o índice remissivo com base nas palavras-chave
            indice.gerarIndice("src/ArquivosDeTexto/palavras_chaves.txt",
                    "src/ArquivosDeTexto/indice_remissivo.txt");

    }
}
