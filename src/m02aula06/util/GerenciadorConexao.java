package m02aula06.util;

import java.sql.Connection;

import m02aula06.repository.ConexaoException;

public interface GerenciadorConexao {
	
	/**
	 * Estabelece uma conexao com o BD
	 * @return Objeto de conex�o
	 * @throws ConexaoException
	 */
	public Connection conectar()throws ConexaoException;
	
	/**
	 * Encerra a conexao c com o BD
	 * @param c Objeto de conex�o
	 * @throws ConexaoException
	 */
	public void desconectar(Connection c)throws ConexaoException;
}
