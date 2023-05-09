package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Valor 1ª Conta: " + primeiraConta.saldo);
		
		
		primeiraConta.saldo += 100;
		System.out.println("Valor 1ª Conta: " + primeiraConta.saldo);
		
		
		Conta segundaConta = primeiraConta;
		segundaConta.saldo += 50;
		
				
		System.out.println();
		
		System.out.println("Valor 1ª Conta: " + primeiraConta.saldo);
		System.out.println("Valor 2ª Conta: " + segundaConta.saldo);
		
		//System.out.println("1ª Conta - Agência: " + primeiraConta.agencia);
		//System.out.println("1ª Conta - Número: " + primeiraConta.numero);
	}

}
