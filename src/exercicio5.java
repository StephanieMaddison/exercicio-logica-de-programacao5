import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro:  ");
		int n = ler.nextInt();
		int soma = 0;
		
		while(n != 0) {
			
		int num = n % 10;
		if(num>=0) {
			
			soma += num;
		}
		n = n / 10;
		}
		
	    ler.close();
		
		System.out.println("A soma dos digitos é: "+ soma);
	}

}
