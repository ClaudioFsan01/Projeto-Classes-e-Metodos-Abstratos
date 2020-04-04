
public class Gerente extends Funcionario{
	
		
	public String getCargo() {
		return this.cargo =  "Gerente";
	}
	
	public double getBonificacao()
	{
		return this.salario * 0.5 + 1000; 
	}

}
