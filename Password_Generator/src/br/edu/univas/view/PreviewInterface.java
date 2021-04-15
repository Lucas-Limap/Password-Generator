package br.edu.univas.view;

public class PreviewInterface {
	
	
	public void printInitialMenu () {
	System.out.println("Gerador de senha\n");	

	}public void printMinLength () {
		System.out.printf("Informe a quantidade mínima de caracteres para a senha:");
	
	}public void printMaxLength () {
		System.out.printf("Informe a quantidade máxima de carecteres para a senha:");
		
	}public void printLowerCase () {
		System.out.printf("Infome se a senha irá conter caracteres minúsculas: S/N");
	
	}public void printUpperCase () {
		System.out.printf("Infome se a senha irá conter caracteres maiúsculos: S/N");
		
	}public void printNumberCase () {
		System.out.printf("Infome se a senha irá conter caracteres numéricos: S/N");
		
	}public void printSymbolCase () {
		System.out.printf("Infome se a senha irá conter caracteres especiais: S/N");
		
	}public void printSaveMesseger () {
		System.out.printf("Informe o local para salvar a senha: ");
			
	}public void printSaveSucess () {
		System.out.println("Sua senha foi salva com sucesso!");
	}
	
}
