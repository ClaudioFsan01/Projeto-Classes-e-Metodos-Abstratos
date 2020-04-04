
public class SecretariaAgencia extends Secretaria {
	
	// classe SecretariaAgencia por não ser abstrata precisa implementar e reescrever o método getBonificação 
	//herdado pela sua classe mãe Secretaria da classe Funcionario
	
	public String getCargo() {
		return this.cargo =  "Secretaria de Agencia";
	}
	
	public double getBonificacao() {
		return this.salario *0.1;
	}
}
