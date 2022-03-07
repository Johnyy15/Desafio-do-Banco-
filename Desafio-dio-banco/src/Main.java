
public class Main {

	public static void main(String[] args) {
		
		Cliente joao = new Cliente();
		joao.setNome("Joao");
		
		Conta cc = new ContaCorrente(joao);
		Conta poupanca = new ContaPoupanca(joao);
		
		cc.depositar(10000);
		cc.transferir(2000, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		

	}

}
