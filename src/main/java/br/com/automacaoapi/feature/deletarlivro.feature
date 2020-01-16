#language:pt
#encoding UTF-8

@geral
Funcionalidade: Deletar Livro
                Eu como usuario gostaria
                de deletar um livro
  
@deletarlivro @delete                
Esquema do Cenario: Deletar um livro
       Dado que eu realize uma requisicao na API para deletar o livro com "<id>"
       Entao a API me retorna o status code 200 
      
Exemplos:
|id  |
|1   |    