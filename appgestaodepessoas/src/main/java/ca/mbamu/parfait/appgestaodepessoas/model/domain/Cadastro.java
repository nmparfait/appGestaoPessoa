package ca.mbamu.parfait.appgestaodepessoas.model.domain;

public class Cadastro {
	private String empresa;
	private String vaga;
	private String contato;
	
	public Cadastro (String empresa, String vaga, String contato) {
		this.empresa = empresa;
		this.vaga = vaga;
		this.contato = contato;
	}
	
	@Override
	public String toString() {
		
		StringBuilder p1 = new StringBuilder();
		p1.append(this.empresa);
		p1.append("; ");
		p1.append(this.vaga);
		p1.append("; ");
		p1.append(this.contato);
		return p1.toString();
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getVaga() {
		return vaga;
	}

	public void setVaga(String vaga) {
		this.vaga = vaga;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
	
	/*getter and setter */
	
	

}

