package br.com.fiap.BEAN;

public class Carro extends Veiculo {
	
	@SuppressWarnings("all") // Retira alertas de usabilidade incorreta e etc.. (usar com modera��o).
	
	//Sobrescreve da m�todo da classe pai, e evita problemas se for alterado o nome ou assinatura do m�todo na classe pai.
	@Override
	public void andar() {}
	
	//Mostra que o m�todo � obsoleto
	@Deprecated
	public void fazerArroz() {}
	
}
