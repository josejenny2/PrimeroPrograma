import java.util.*;

class PrimeiroPrograma{
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			
	System.out.println("DIgite o nme do Aluno:");
    String nome = sc.nextLine();
    
	System.out.println("Informe a idade do Aluno:");
    int idade = sc.nextInt();
    sc.close();
    
    System.out.println("Aluno: " + nome + ", sua idade é " + idade + " anos. ");
    
	}

}
