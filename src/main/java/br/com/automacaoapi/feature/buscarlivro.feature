#language:pt
#encoding UTF-8

@geral
Funcionalidade: Buscar livro
                Eu como usuario gostaria
                de buscar um livro
     
@buscarlivro @get                
Esquema do Cenario: Buscar um livro
       Dado que eu realize uma requisicao na API para buscar o livro com "<id>"
       Entao a API me retorna o status code 200 
      
Exemplos:
|id  |
|1   | 

@buscarlivro @get
Esquema do Cenario: Buscar um livro invalido
       Dado que eu realize uma requisicao na API para buscar o livro com "<id>"
       Entao a API me retorna o status code 404 
      
Exemplos:
|id  |
|0   |     


Esquema do Cenario: Buscar outro livro
       Dado que eu realize uma requisicao na API para buscar o livro com "<id>"
       Entao a API me retorna o status code 200 
      
Exemplos:
|id  |
|2   |   
       
            

                