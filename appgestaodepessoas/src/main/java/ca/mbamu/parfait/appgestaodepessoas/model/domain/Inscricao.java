package ca.mbamu.parfait.appgestaodepessoas.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Inscricao {
	private int matricula;
	private String descricao;
	private LocalDateTime data;
	private Cadastro cadastro;
	
	public Inscricao() { 
		data = LocalDateTime.now();
	}
	
	public Inscricao(int matricula, String descricao) {
		this();
		this.matricula = matricula;
		this.descricao = descricao;
		
	}

	@Override
	public String toString() {
		StringBuilder p1 = new StringBuilder();
		p1.append(this.matricula);
		p1.append(";");
		p1.append(this.descricao);
		
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return String.format("%d;%s;%s;%s", 
				this.matricula, 
				this.descricao, 
				this.data.format(formatoData),
				this.cadastro);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}



	
	
	
	
	

}

