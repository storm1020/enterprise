package br.com.fiap.BEAN;

import br.com.fiap.ANOTACAO.Coluna;
import br.com.fiap.ANOTACAO.Tabela;

@Tabela(nome="T_ANT_VEICULO")
public class Veiculo {
	
	@Coluna(nome="ds_fabricante", tipo="VARCHAR")
	private String fabricante;
	
	@Coluna(nome="vl_preco", tipo = "NUMBER")
	private double preco;
	
	@Coluna(nome="ds_cor", tipo="VARCHAR", tamanho=50)
	private String cor;
	
	
	public void andar () {}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
