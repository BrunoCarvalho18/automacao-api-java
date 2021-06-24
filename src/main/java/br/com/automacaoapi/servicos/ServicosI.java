package br.com.automacaoapi.servicos;

public interface Servicos {

    Resposta getEndPoint(String endPoint);
    Resposta postEndPoint(String endPoint, Object mensagem);
    Resposta putEndPoint(String endPoint, Object mensagem);
    Resposta deleteEndpoint(String endPoint);

}
