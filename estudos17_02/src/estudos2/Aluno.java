package estudos2;

class Aluno {
	String nome;
	double nota1;
	double nota2;
	
	
	public  Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		
	}

	
	public double calcularMedia() {
		 return (nota1 + nota2) /2;
	
	}
	public void exibirResultado() {
		double media = calcularMedia();
		System.out.print("Sua media é" + media);
		
		
		if(media >= 7) {
			System.out.print("Voce" + nome + " está de Ferias");
		}else {
			System.out.print( nome +"Está de Recuperação");
		}
	}
}
