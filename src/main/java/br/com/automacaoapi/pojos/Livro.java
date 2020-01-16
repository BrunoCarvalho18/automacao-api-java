package br.com.automacaoapi.pojos;

public class Livro {

	private String userdId;
	private String id;
	private String title;
	private String body;
	
	public void setUserdId(String userdId) {
		this.userdId = userdId;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getUserdId() {
		return userdId;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}

}
