
public class SecretariaAgencia extends Secretaria {
	
	// classe SecretariaAgencia por n�o ser abstrata precisa implementar e reescrever o m�todo getBonifica��o 
	//herdado pela sua classe m�e Secretaria da classe Funcionario
	
	public String getCargo() {
		return this.cargo =  "Secretaria de Agencia";
	}
	
	public double getBonificacao() {
		return this.salario *0.1;
	}
}
