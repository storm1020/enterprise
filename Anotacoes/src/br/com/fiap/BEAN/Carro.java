package br.com.fiap.BEAN;

public class Carro extends Veiculo {
	
	@SuppressWarnings("all") // Retira alertas de usabilidade incorreta e etc.. (usar com moderação).
	
	//Sobrescreve da método da classe pai, e evita problemas se for alterado o nome ou assinatura do método na classe pai.
	@Override
	public void andar() {}
	
	//Mostra que o método é obsoleto
	@Deprecated
	public void fazerArroz() {}
	
}
