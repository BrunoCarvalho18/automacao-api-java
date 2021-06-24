package br.com.automacaoapi.steps;

import com.google.gson.Gson;
import br.com.automacaoapi.pojos.Livro;
import br.com.automacaoapi.servicos.ServicosImpl;
import cucumber.api.java.pt.Dado;

public class AlterarLivroSteps {
	
	Gson gson = new Gson();
	Livro livro = new Livro();
	ServicosImpl verbos = new ServicosImpl();

	@Dado("^que eu realize uma requisicao na API para alterar o livro \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"$")
	public void que_eu_realize_uma_requisicao_na_API_para_alterar_o_livro(String idlivro, String userId, String id, String title,String body) throws Throwable {
		livro.setUserdId(userId);
		livro.setId(id);
		livro.setTitle(title);
		livro.setBody(body);
		String json = gson.toJson(livro);
		verbos.putEndPoint("http://jsonplaceholder.typicode.com/posts/" + idlivro, json);
	}


}
