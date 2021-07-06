package ca.mbamu.parfait.appgestaodepessoas.model.domain;


import ca.mbamu.parfait.appgestaodepessoas.model.exceptions.BonusNaoOferecidoException;

public class Funcionario extends Pessoa {
	
	private String esporte;
	private String hobby;
	private int bonusFunct;
	

	public Funcionario(String nome, String email, String idade, float tempoNaEmpresa, String setor, boolean sexo) {
		super(nome, email, idade, tempoNaEmpresa, setor, sexo);
	}
	
	/*
	public void imprimir() {
		super.imprimir();

	}
	*/
		
	// stringbuilder 
	@Override
	public String toString() {
		StringBuilder b1 = new StringBuilder();
		b1.append(super.toString());
		b1.append("; ");
		b1.append("O esporte preferido: " + this.esporte);
		b1.append("; ");
		b1.append("Hobby favorito: " + this.hobby);
		b1.append("; ");
		b1.append("Sexo:" + this.isSexo());
		b1.append("; ");
		//b1.append("Desconto na cantina: "+this.calcularTempoNaInstituicao());
		return b1.toString();
	}

	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String setor) {
		this.hobby = setor;
	}
	
		
	public int getBonusFunct() {
		return bonusFunct;
	}

	public void setBonusFunct(int bonusFunct) {
		this.bonusFunct = bonusFunct;
	}

	//método herdado da classe mãe que cada classe filha precisa emplementar.
	@Override
	public float calcularBonusNaCantina() throws  BonusNaoOferecidoException {
		if(this.bonusFunct > 100) {
			throw new  BonusNaoOferecidoException ("O bonus tem que ser inferior a 100");
		}
		bonusFunct = 120; 
		return (this.getTempoNaEmpresa() + bonusFunct/3);
				
	}

}
