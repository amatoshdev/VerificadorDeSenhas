import java.util.Scanner;
 
public class VerificadorDeSenhas {
	
    public static void main(String[] args) {
		
		/* Escreva um programa validador de senhas. A regra para a criação de uma senha forte é
		que a senha deve ser de tamanho mínimo 10. A senha deve conter letras maiúsculas, letras
		minúsculas, números e caracteres especiais/símbolos (!@#$%&*()+). Outra regra, deve ter
		pelo menos 3 caracteres (maiúsculo ou minúsculo), pelo menos 3 números e pelo menos 2
		símbolos. O programa deve solicitar uma senha forte ao usuário até ele conseguir uma senha
		que respeite esses critérios. Após cada senha digitada, apresentar as regras e se a senha
		passou pelos quesitos ou não.
		
		Ex:
		
		Senha: senha123
		
		Regras
		Tamanho 10: 8 (x)
		Letras 5: 5 (ok)
		Números 3: 3 (ok)
		Símbolos 2: 0 (x)
		
		Senha reprovada! Tente novamente.

		________________________________________________
		
		Senha: Bgp2Ip4*@1
		
		Regras
		Tamanho 10: 10 (ok)
		Letras 5: 5 (ok)
		Números 3: 3 (ok)
		Símbolos 2: 2 (ok)
		
		Senha aprovada! Parabéns!

		Senha escolhida: Bgp2Ip4*@1		*/
		
		Scanner reader = new Scanner(System.in);
		
		String password, symbols = "!@#$%&*()+";
		
		int countLowerCase = 0, countUpperCase = 0, countNum = 0, countSymbol = 0;
			
		boolean ok = false;
		
		do {
			
		countLowerCase = 0;
		countUpperCase = 0;
		countNum = 0;
		countSymbol = 0;
		
		System.out.print("Insira uma senha: ");
		password = reader.nextLine();
		
			for (int i = 0; i < password.length(); i++) {

				//Contar letras minúsculas

				if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {

					countLowerCase++;

				}

				//Contar letras maiúsculas

				if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {

					countUpperCase++;

				}

				//Contra números

				if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {

					countNum++;

				}

					//Contar símbolos (!@#$%&*()+)

					for (int j = 0; j < symbols.length(); j++) {

						if (password.charAt(i) == symbols.charAt(j)) {

							countSymbol++;

						}
					}
				}
			
			System.out.println("\nRegras:");
			System.out.println("Tamanho 10: " + password.length() + (password.length() >= 10 ? " (ok)" : " (x)"));
			System.out.println("Letras 5: " + (countLowerCase + countUpperCase) + ((countLowerCase + countUpperCase) >= 5 ? " (ok)" : " (x)"));
			System.out.println("Números 3: " + countNum + (countNum >= 3 ? " (ok)" : " (x)"));
			System.out.println("Símbolos 2: " + countSymbol + (countSymbol >= 2 ? " (ok)" : " (x)"));
			
			ok = password.length() >= 10 &&
			countLowerCase > 0 &&
			countUpperCase > 0 &&
			(countLowerCase + countUpperCase) >= 5 &&
			countNum >= 3 &&
			countSymbol >= 2;
		
				if (ok) {

					System.out.println("\nSenha aprovada! Parabéns!");
					System.out.println("\nSenha escolhida: " + password);

				} else {

					System.out.println("\nSenha reprovada! Tente novamente.");
					System.out.println("________________________________________________\n");

				}
		
		} while (!ok);
	}
}