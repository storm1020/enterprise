package br.com.fiap.ANOTACAO;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Manter anotação até execução
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) //Classe ou interface
public @interface Tabela {
	
	String nome();
}
