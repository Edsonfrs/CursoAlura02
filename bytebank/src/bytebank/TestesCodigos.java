package bytebank;

public class TestesCodigos {

	
		
		double saldo;
		int agencia;
		int numero;
		String titular;
		//assumindo que esse método está dentro da classe Conta que possui os atributos 
		public boolean saca(double valor) {

		    if(saldo >= valor) {
		        saldo -= valor;
		        return true;
		    } else {
		        return false;
		    }
		}

	

}
