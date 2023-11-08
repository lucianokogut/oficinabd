package br.com.lucianokogut.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.lucianokogut.model.vo.PessoaVO;

public class PessoaDAO {

    public boolean verificarCadastroPessoaBaseDadosDAO(PessoaVO pessoaVO) {
        Connection conn = Banco.getConnection();
        Statement stmt = Banco.getStatement(conn);
        ResultSet resultado = null;
        boolean retorno = false;
        String query = "SELECT cpf FROM pessoa WHERE cpf = '" + pessoaVO.getCpf() + "' ";
        try {
            resultado = stmt.executeQuery(query);
            if (resultado.next()) {
                retorno = true;
            }
        } catch (SQLException erro) {
            System.out.println("\nErro ao executar a query do método verificarCadastroPessoaBaseDadosDAO!");
            System.out.println("\nErro: " + erro.getMessage());
        } finally {
            Banco.closeResultSet(resultado);
            Banco.closeStatement(stmt);
            Banco.closeConnection(conn);
        }
        return retorno;
    }

}
