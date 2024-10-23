package estrutura_de_dados;

public class ChavePix {

	Integer tipo;
	String chave;

	public ChavePix(Integer tipo, String chave) {
		this.tipo = tipo;
		this.chave = chave;
	}
	
	public ChavePix() {
		
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}
	

}
