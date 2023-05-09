package bytebank_composto;

public class TestaBanco {

	public static void main(String[] args) {
		Cliente bram = new Cliente();
		bram.nome = "Bram Stoker";
		bram.cpf = "222.222.222-22";
		bram.profissao = "Escritor";
		
		Conta contaDoBram = new Conta();
		contaDoBram.deposita(1000);
		
		contaDoBram.titular = bram;
		
		System.out.println(contaDoBram.titular.nome);
		
		System.out.println("Saldo Conta Bram: " + contaDoBram.saldo);
	}

}
