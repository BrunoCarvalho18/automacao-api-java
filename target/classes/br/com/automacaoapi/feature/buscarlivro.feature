#language:pt
#encoding UTF-8

@geral
Funcionalidade: Buscar livro
                Eu como usuario gostaria
                de buscar um livro
                
Esquema do Cenario: Buscar um livro
       Dado que eu realize uma requisicao na API para buscar o livro com "<id>"
       Entao a API me retorna o status code 200 
      
Exemplos:
|id  |
|1   | 


Esquema do Cenario: Buscar um livro inválido
       Dado que eu realize uma requisicao na API para buscar o livro com "<id>"
       Entao a API me retorna o status code 404 
      
Exemplos:
|id  |
|0   |       
       
            

                