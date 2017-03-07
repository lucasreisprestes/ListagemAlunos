import java.util.ArrayList;


public class Turma {
	
	private String nome;
	private int numero;
	private ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
	
	public Turma(){
		
	}

	public void adicionaAluno(Aluno obj) {
		
		this.listaAlunos.add(obj);
		
	}
	
	public void listaAlunos(){
		
		System.out.print(nome + " - " + numero +"\n");
		
		for(Aluno aluno : listaAlunos){
			System.out.print(aluno.getNome()+ " - " + aluno.getNumero()+"\n");
		}
		
	}
	
	
	public String getNomeDisciplina() {
		return nome;
	}

	public void setNomeDisciplina(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
