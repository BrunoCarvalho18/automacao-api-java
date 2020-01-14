package br.com.automacaoapi.steps;

import br.com.automacaoapi.servicos.Servicos;
import cucumber.api.java.pt.Dado;

public class DeletarLivroSteps {
	
	public Servicos verbos = new Servicos();
	
	@Dado("^que eu realize uma requisicao na API para deletar o livro com \"([^\"]*)\"$")
	public void que_eu_realize_uma_requisicao_na_API_para_deletar_o_livro_com(String id) throws Throwable {
	    verbos.deleteEndpoint("http://jsonplaceholder.typicode.com/posts/" + id);
	}

}
