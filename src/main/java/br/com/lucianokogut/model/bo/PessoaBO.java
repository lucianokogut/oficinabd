package br.com.lucianokogut.model.bo;

import java.util.ArrayList;
import br.com.lucianokogut.model.dao.PessoaDAO;
import br.com.lucianokogut.model.vo.PessoaVO;

public class PessoaBO {

    public PessoaVO cadastrarPessoaBO(PessoaVO pessoaVO) {
        PessoaDAO pessoaDAO = new PessoaDAO();
        if (pessoaDAO.verificarCadastroPessoaBaseDadosDAO(pessoaVO)) {
            System.out.println("\nPessoa já cadastrada na Base de Dados...");
        } else {
            if (pessoaVO.getIdade() >= 18) {
                pessoaVO = pessoaDAO.cadastrarPessoaDAO(pessoaVO);
            } else {
                System.out.println("\nPessoa é menor de idade. Não é possível cadastrá-la!");
            }
        }
        return pessoaVO;
    }

    public boolean atualizarPessoaBO(PessoaVO pessoaVO) {
        boolean resultado = false;
        PessoaDAO pessoaDAO = new PessoaDAO();
        if (pessoaDAO.verificarCadastroPessoaBaseDadosDAO(pessoaVO)) {
            if (pessoaVO.getIdade() >= 18) {
                resultado = pessoaDAO.atualizarPessoaDAO(pessoaVO);
            } else {
                System.out.println("\nPessoa é menor de idade. Não é possível atualizá-la!");
            }
        } else {
            System.out.println("\nPessoa não existe na Base de Dados...");
        }
        return resultado;
    }

    public boolean excluirPessoaBO(PessoaVO pessoaVO) {
        boolean resultado = false;
        PessoaDAO pessoaDAO = new PessoaDAO();
        if (pessoaDAO.verificarCadastroPessoaBaseDadosDAO(pessoaVO)) {
            resultado = pessoaDAO.excluirPessoaDAO(pessoaVO);
        } else {
            System.out.println("\nPessoa não existe na Base de Dados...");
        }
        return resultado;
    }

    public ArrayList<PessoaVO> consultarTodasPessoasBO() {
        PessoaDAO pessoaDAO = new PessoaDAO();
        ArrayList<PessoaVO> listaPessoasDAO = pessoaDAO.consultarTodasPessoasDAO();
        if (listaPessoasVO.isEmpty()) {
            System.out.println("\nA Lista de Pessoas está vazia...");
        }
        return listaPessoasVO;
    }

    public PessoaVO consultarPessoaBO(PessoaVO pessoaVO) {
        PessoaDAO pessoaDAO = new PessoaDAO();
        PessoaVO pessoa = pessoaDAO.consultarPessoaDAO(pessoaVO);
        if (pessoa == null) {
            System.out.println("\nPessoa não localizada...");
        }
        return pessoa;
    }
}