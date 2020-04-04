
public class Presidente extends Funcionario {
	
	public String getCargo() {
		return this.cargo =  "Presidente";
	}
	
	public double getBonificacao() {
		return this.salario*0.8 + 2000;
	}

}
