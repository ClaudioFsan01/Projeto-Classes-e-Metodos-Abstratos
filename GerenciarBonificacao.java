
public class GerenciarBonificacao {
	
protected int totalBonificacoes =0;
	
	public void setBonificacao(Funcionario funcionario) // a variavel funcionario pode fazer referencia a objetos de outros tipos e não somente da classe Funcionario 
	{                                                    
		totalBonificacoes += funcionario.getBonificacao();
	}
	
	public double getTotalBonificacao()
	{
		return this.totalBonificacoes;
	}

}
