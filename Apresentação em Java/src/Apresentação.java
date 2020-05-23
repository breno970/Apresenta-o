import java.util.Scanner;

public class Apresentação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		String cidade; 
		int idade;
		Scanner leitor = new Scanner(System.in);
		
	
				
		System.out.println("Boas vindas!");
		
		System.out.println("Qual é o seu nome?");
		nome = leitor.nextLine();
		
		System.out.println("Olá "+nome+" de onde você vem?");
		cidade = leitor.nextLine();
		
		System.out.println("E qual é sua idade?");
		idade = leitor.nextInt();
		
		System.out.println("Então você é "+nome+",tem "+idade+" anos e vem de "+cidade+", é um prazer te conhecer man!");		
		
		
		
		
		

	}

}