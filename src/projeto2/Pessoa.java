package projeto2;

public class Pessoa {
	protected String nome;
	protected String cpf;
	protected int dia;
	protected int mes;
	protected int ano;
	
	Pessoa(){
		super();
		
	}
	Pessoa(String nome,String cpf,int dia,int mes, int ano){
		super();
		this.nome=nome;
		this.cpf=cpf;
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}
	
	public void setnome(String nome) {
		this.nome=nome;
	}
	public String getnome() {
		return nome;
	}
	
	public void setcpf(String cpf) {
		this.cpf=cpf;
	}
	public String getcpf() {
		return cpf;
	}
	
	public void setdia(int dia) {
		this.dia=dia;
	}
	public int getdia() {
		return dia;
	}
	
	public void setmes(int mes) {
		this.mes=mes;
	}
	public int getmes() {
		return mes;
	}
	
	public void setano(int ano) {
		this.ano=ano;
	}
	public int getano() {
		return ano;
	}

}
