package ca.mbamu.parfait.appgestaodepessoas.model.test;

import ca.mbamu.parfait.appgestaodepessoas.model.domain.Estagiario;
import ca.mbamu.parfait.appgestaodepessoas.model.domain.Funcionario;
import ca.mbamu.parfait.appgestaodepessoas.model.domain.Terceirizado;

public class PessoaTest {

	public static void main(String[] args) {
		
		//Imprimir um cadastro 
		
		
		
		//test para estagiario
		Estagiario p1 = new Estagiario("paradis","pn@email.com", "30", 2, "marketing", false);
		p1.setEscola("Infnet");
		p1.setEspecialidade("Facebook");
		System.out.println("Estagiario inscrito 1: " + p1);
		
		
		//test para funcionario
		Funcionario b1 = new Funcionario("Brad","brad@email.com", "25", 4, "Secretaria", true);
		b1.setEsporte("Hadball");
		b1.setHobby("Viajar");
		System.out.println("Funcionario 004: " + b1);
		
		// test for terceirizado
		Terceirizado t1 = new Terceirizado("Maria","mariad@email.com", "52", 1, "Limpeza", true);
		t1.setEmpresa("Hadball");
		t1.setServico("Viajar");
		System.out.println("Terceirizado 001: " + b1);

	}

}
