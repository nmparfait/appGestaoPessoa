
package ca.mbamu.parfait.appgestaodepessoas.model.domain;

import ca.mbamu.parfait.appgestaodepessoas.model.exceptions.BonusEstagiarioException;
import ca.mbamu.parfait.appgestaodepessoas.model.exceptions.BonusNaoOferecidoException;

public class Estagiario extends Pessoa {
	private String escola;
	private String especialidade;
	private int bonusEstg;

	public Estagiario(String nome, String email, String idade, float tempoNaEmpresa, String setor, boolean sexo) {
		super(nome, email, idade, tempoNaEmpresa, setor, sexo);
			
	}

	public String toString() {
		StringBuilder p1 = new StringBuilder();
		p1.append(super.toString());
		p1.append("; ");
		p1.append(this.escola);
		p1.append("; ");
		p1.append(this.especialidade);
		p1.append("; ");
		p1.append("Sexo:" + isSexo());
		p1.append("; ");
		p1.append(this.bonusEstg);
		p1.append("; ");
		//p1.append("Desconto na cantina: "+ this.calcularTempoNaInstituicao());
		return p1.toString();

	}
	
	/*
	@Override
	public void imprimir() {
		System.out.println();
		super.imprimir();
	}
	
	*/

	//método herdado da classe mãe que cada classe filha precisa emplementar.
		@Override
		public float calcularBonusNaCantina() throws BonusEstagiarioException {
			if(this.bonusEstg == 0) {
				throw new  BonusEstagiarioException ("O bonus do estagiário não pode ser 0");
			}
			
			bonusEstg = 30;
			return this.getTempoNaEmpresa() + bonusEstg/2;
		}


		public String getEscola() {
			return escola;
		}


		public void setEscola(String escola) {
			this.escola = escola;
		}


		public String getEspecialidade() {
			return especialidade;
		}


		public void setEspecialidade(String especialidade) {
			this.especialidade = especialidade;
		}


		public int getBonusEstg() {
			return bonusEstg;
		}


		public void setBonusEstg(int bonusEstg) {
			this.bonusEstg = bonusEstg;
		}


}	
