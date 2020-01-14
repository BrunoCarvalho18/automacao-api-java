package br.com.automacaoapi.servicos;

public interface ServicosImpl {

	Resposta getEndPoint(String endPoint);
    Resposta postEndPoint(String endPoint);
    Resposta putEndPoint(String endPoint);
    Resposta deleteEndpoint(String endPoint);

}
