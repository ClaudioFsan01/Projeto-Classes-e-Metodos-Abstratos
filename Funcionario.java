
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
	
	public abstract double getBonificacao(); // a palavra abstract indica q esse método getBonificacao() é do tipo abstrato
	// por isso não possui instrução nele. No nosso caso não existe uma bonificação padrão para todos os funcionarios.
	// A palavra abstract nesse método obriga as classes filhas (concretas, isto é, que não forem abstratas) quando herdarem esse método terem q reescrever esse método.
	// Porque não retirar esse método ? O problema é que, se ele não existisse, não poderíamos chamar o método 
	// apenas com uma referência a um Funcionario , pois ninguém garante que essa referência aponta para um objeto 
	 //que possui esse método.
	
		
	

}
