
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override /// Chamando o método Saca da class mãe, para adiconar nova função na class ContaCorrente. 
	///Onde ao Saca Gere um Custo de 5 Reais.
	
	public boolean saca(double valor) {
		double valorASaca = valor + 5;
		return super.saca(valorASaca);
	}
	///_____________________________________________________________________________________________

	@Override
	public void deposita(double valor) {
		super.saldo = super.saldo + valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.1;
	}
	

}
