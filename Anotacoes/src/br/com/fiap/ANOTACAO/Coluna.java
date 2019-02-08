package br.com.fiap.ANOTACAO;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Manter a anota��o at� a execu��o
@Retention(RetentionPolicy.RUNTIME)

//Anota��es para os atributos
@Target(ElementType.FIELD)
public @interface Coluna {
	
	String nome();
	
	String tipo();
	
	int tamanho() default 255;
}
