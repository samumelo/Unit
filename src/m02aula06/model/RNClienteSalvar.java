package m02aula06.model;

import m02aula06.basica.Cliente;
import m02aula06.repository.ConexaoException;
import m02aula06.repository.DAOCliente;
import m02aula06.repository.RepositoryException;

public class RNClienteSalvar {

	public void salvar(Cliente cliente) throws Exception {
		validarDados(cliente);
		verificar(cliente);
		inserir(cliente);
	}

	/**
	 * validar os dados, preenchimento, valores
	 * @param cliente
	 * @throws Exception
	 */
	private void validarDados(Cliente cliente) throws Exception {
		if ((cliente.getNome() == null) || cliente.getNome().isEmpty()) {
			throw new Exception("Nome inv�lido");
		}
		if ((cliente.getCpf() == null) || cliente.getCpf().isEmpty()) {
			throw new Exception("CPF inv�lido");
		}
		if ((cliente.getEmail() == null) || cliente.getEmail().isEmpty()) {
			throw new Exception("E-mail inv�lido");
		}
		
	}

	/**
	 * Verifica se existe duplicidade de cadastro
	 * chama a Persist�ncia para ver se j� existe o CPF no BD
	 * @param cliente
	 */
	private void verificar(Cliente cliente) throws Exception {
		DAOCliente dao = new DAOCliente();
		try {
			Cliente aux = dao.consulta(cliente);
			if (aux != null) {
				throw new Exception("CPF duplicado");
			}
		} catch (ConexaoException e) {
			throw new Exception(
					"Estamos com dificuldades. Tente novamente mais tarde (daqui h� 12horas)<br/>" + e.getMessage());
		} catch (RepositoryException e) {
			throw new Exception("O programador fez kk. Nem adianta tentar de novo.<br/>" + e.getMessage());
		}
	}

	/**
	 * enviar para o respons�vel pela persist�ncia
	 * @param cliente
	 * @throws Exception
	 */
	private void inserir(Cliente cliente) throws Exception {
		DAOCliente dao = new DAOCliente();
		try {
			dao.inserir(cliente);
		} catch (ConexaoException e) {
			throw new Exception(
					"Estamos com dificuldades. Tente novamente mais tarde (daqui h� 12horas)<br/>" + e.getMessage());
		} catch (RepositoryException e) {
			throw new Exception("O programador fez kk. Nem adianta tentar de novo<br/>" + e.getMessage());
		}

	}
}
