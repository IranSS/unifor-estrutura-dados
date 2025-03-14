package Models;

import Models.Hash.MyHash;

import java.io.*;
import java.util.*;

public class IndiceRemissivo {

    private MyHash tabela;

    public IndiceRemissivo(){
        tabela = new MyHash();
    }

    public void ProcessarTexto(String nomeArquivo) throws IOException{
        BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
        String linha;
        int numeroDaLinha = 1;

        while ((linha = leitor.readLine()) != null){
            String[] palavras = linha.split("\\s+");
            for(String palavra : palavras){
                palavra = palavra.replaceAll("[^a-zA-Z-]", "").toLowerCase();
                if(!palavra.isEmpty()){
                    tabela.AdicionarPalavraComLinha(palavra, numeroDaLinha);
                }
            }
            numeroDaLinha++;
        }
        leitor.close();
    }

    public void gerarIndice(String nomeArquivoPalavrasChaves, String nomeArquivoSaida) throws IOException{
        BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivoPalavrasChaves));
        String linha;
        BufferedWriter escrever = new BufferedWriter(new FileWriter(nomeArquivoSaida));

        List<String> palavrasChave = new ArrayList<>();
        while((linha = leitor.readLine()) != null){
            palavrasChave.add(linha.trim().toLowerCase());
        }
        leitor.close();

        Collections.sort(palavrasChave);

        for(String palavras : palavrasChave){
            String resultado = tabela.BuscarPalavraComLinhas(palavras);
            escrever.write("\n" + resultado);
        }
        escrever.close();
        System.out.println("O Indice remissivo foi gerado no arquivo: " + nomeArquivoSaida);
    }
}