package br.edu.univas.view;

public class PreviewInterface {
	
	
	public void printInitialMenu () {
	System.out.println("Gerador de senha\n");	

	}public void printMinLength () {
		System.out.printf("Informe a quantidade m�nima de caracteres para a senha:");
	
	}public void printMaxLength () {
		System.out.printf("Informe a quantidade m�xima de carecteres para a senha:");
		
	}public void printLowerCase () {
		System.out.printf("Infome se a senha ir� conter caracteres min�sculas: S/N");
	
	}public void printUpperCase () {
		System.out.printf("Infome se a senha ir� conter caracteres mai�sculos: S/N");
		
	}public void printNumberCase () {
		System.out.printf("Infome se a senha ir� conter caracteres num�ricos: S/N");
		
	}public void printSymbolCase () {
		System.out.printf("Infome se a senha ir� conter caracteres especiais: S/N");
		
	}public void printSaveMesseger () {
		System.out.printf("Informe o local para salvar a senha: ");
			
	}public void printSaveSucess () {
		System.out.println("Sua senha foi salva com sucesso!");
	}
	
}
