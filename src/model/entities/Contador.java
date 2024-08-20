package model.entities;

import model.exceptions.ParametrosInvalidosException;

public class Contador {

	private int parametroUm;
	private int parametroDois;

	public Contador(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		this.parametroUm = parametroUm;
		this.parametroDois = parametroDois;
	}

	public int getParametroUm() {
		return parametroUm;
	}

	public int getParametroDois() {
		return parametroDois;
	}

	public void contar() {
		int contagem = parametroDois - parametroUm;

		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}

}
