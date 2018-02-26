package com.leocaliban.testes;

import static org.hamcrest.CoreMatchers.is;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.leocaliban.sistema.domain.Cliente;
import com.leocaliban.sistema.service.ClienteService;


/**
 * Classe de teste criada para garantir o funcionamento das principais operações
 * sobre clientes, realizadas pela classe {@link ClienteService}.
 * @author Leocaliban
 * 
 * 26 de fev de 2018
 */
public class ClienteServiceTest {
	
	private ClienteService service;
	
	/*
	 * Teste básico da pesquisa de um cliente a partir do seu ID.
	 */
	@Test
	public void testePesquisarClientes(){
		
		/* ========== Montagem do cenário ========== */
		
		// criando alguns clientes
		Cliente cliente01 = new Cliente(1, "Jack Bauer", 31, "bauer@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "David Palmer", 48, "dpalmer@gmail.com", 1, true);
		
		// inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		service = new ClienteService(clientesDoBanco);
		
		/* ========== Execução ========== */
		Cliente cliente = service.pesquisaCliente(1);
		
		/* ========== Verificações ========== */
		Assert.assertThat(cliente.getId(), is(1));
		
	}

}
