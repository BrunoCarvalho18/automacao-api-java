package br.com.automacaoapi.steps;

import br.com.automacaoapi.servicos.Resposta;
import br.com.automacaoapi.servicos.Servicos;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class BuscarLivroSteps {

	public Servicos verbos = new Servicos();
	public Resposta assercao = new Resposta();

	@Dado("^que eu realize uma requisicao na API para buscar o livro com \"([^\"]*)\"$")
	public void que_eu_realize_uma_requisicao_na_API_para_buscar_o_livro_com(String id) throws Throwable {
		verbos.getEndPoint("http://jsonplaceholder.typicode.com/posts/" + id);
	}

	@Entao("^a API me retorna o status code (\\d+)$")
	public void a_API_me_retorna_o_status_code(int status) throws Throwable {
		assercao.getResposta().statusCode(status).log().all();
	}

}
