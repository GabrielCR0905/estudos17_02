package estudos17_02;

 class ContaBancaria {
	 String titular;
	 double saldo;
	 
	 
	 
	 public ContaBancaria(String titular, double saldoInicial) {
		 this.titular = titular;
		 this.saldo = saldoInicial;
		 
	 }
	 
	 public void depositar(double valor) {
		 saldo += valor;
		 System.out.println("Deposito de R$" + valor + "realizado com sucesso");
		 
		 
		 
	 }
	 
	 public void sacar(double valor) {
		 if(valor <= saldo) {
			 saldo -= valor;
			 System.out.println("Saque de R$" + valor + "realizado com sucesso");
			 
		 }else {
			 System.out.println("Saldo insuficiente para saque");
		 }
		 
		 
	 }
	 
	 public void exibirSaldo() {
		 System.out.print("Saldo Atual de "+ titular + ": R$" + saldo);
	 }

}
