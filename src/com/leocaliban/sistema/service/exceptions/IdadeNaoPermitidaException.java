package com.leocaliban.sistema.service.exceptions;

/**
 * Exce��o a ser lan�ada quando a idade de um novo cliente n�o for aceita.
 * @author Leocaliban
 * 
 * 26 de fev de 2018
 */
public class IdadeNaoPermitidaException extends Exception {
	
	private static final long serialVersionUID = 1L;
	public static String MSG_IDADE_INVALIDA = "A idade do cliente precisa estar entre 18 e 65 anos.";
	
	public IdadeNaoPermitidaException(String msg) {
		super(msg);
	}
}
