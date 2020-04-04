import java.util.Scanner;

public class Principal {
	
	public static void main(String [] args) {		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);	
		
		do {	
		num = cadastrarFuncionario(sc);		 
		}while(6 != num);		
		
		  
	}
	
	public static int cadastrarFuncionario(Scanner sc) {
				
		
		GerenciarBonificacao gb = new  GerenciarBonificacao();
		
		Funcionario funcionario =null;		
			 
		 int caso = menu(sc);
		 
		 switch(caso){
		 
		 case 1:
			 
			 funcionario = new Presidente();			 
			 cadastro(funcionario , gb, sc);
			 exibirFuncionario(funcionario, gb);
			 
			 break;
			 
		 case 2:
			 
                funcionario = new Diretor();			 
			    cadastro(funcionario , gb, sc);
			    exibirFuncionario(funcionario, gb);
			 
			 break;
			 
		 case 3:
			 
			    funcionario = new Gerente();			 
			    cadastro(funcionario , gb, sc);
			    exibirFuncionario(funcionario, gb);
			 
			 break;
			 
		 case 4:
			 
			   funcionario = new SecretariaAdministrativa();			 
			    cadastro(funcionario , gb, sc);	
			    exibirFuncionario(funcionario, gb);
			 break;
			 
		 case 5:
			 
			   funcionario = new SecretariaAgencia();			 
			    cadastro(funcionario , gb, sc);	
			    exibirFuncionario(funcionario, gb);
			 break;
			 
		 case 6:
			 System.out.println(" Programa Encerrado !");
			 break;
			 
			 default :
				 
				 System.out.println(" Opção invalida !");
				 
				 break;
		 
		 }				
	
		 return caso;
		 
	}
	
	 public static int menu(Scanner sc) {
		 
		 System.out.println("\n Cadastro de Funcionario ! \n");
			
			System.out.println("-------- Menu --------\n"
					          + " (1- Presidente) \n"
					          + " (2- Diretor) \n"
					          + " (3- Gerente) \n"
					          + " (4- Secretaria Administrativa) \n"
					          + " (5- Secretaria de Agencia) \n"
					          + " (6- Sair) :\n");
			
		 int opcao = sc.nextInt();
		 return opcao;
	 }
	
	public static void cadastro(Funcionario funcionario , GerenciarBonificacao gb, Scanner sc) {
		
		System.out.println(" Digite o nome : ");
		 funcionario.setNome(sc.next());
		 
		 System.out.println(" Digite o cpf : ");
		 funcionario.setCPF(sc.next());
		 
		 System.out.println(" Digite o salario : ");
		 funcionario.setSalario(sc.nextDouble());
		 
		 gb.setBonificacao(funcionario);	 
		 
		
	}
	
	public static void exibirFuncionario(Funcionario funcionario , GerenciarBonificacao gb) {
		
		 System.out.println("\n Dados do Funcionario ! \n");
		 System.out.println(" Nome : "+funcionario.getNome());
		 System.out.println(" CPF : "+funcionario.getCPF());
		 System.out.println(" Cargo : "+ funcionario.getCargo());
		 System.out.println(" Salario : "+ funcionario.getSalario());
		 System.out.println(" Bonificação : "+ gb.getTotalBonificacao());
		
	}	
	

}
