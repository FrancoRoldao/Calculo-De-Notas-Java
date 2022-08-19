package pack;

public class Aluno {
	
	String nomeAluno;
	String cursoAluno;
	double mediaAluno;
	
	// Construtor da classe Aluno, assim será necessário inserir nome e curso para inicializar um novo Aluno
	public Aluno(String nomeAluno, String cursoAluno) {
		super();
		this.nomeAluno = nomeAluno;
		this.cursoAluno = cursoAluno;
	}
	
	// Método que recebe as notas e calcula a média do aluno
	public double calculaMedia(double nota1, double nota2, double nota3, double nota4) {
		
		return mediaAluno = (nota1+nota2+nota3+nota4)/4;
	}
	
	// Método que imprime a média + situação do aluno (reprovado ou aprovado)
	public void imprimeMedia() {
		
		System.out.println(nomeAluno + ", sua média é:  " + mediaAluno);
		
		if (mediaAluno >7) {
			
			System.out.println("Parabéns " + nomeAluno + ", você foi aprovado(a)!!!!");
		} else {
			
			System.out.println("Que pena " + nomeAluno + ", você reprovou... :(");
		}
	}
	

}
