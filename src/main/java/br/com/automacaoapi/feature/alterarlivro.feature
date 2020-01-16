#language:pt
#encoding UTF-8

@geral
Funcionalidade: Alterar livro
                Eu como usuario gostaria
                de alterar um livro
                
@alterarlivro @put
Esquema do Cenario: Alterar um livro
       Dado que eu realize uma requisicao na API para alterar o livro "<idlivro>" "<userId>"  "<id>"  "<title>"  "<body>"
       Entao a API me retorna o status code 200
      
Exemplos:
|idlivro|userId|id           |title                                    |body                                       |
|2      |2     | 2           | Livro do Daniel e do Maurilio           |Maurilio nao e mais de Manual              |                  