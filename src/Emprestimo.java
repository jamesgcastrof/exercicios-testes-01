import java.util.Scanner;

public class Emprestimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double emprestimo;

		System.out.println("Emprestimo Bancario!!\n");
		System.out.println("Quanto você deseja de empréstimo? ");
		emprestimo = sc.nextDouble();

		if (emprestimo <= 1000) {
			double juros = 0.2;
			System.out.println("Deseja parcelar em quantas vezes?");
			int parcelas = sc.nextInt();
			if (parcelas <= 12) {
				double jurosParcela = 0.003 * parcelas;
				double jurosTotal = juros + jurosParcela;
				double total = emprestimo * (juros + jurosParcela);
				System.out.printf("O valor do empréstimo foi no valor de R$ %.2f \n", (emprestimo));
				System.out.printf("A quantidade de parcelas desejadas foi de %d \n", (parcelas));
				System.out.printf("o valor do juros total foi de %.3f%% \n",(jurosTotal));
				System.out.printf("O valor a ser pago pelo empréstimo é de R$ %.2f.", (total + emprestimo));
			}
			else if (parcelas <= 20) {
				double jurosParcela = 0.005 * parcelas;
				double jurosTotal = juros + jurosParcela;
				double total = emprestimo * (juros + jurosParcela);
				System.out.printf("O valor do empréstimo foi no valor de R$ %.2f \n", (emprestimo));
				System.out.printf("A quantidade de parcelas desejadas foi de %d \n", (parcelas));
				System.out.printf("o valor do juros total foi de %.3f%% \n",(jurosTotal));
				System.out.printf("O valor a ser pago pelo empréstimo é de R$ %.2f.", (total + emprestimo));
			}
			else {
				double jurosParcela = 0.008 * parcelas;
				double jurosTotal = juros + jurosParcela;
				double total = emprestimo * (juros + jurosParcela);
				System.out.printf("O valor do empréstimo foi no valor de R$ %.2f \n", (emprestimo));
				System.out.printf("A quantidade de parcelas desejadas foi de %d \n", (parcelas));
				System.out.printf("o valor do juros total foi de %.3f%% \n",(jurosTotal));
				System.out.printf("O valor a ser pago pelo empréstimo é de R$ %.2f.", (total + emprestimo));
			}
		} else if (emprestimo >1000 && emprestimo <= 5000) {
			double juros = 0.15;
			System.out.println("Deseja parcelar em quantas vezes?");
			int parcelas = sc.nextInt();
			if (parcelas <= 12 ) {
				double jurosParcela = 0.003 * parcelas;
				double jurosTotal = juros + jurosParcela;
				double total = emprestimo * (juros + jurosParcela);
				System.out.printf("O valor do empréstimo foi no valor de R$ %.2f \n", (emprestimo));
				System.out.printf("A quantidade de parcelas desejadas foi de %d \n", (parcelas));
				System.out.printf("o valor do juros total foi de %.3f%% \n",(jurosTotal));
				System.out.printf("O valor a ser pago pelo empréstimo é de R$ %.2f.", (total + emprestimo));
			}
			else if (parcelas >=13 && parcelas<= 20) {
				double jurosParcela = 0.005 * parcelas;
				double jurosTotal = juros + jurosParcela;
				double total = emprestimo * (juros + jurosParcela);
				System.out.printf("O valor do empréstimo foi no valor de R$ %.2f \n", (emprestimo));
				System.out.printf("A quantidade de parcelas desejadas foi de %d \n", (parcelas));
				System.out.printf("o valor do juros total foi de %.3f%% \n",(jurosTotal));
				System.out.printf("O valor a ser pago pelo empréstimo é de R$ %.2f.", (total + emprestimo));
			}
			else {
				double jurosParcela = 0.008 * parcelas;
				double jurosTotal = juros + jurosParcela;
				double total = emprestimo * (juros + jurosParcela);
				System.out.printf("O valor do empréstimo foi no valor de R$ %.2f \n", (emprestimo));
				System.out.printf("A quantidade de parcelas desejadas foi de %d \n", (parcelas));
				System.out.printf("o valor do juros total foi de %.3f%% \n",(jurosTotal));
				System.out.printf("O valor a ser pago pelo empréstimo é de R$ %.2f.", (total + emprestimo));
			}
		} else {
			double juros = 0.1;
			System.out.println("Deseja parcelar em quantas vezes?");
			int parcelas = sc.nextInt();
			if (parcelas <= 12) {
				double jurosParcela = 0.003 * parcelas;
				double jurosTotal = juros + jurosParcela;
				double total = emprestimo * (juros + jurosParcela);
				System.out.printf("O valor do empréstimo foi no valor de R$ %.2f \n", (emprestimo));
				System.out.printf("A quantidade de parcelas desejadas foi de %d \n", (parcelas));
				System.out.printf("o valor do juros total foi de %.3f%% \n",(jurosTotal));
				System.out.printf("O valor a ser pago pelo empréstimo é de R$ %.2f.", (total + emprestimo));
			}
			else if (parcelas >=13 && parcelas <= 20) {
				double jurosParcela = 0.005 * parcelas;
				double jurosTotal = juros + jurosParcela;
				double total = emprestimo * (juros + jurosParcela);
				System.out.printf("O valor do empréstimo foi no valor de R$ %.2f \n", (emprestimo));
				System.out.printf("A quantidade de parcelas desejadas foi de %d \n", (parcelas));
				System.out.printf("o valor do juros total foi de %.3f%% \n",(jurosTotal));
				System.out.printf("O valor a ser pago pelo empréstimo é de R$ %.2f.", (total + emprestimo));
			}
			else {
				double jurosParcela = 0.008 * parcelas;
				double jurosTotal = juros + jurosParcela;
				double total = emprestimo * (juros + jurosParcela);
				System.out.printf("O valor do empréstimo foi no valor de R$ %.2f \n", (emprestimo));
				System.out.printf("A quantidade de parcelas desejadas foi de %d \n", (parcelas));
				System.out.printf("o valor do juros total foi de %.3f%% \n",(jurosTotal));
				System.out.printf("O valor a ser pago pelo empréstimo é de R$ %.2f.", (total + emprestimo));
			}
		}
		sc.close();
	}
}
