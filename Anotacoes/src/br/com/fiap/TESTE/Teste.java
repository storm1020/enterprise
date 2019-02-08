package br.com.fiap.TESTE;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.ANOTACAO.Coluna;
import br.com.fiap.BEAN.Veiculo;

public class Teste {

	public static void main(String[] args) {
		//Instanciar um veículo
		Veiculo objVeiculo = new Veiculo();
		
		//API Reflection - recupera o nome da classe
		String nome = objVeiculo.getClass().getName();
		System.out.println(nome);
		
		//Recupera os métodos da classe
		
		//Captura todos os metodos, inclusive da herança de object
		//Method[] objMetodo = objVeiculo.getClass().getMethods();
		
		//Captura apenas os metodos declarados:
		Method[] objMetodo = objVeiculo.getClass().getDeclaredMethods();
		
		System.out.println("Método: ");
		//Percorre todos os métodos e exibe o nome
		for(Method item : objMetodo) {
			System.out.println(item.getName());
		}
		
		System.out.println("Atributos");
		//Recupera os atributos da classe
		Field[] objFields = objVeiculo.getClass().getDeclaredFields();
		
		//Percorre os atributos e exibe o nome:
		for (Field item : objFields) {
			System.out.println(item.getName());
			Coluna anotacao =
					item.getDeclaredAnnotation(Coluna.class);
			System.out.println("Nome: " + anotacao.nome() + "\n" +
					"Tamanho: " + anotacao.tamanho() + "\n" +
					"Tipo: " + anotacao.tipo());
		}
		
	}

}
