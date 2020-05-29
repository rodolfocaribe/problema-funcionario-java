package Programa;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		String funcionario;
		char resposta;			
		int horasTrabalhadas;
		double valorPorHora;
		
		do {
			System.out.print("Nome: ");
			funcionario = sc.next();
			System.out.print("Horas Trabalhadas: ");
			horasTrabalhadas = sc.nextInt();
				while (horasTrabalhadas < 1) {
					System.out.print("Horas Trabalhadas: ");
					horasTrabalhadas = sc.nextInt();
				}
			System.out.print("Valor por Hora: ");
			valorPorHora = sc.nextDouble();
				while (valorPorHora < 1) {
					System.out.print("Valor por Hora: ");
					valorPorHora = sc.nextDouble();
				}
			System.out.print("Digitar outro (S/N)? ");
			resposta = sc.next().charAt(0);
			
			} while (resposta == 'S' || resposta =='s');
				
			}
				
}
