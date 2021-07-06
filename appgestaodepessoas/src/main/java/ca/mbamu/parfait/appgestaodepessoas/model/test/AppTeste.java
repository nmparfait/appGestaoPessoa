package ca.mbamu.parfait.appgestaodepessoas.model.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;

import ca.mbamu.parfait.appgestaodepessoas.model.domain.Cadastro;
import ca.mbamu.parfait.appgestaodepessoas.model.domain.Estagiario;
import ca.mbamu.parfait.appgestaodepessoas.model.domain.Funcionario;
import ca.mbamu.parfait.appgestaodepessoas.model.domain.Inscricao;
import ca.mbamu.parfait.appgestaodepessoas.model.domain.Terceirizado;
import ca.mbamu.parfait.appgestaodepessoas.model.exceptions.BonusDoTerceirizadoException;
import ca.mbamu.parfait.appgestaodepessoas.model.exceptions.BonusEstagiarioException;
import ca.mbamu.parfait.appgestaodepessoas.model.exceptions.BonusNaoOferecidoException;

public class AppTeste {

	public static void main(String[] args) throws BonusDoTerceirizadoException {
		try {
			String dir = "C:/Users/admin/Desktop/dev/";
			String arq = "inscricoes.txt";
			
			try {
				/*InputStream ressource = new ClassPathResource("static/inscricoes.txt").getInputStream();*/
				
				FileWriter fileW = new FileWriter(dir+ "out_" + arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				FileReader file = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(file);
				
				String linha = leitura.readLine();
				
				while (linha != null) {
					
					String[] campos = linha.split(";");
					
					switch (campos[0].toUpperCase()) {
						case "0":
							System.out.println("______Inscricao / solicitante ______");
							Cadastro cadastroP1 = new Cadastro(campos[3], campos[4], campos[5]);
								
							Inscricao p1 = new Inscricao();
							p1.setDescricao(campos[1]);
							p1.setCadastro(cadastroP1);
								
							
							System.out.println("Cadastro do: "  + p1);
								
							break;
								
						case "E":
							System.out.println("****Estagiario ****");
							Estagiario e1 = new Estagiario (campos[1],campos[2], campos[3] , Float.valueOf(campos[4]), campos[5], Boolean.valueOf(campos[6]));
							e1.setEscola(campos[7]);
							e1.setEspecialidade(campos[8]);
								
						
							escrita.write(e1.voceEmpregado());
						
								
							//System.out.println("Estagiario inscrito 1: " + e1);
							break;
							
						case "F":
							System.out.println("****Funcionario****");
							Funcionario b1 = new Funcionario(campos[1], campos[2], campos[3], Float.valueOf(campos[4]), campos[5], Boolean.valueOf(campos[6]));
							b1.setEsporte(campos[7]);
							b1.setHobby(campos[8]);
								
						
							escrita.write(b1.voceEmpregado());
						
								
							//System.out.println("Funcionario 001: " + b1);
							break;
							
						case "T":
							System.out.println("****Terceirizado****");
							// test for terceirizado
							Terceirizado t1 = new Terceirizado(campos[1], campos[2], campos[3], Float.valueOf(campos[4]), campos[5], Boolean.valueOf(campos[6]));
							t1.setEmpresa(campos[7]);
							t1.setServico(campos[8]);
								
						
							escrita.write(t1.voceEmpregado());
						
								
							//System.out.println("Funcionario 001: " + t1);

							break;
								
						default:
								 
							break;
						}
							
					
					linha = leitura.readLine();
				}
		
				file.close();
				leitura.close();
				escrita.close();
				fileW.close();	
			} catch ( BonusNaoOferecidoException | BonusDoTerceirizadoException| BonusEstagiarioException| IOException ex) {
				System.out.println(ex.getMessage());
			}
	
		} finally {
			System.out.println("*** Processamento finalizado com sucesso ***");
	
		}
	
	}

}	

