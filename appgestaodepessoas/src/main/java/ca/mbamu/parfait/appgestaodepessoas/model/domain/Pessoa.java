package ca.mbamu.parfait.appgestaodepessoas.model.domain;

import ca.mbamu.parfait.appgestaodepessoas.model.exceptions.BonusDoTerceirizadoException;
import ca.mbamu.parfait.appgestaodepessoas.model.exceptions.BonusEstagiarioException;
import ca.mbamu.parfait.appgestaodepessoas.model.exceptions.BonusNaoOferecidoException;

public abstract class Pessoa {
	private String nome;
	private String email;
	private String idade;
	private float tempoNaEmpresa;
	private String setor;
	private boolean sexo;
	
	
	public Pessoa(String nome, String email, String idade, float tempoNaEmpresa, String setor, boolean sexo) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.tempoNaEmpresa = tempoNaEmpresa;
		this.setor = setor;
		this.sexo = sexo;
	}
	
	public String voceEmpregado() throws  BonusNaoOferecidoException, BonusDoTerceirizadoException, BonusEstagiarioException {
		StringBuilder vc = new StringBuilder();
		vc.append(this.nome);
		vc.append(";");
		vc.append(this.setor);
		vc.append(";");
		vc.append(this.calcularBonusNaCantina());
		vc.append("\r\n");
		return vc.toString();
	}

	public void imprimir() {
		System.out.println(this);
	}
	
	
	@Override
	public String toString() {
		
		
		StringBuilder p1 = new StringBuilder();
		p1.append("Nome: "+this.nome);
		p1.append("; ");
		p1.append("Email: "+this.email);
		p1.append("; ");
		p1.append("Idade: "+this.idade + " anos");
		p1.append("; ");
		p1.append("Tempo na empresa: "+this.tempoNaEmpresa + " anos");
		p1.append("; ");
		p1.append("Setor: " + this.setor);
		p1.append("; ");
		p1.append(this.sexo? "M" : "F");
		return p1.toString();
	}


	//método da classe mãe que cada classe filha precisa emplementar.
	//TempoNaInstituicao, é um bonus que oferece descontos na cantina.
	public abstract float calcularBonusNaCantina() throws  BonusNaoOferecidoException, BonusDoTerceirizadoException, BonusEstagiarioException;
	
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getIdade() {
		return idade;
	}
	
	public float getTempoNaEmpresa() {
		return tempoNaEmpresa;
	}
	
	public String getSetor() {
		return setor;
	}


	public boolean isSexo() {
		return sexo;
	}

/*
	public  setSexo() {
		return this.sexo = sexo;
	}
	
	*/

}
