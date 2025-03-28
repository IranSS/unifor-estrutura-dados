# Índice Remissivo - Estruturas de Dados

## Descrição do Projeto
Este projeto tem como objetivo a criação de um índice remissivo a partir de um texto e de uma lista de palavras-chave. O programa implementa uma estrutura de dados conhecida como arquivo invertido, que é utilizada em sistemas de busca textual para encontrar rapidamente todas as ocorrências de uma palavra em um conjunto de documentos.

## Funcionamento

### O programa segue os seguintes passos:

Leitura dos arquivos:

* Um arquivo texto.txt contendo o texto a ser analisado.

* Um arquivo palavras_chaves.txt contendo as palavras-chave a serem indexadas.

### Processamento:

As palavras do texto são armazenadas em uma Tabela Hash, sendo indexadas pela primeira letra.

Cada palavra possui uma Lista Encadeada associada, onde são registradas as linhas em que ela aparece.

Caso uma palavra já exista na estrutura, sua nova ocorrência é adicionada à lista correspondente.

### Geração do Índice Remissivo:

As palavras-chave são buscadas na estrutura e suas ocorrências são recuperadas.

Os dados são organizados em ordem alfabética e escritos em um arquivo de saída indice_remissivo.txt.

### Participantes do Projeto

Aluno: Francisco Iranildo de Sousa Avelino - 2415577

Aluno: Jorgirerison Leite Peixôto - 2415465

