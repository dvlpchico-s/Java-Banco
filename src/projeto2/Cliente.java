package projeto2;

public class Cliente extends Pessoa {
	protected String senha;
	
	Cliente(){
		super();
	}
	
	Cliente(String nome,String cpf,int dia,int mes,int ano,String senha){
		super(nome,cpf,dia,mes,ano);
		this.senha=senha;
	}
	
	public void setsenha(String senha) {
		this.senha=senha;
	}
	public String getsenha() {
		return senha;
	}
}
