package pack;

public class Main {

	public static void main(String[] args) {
		
		// Instanciando um novo objeto da classe aluno e chamando a execução dos métodos 
		Aluno aluno1 = new Aluno("Robson", "Ciências");
		aluno1.calculaMedia(9, 8, 9, 9);
		aluno1.imprimeMedia();
		System.out.println();
		
		// Instanciando outro objeto e chamando a execução dos métodos 
		Aluno aluno2 = new Aluno("Maria", "Física");
		aluno2.calculaMedia(1, 5, 1, 6);
		aluno2.imprimeMedia();

	}

}
