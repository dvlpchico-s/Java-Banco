package MAIN;

public class Funcionario extends Pessoa{
	protected String rg;
	protected String telefone;
	protected double salario;
	
	Funcionario(){
		super();
	}
	
	Funcionario(String nome,String cpf,int dia,int mes,int ano,String rg,String telefone,double salario){
		super(nome,cpf,dia,mes,ano);
		this.rg=rg;
		this.telefone=telefone;
		this.salario=salario;
	}
	
	public void setrg(String rg) {
		this.rg=rg;
	}
	public String getrg() {
		return rg;
	}
	
	public void settelefone(String telefone) {
		this.telefone=telefone;
	}
	public String gettefelone() {
		return telefone;
	}
	
	public void setsalario(double salario) {
		this.salario=salario;
	}
	public double getsalario() {
		return salario;
	}
	public void acoes(double salario) {
		if (salario>5000) {
			System.out.println("Pensando que ja vai entrar como gerente..");
		}
		else if(salario>=3000) {
			System.out.println("Vou pensar..");
		}
		else {
			System.out.println("Aceito,nossa empresa foi premiada com funcionarios que nunca param de trabalhar e ganham pouco.");
		}
	}
	
	public void mostrarDados() {
		System.out.println("----------------Interessado-em-Trabalhar-para-o-Banco-da-UEPB-------");
		System.out.println("Nome: "+getnome());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("CPF: "+getcpf());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Data de Nascimento: "+getdia()+"/"+getmes()+"/"+getano());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Idade: "+(2023-getano()));
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Pretenção Salarial: "+getsalario());
		System.out.println("--------------------------------------------------------------------");
		acoes(getsalario());
		System.out.println("--------------------------------------------------------------------");
		
		
	}
}
