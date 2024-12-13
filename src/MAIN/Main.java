package MAIN;
import java.util.Scanner;
public class Main {
	public static Scanner leitor1= new Scanner(System.in);
	public static Scanner leitor2= new Scanner(System.in);
	public static void main(String args[]) {
		Caixaeletronico b = new Caixaeletronico();
		Funcionario f = new Funcionario();
		b.setsaldo(0);
		int cont;
		int switc;
		System.out.println("Digite qualquer numero para iniciar e o 0 para encerrar.");
		cont=leitor2.nextInt();
		while (cont!=0) {
			System.out.println("Digite 1 para Cadastrar nova pessoa\n"
					+ "Digite 2 para Depositar\n"
					+ "Digite 3 para sacar\n"
					+ "Digite 4 para ver todos os dados do cliente.\n"
					+ "Digite 5 para se Candidatar para uma vaga de emprego no banco.\n"
					+ "Digite 6 para ver o funcionario que se cadastrou para uma vaga de emprego.");
			switc=leitor2.nextInt();
			switch(switc){
			case 1:		
				System.out.println("Digite seu nome: ");
				b.setnome(leitor1.nextLine());
				System.out.println("Digite seu CPF: ");
				b.setcpf(leitor1.nextLine());
				System.out.println("Digite o Dia em que voce nasceu: ");
				b.setdia(leitor2.nextInt());
				System.out.println("Digite o Mês em que nasceu: ");
				b.setmes(leitor2.nextInt());
				System.out.println("Digite o Ano em que voce nasceu: ");
				b.setano(leitor2.nextInt());
				System.out.println("Digite sua senha para finalizar o cadastro: ");
				b.setsenha(leitor1.nextLine());
				break;
			case 2:
				System.out.println("Quanto você deseja depositar: ");
				b.setsaldo(leitor2.nextDouble());
				break;
			case 3:
				if (b.getsaldo()==0) {
					System.out.println("Você só poderá sacar se você tiver saldo em sua conta que por enquanto está igual a "+b.getsaldo());
					break;
				}
				System.out.println("Digite quanto voce deseja sacar: ");
				b.setsaque(leitor2.nextDouble());
				break;
			case 4:
				b.mostrarDados();
				break;
			case 5:
				System.out.println("Digite seu nome: ");
				f.setnome(leitor1.nextLine());
				System.out.println("Digite seu CPF: ");
				f.setcpf(leitor1.nextLine());
				System.out.println("Digite o Dia em que voce nasceu: ");
				f.setdia(leitor2.nextInt());
				System.out.println("Digite o Mês em que nasceu: ");
				f.setmes(leitor2.nextInt());
				System.out.println("Digite o Ano em que voce nasceu: ");
				f.setano(leitor2.nextInt());
				System.out.println("Digite sua Prentenção salarial: ");
				f.setsalario(leitor2.nextDouble());
				break;
			case 6:
				f.mostrarDados();
			default:
				if (switc==0) {
					System.out.println("BYE.");
				}
				else {
					System.out.println("Numero inexistente");
				}
				break;
			}
			cont=switc;
		}
		System.out.println("(:ENCERRADO:)");
	}
}
