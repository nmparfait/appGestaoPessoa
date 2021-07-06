package ca.mbamu.parfait.appgestaodepessoas.model.domain;

import ca.mbamu.parfait.appgestaodepessoas.model.exceptions.BonusDoTerceirizadoException;


public class Terceirizado extends Pessoa {
	
	private String empresa;
	private String servico;
	private int bonusTerc;

	public Terceirizado(String nome, String email, String idade, float tempoNaEmpresa, String setor, boolean sexo) {
		super(nome, email, idade, tempoNaEmpresa, setor, sexo);
	}
	
	/*
	@Override
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
		b1.append(this.empresa);
		b1.append("; ");
		b1.append(this.servico);
		b1.append("; ");
		b1.append("Sexo:" + isSexo());
		b1.append("");
		//b1.append("Desconto na cantina: "+this.calcularTempoNaInstituicao());
		return b1.toString();
	}



	//método herdado da classe mãe que cada classe filha precisa emplementar.
	@Override
	public float calcularBonusNaCantina() throws BonusDoTerceirizadoException {	
		if(this.bonusTerc > 200) {
			throw new  BonusDoTerceirizadoException ("O bonus tem que ser inferior a 100");
		}
		bonusTerc = 80;
		return (this.getTempoNaEmpresa() + bonusTerc/2);				
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public int getBonusTerc() {
		return bonusTerc;
	}

	public void setBonusTerc(int bonusTerc) {
		this.bonusTerc = bonusTerc;
	}

}
