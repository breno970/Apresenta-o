import java.util.Scanner;

public class Apresenta��o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		String cidade; 
		int idade;
		Scanner leitor = new Scanner(System.in);
		
	
				
		System.out.println("Boas vindas!");
		
		System.out.println("Qual � o seu nome?");
		nome = leitor.nextLine();
		
		System.out.println("Ol� "+nome+" de onde voc� vem?");
		cidade = leitor.nextLine();
		
		System.out.println("E qual � sua idade?");
		idade = leitor.nextInt();
		
		System.out.println("Ent�o voc� � "+nome+",tem "+idade+" anos e vem de "+cidade+", � um prazer te conhecer man!");		
		
		
		
		
		

	}

}