package br.sp.gov.etec.alocacao.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import br.sp.gov.etec.alocacao.model.Cliente;

public class ClienteControllerTest {

	//injeção
	@InjectMocks
	ClienteController controller;
	
	@Test
	public void listarClientes() {
		List<Cliente> clientes = controller.listarClientes();
		
		//validação para ver se é null
		assertNotNull(clientes);
	}
}
