package br.edu.univas.vo;

public class FeaturePassword {
	
	private String password;
	private String saveLocal;
	private int minLength;
	private int maxLength;
	private String choise;
	public int randomLength;
	public int lowerLength;
	public int upperLength;
	public int numberLength;
	public int symbolLength;
	
	public String getChoise() {
		return choise;
	}

	public void setChoise(String choise) {
		this.choise = choise;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String senha) {
		this.password = senha;
	}

	public int getMinLength() {
		return minLength;
	}

	public void setMinLength(int minLength) {
		this.minLength = minLength;
	}

	public int getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	
	}public String getSaveLocal() {
		return saveLocal;
	}

	public void setSaveLocal(String saveLocal) {
		this.saveLocal = saveLocal;
	
	}
	
}
