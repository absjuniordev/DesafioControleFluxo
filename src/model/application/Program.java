package model.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Contador;
import model.exceptions.ParametrosInvalidosException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean sucesso = false;

		while (!sucesso) {
			try {

				System.out.print("Insira o primeiro valor: ");
				int primeiroValor = sc.nextInt();
				System.out.print("Insira o segundo valor: ");
				int segundoValor = sc.nextInt();

				Contador contador = new Contador(primeiroValor, segundoValor);
				contador.contar();

				sucesso = true;

			} catch (ParametrosInvalidosException e) {
				System.err.println();
				System.out.println(e.getLocalizedMessage());
				
			} catch (InputMismatchException e) {
				System.err.println();
				System.out.println("Erro: Você não digitou um numero valido");
				sc.next();
			}

		}

		sc.close();

	}

}
