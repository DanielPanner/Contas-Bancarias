
public class TestesContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(0002, 0013532-2);		
		cc.deposita(1000);
		
		ContaPoupanca cp = new ContaPoupanca(0001, 00052347-8);
		cp.deposita(1000);
		
		cc.transfere(900, cp);
		
		System.out.println("CC Tem: " + cp.getSaldo());
		System.out.println("CP Tem: " + cc.getSaldo());

	}

}
