package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDoStephen = new Conta();
		contaDoStephen.saldo = 100;
		contaDoStephen.deposita(50);
		
		System.out.println("Saldo Conta Stephen: " + contaDoStephen.saldo);
		
		contaDoStephen.saca(20);
		System.out.println("Saldo Conta Stephen: " + contaDoStephen.saldo);
		
		Conta contaDaShelley = new Conta();
		contaDaShelley.deposita(1000);
		
		System.out.println("Saldo Conta Shelley: " + contaDaShelley.saldo);
		System.out.println();
		
		if (contaDaShelley.transfere(2000, contaDoStephen)) {
			System.out.println("Transferência realizada.");
		} else {
			System.out.println("Não há saldo para a transferência!");
		}
		
		System.out.println();
		System.out.println("SALDOS APÓS A TRANSFERÊNCIA");
		System.out.println("Saldo Conta Shelley: " + contaDaShelley.saldo);
		System.out.println("Saldo Conta Stephen: " + contaDoStephen.saldo);
		
		
		
		
		
		
	}

}
