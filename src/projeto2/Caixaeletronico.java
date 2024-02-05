package projeto2;

public class Caixaeletronico extends Cliente {
	protected double saque;
	protected double saldo;
	protected double deposito;
	
	Caixaeletronico(){
		super();
	}
	
	Caixaeletronico(String nome,String cpf,int dia,int mes,String senha,int ano,double saque,double saldo,double deposito){
		super(nome,cpf,dia,mes,ano,senha);
		this.saque=saque;
		this.saldo=saldo;
		this.deposito=deposito;
	}
	
	public void setsaque(double saque) {
		this.saque=saque;
		if (saldo<saque) {
			System.out.println("Você nao poderá retirar esse dinheiro.Saldo insuficiente.");
			saque=0;
		}
		else {
			saldo=saldo-saque;
		}
	}
	public double getsaque() {
		return saque;
	}
	
	public void setsaldo(double saldo) {
		this.saldo=saldo;
	}
	public double getsaldo() {
		return saldo;
	}
	
	public void setdeposito(double deposito) {
		this.deposito=deposito;
		saldo=deposito+saldo;
	}
	public double getdeposito() {
		return deposito;
	}
	public void acoes(double saldo) {
		if (saldo>=1000) {
			System.out.println("Uiuiuiquedelicia");
		}
		else if(saldo<1000) {
			System.out.println("Eita paguei as conta");
		}
		else{
			System.out.println("Que cocô");
		}
	}
	public void mostrarDados() {
		System.out.println("--------------------------Cliente-----------------------------------");
		System.out.println("Nome: "+getnome());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("CPF: "+getcpf());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Data de Nascimento: "+getdia()+"/"+getmes()+"/"+getano());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Idade: "+(2023-getano()));
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Senha: "+getsenha());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Saldo: "+getsaldo());
		System.out.println("--------------------------------------------------------------------");
		acoes(saldo);
		System.out.println("--------------------------------------------------------------------");
		
	}
}
