package estudos17_02;

public class Main {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("Carlos Silva",1000.0);
		
		conta1.exibirSaldo();
		conta1.depositar(500);
        conta1.exibirSaldo();
        conta1.sacar(200);
        conta1.exibirSaldo();
        conta1.sacar(2000);
        
        
        
	}

}
