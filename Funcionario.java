
public abstract class Funcionario {   // a palavra chave abstract impede que essa classe seja instanciada
	
	private String nome;
	private String cpf;	
	protected double salario;
	protected String cargo;
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}	
	
	public String getCPF() {
		return this.cpf;
	}
		
	public void setSalario(double salario)
	{
		this.salario = salario;
	}
	
	public double getSalario()
	{
		return this.salario;
	}
	
	public abstract String getCargo();
	
	public abstract double getBonificacao(); // a palavra abstract indica q esse m�todo getBonificacao() � do tipo abstrato
	// por isso n�o possui instru��o nele. No nosso caso n�o existe uma bonifica��o padr�o para todos os funcionarios.
	// A palavra abstract nesse m�todo obriga as classes filhas (concretas, isto �, que n�o forem abstratas) quando herdarem esse m�todo terem q reescrever esse m�todo.
	// Porque n�o retirar esse m�todo ? O problema � que, se ele n�o existisse, n�o poder�amos chamar o m�todo 
	// apenas com uma refer�ncia a um Funcionario , pois ningu�m garante que essa refer�ncia aponta para um objeto 
	 //que possui esse m�todo.
	
		
	

}
