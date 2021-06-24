package br.com.automacaoapi.servicos;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class ServicosImpl implements ServicosI {

	private Response resposta;

	public Resposta getEndPoint(String endPoint) {
		resposta = given().when().log().all().get(endPoint);
		return new Resposta(resposta);
	}

	public Resposta postEndPoint(String endPoint, Object mensagem) {
		resposta = given().contentType("application/json").body(mensagem).when().log().all().post(endPoint);
		return new Resposta(resposta);
	}

	public Resposta putEndPoint(String endPoint, Object mensagem) {
		resposta = given().contentType("application/json").body(mensagem).when().log().all().put(endPoint);
		return new Resposta(resposta);
	}

	public Resposta deleteEndpoint(String endPoint) {
		resposta = given().when().log().all().delete(endPoint);
		return new Resposta(resposta);
	}

}
