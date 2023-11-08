package br.com.lucianokogut.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.lucianokogut.model.vo.PessoaVO;

public class PessoaDAO {

    public boolean verificarCadastroPessoaBaseDadosDAO(PessoaVO pessoaVO) {
        String query = "SELECT cpf FROM pessoa WHERE cpf = '" + pessoaVO.getCpf() + "' ";
        Connection conn = Banco.getConnection();
        Statement stmt = Banco.getStatement(conn);
        ResultSet resultado = null;
        boolean retorno = false;
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

    public PessoaVO cadastrarPessoaDAO(PessoaVO pessoaVO) {
        String query = "INSERT INTO pessoa (nome, cpf, idade) VALUES (?, ?, ?)";
        Connection conn = Banco.getConnection();
        PreparedStatement pstmt = Banco.getPreparedStatementWithPk(conn, query);
        try {
            pstmt.setString(1, pessoaVO.getNome());
            pstmt.setString(2, pessoaVO.getCpf());
            pstmt.setInt(3, pessoaVO.getIdade());
            pstmt.execute();
            ResultSet resultado = pstmt.getGeneratedKeys();
            if (resultado.next()) {
                pessoaVO.setIdPessoa(resultado.getInt(1));
            }
        } catch (SQLException erro) {
            System.out.println("\nErro ao executar a query do método cadastrarPessoaDAO!");
            System.out.println("\nErro: " + erro.getMessage());
        } finally {
            Banco.closeStatement(pstmt);
            Banco.closeConnection(conn);
        }
        return pessoaVO;
    }

}
