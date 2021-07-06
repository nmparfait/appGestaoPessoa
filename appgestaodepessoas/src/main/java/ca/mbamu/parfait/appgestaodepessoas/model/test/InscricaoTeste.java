package ca.mbamu.parfait.appgestaodepessoas.model.test;

import ca.mbamu.parfait.appgestaodepessoas.model.domain.Cadastro;
import ca.mbamu.parfait.appgestaodepessoas.model.domain.Inscricao;

public class InscricaoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cadastro cadastroPessoa1 = new Cadastro("Pedro", "4", "5148853321");
		
		Inscricao n1 = new Inscricao(01, "inscricao do novo funcionario");
		n1.setCadastro(cadastroPessoa1);
		System.out.println("Funcionario: " + n1);

		Inscricao n2 = new Inscricao(01, "inscricao do novo estagiario");
		System.out.println("Estagiario: " + n2);
		
		Inscricao n3 = new Inscricao(01, "inscricao do novo terceirizado");
		System.out.println("Terceirizado: " + n3);
	}

}
