package br.fatec.teste_unitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.fatec.model.Empresa;
import br.fatec.model.EmpresaDAO;

public class UC01CadastrarEmpresa {
	private static Empresa empresa;
	private static EmpresaDAO empresaDAO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresa = new Empresa();
		empresaDAO = new EmpresaDAO();
		empresa.setNomeDaEmpresa("empresa x");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("empresa x");
		empresa.setEndereco("rua taquari");
		empresa.setTelefone("2222");
	}

	@Test
	public void CT01UC01FBCadastra_com_sucesso() {
		assertEquals(1, empresaDAO.adiciona(empresa));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		empresaDAO.exclui("89424232000180");
	}

}
