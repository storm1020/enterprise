package br.com.fiap.TESTE;

import br.com.fiap.ANOTACAO.Tabela;
import br.com.fiap.BEAN.Veiculo;

public class VeiculoTESTE {

	public static void main(String[] args) {
		
		//Instanciar o veiculo
		Veiculo objVeiculo = new Veiculo();	
		//Recuperar a anotação				
		Tabela anotacao = objVeiculo.getClass().getAnnotation(Tabela.class);
		
		//Exibir o SQL com o nome da tabela
		System.out.println("SELECT * FROM " + anotacao.nome());
	}

}
