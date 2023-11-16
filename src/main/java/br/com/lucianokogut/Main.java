/* package br.com.lucianokogut;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
*/
package br.com.lucianokogut;

import java.util.ArrayList;

import br.com.lucianokogut.model.bo.PessoaBO;
import br.com.lucianokogut.model.vo.PessoaVO;

public class Main {

    public static void main(String[] args) {
        PessoaBO pessoaBO = new PessoaBO();

        // Cadastrar Pessoa (cp)

        PessoaVO cp1 = new PessoaVO(0, "Adriano", "01234567899", 45);
        cp1 = pessoaBO.cadastrarPessoaBO(cp1);
        System.out.println(
                cp1.getIdPessoa() > 0 ? "Pessoa Cadastrada com Sucesso!!!" : "Houve um problema no Cadastro!!");

        // Cadastro OK
        PessoaVO cp2 = new PessoaVO(0, "Maria", "01234567898", 20);
        cp2 = pessoaBO.cadastrarPessoaBO(cp2);
        System.out.println(
                cp2.getIdPessoa() > 0 ? "Pessoa Cadastrada com Sucesso!!!" : "Houve um problema no Cadastro!!");

        // Cadastro OK
        PessoaVO cp3 = new PessoaVO(0, "Luciano", "01234567897", 40);
        cp3 = pessoaBO.cadastrarPessoaBO(cp3);
        System.out.println(
                cp3.getIdPessoa() > 0 ? "Pessoa Cadastrada com Sucesso!!!" : "Houve um problema no Cadastro!!");

        // Menor de Idade
        PessoaVO cp4 = new PessoaVO(0, "José", "01234567896", 15);
        cp4 = pessoaBO.cadastrarPessoaBO(cp4);
        System.out.println(
                cp4.getIdPessoa() > 0 ? "Pessoa Cadastrada com Sucesso!!!" : "Houve um problema no Cadastro!!");

        // CPF nulo (validado por uma procedure que roda no BD)
        PessoaVO cp5 = new PessoaVO(0, "João", null, 25);
        cp5 = pessoaBO.cadastrarPessoaBO(cp5);
        System.out.println(
                cp5.getIdPessoa() > 0 ? "Pessoa Cadastrada com Sucesso!!!" : "Houve um problema no Cadastro!!");

        // Cadastro OK
        PessoaVO cp6 = new PessoaVO(0, "Vilmar", "01234567895", 42);
        cp6 = pessoaBO.cadastrarPessoaBO(cp6);
        System.out.println(
                cp6.getIdPessoa() > 0 ? "Pessoa Cadastrada com Sucesso!!!" : "Houve um problema no Cadastro!!");

        // Cadastro OK
        PessoaVO cp7 = new PessoaVO(0, "Thayse", "01234567894", 35);
        cp7 = pessoaBO.cadastrarPessoaBO(cp7);
        System.out.println(
                cp7.getIdPessoa() > 0 ? "Pessoa Cadastrada com Sucesso!!!" : "Houve um problema no Cadastro!!");

        // Cadastro OK
        PessoaVO cp8 = new PessoaVO(0, "Thais", "01234567893", 35);
        cp8 = pessoaBO.cadastrarPessoaBO(cp8);
        System.out.println(
                cp8.getIdPessoa() > 0 ? "Pessoa Cadastrada com Sucesso!!!" : "Houve um problema no Cadastro!!");

        // Três anos depois uma nova tentativa de cadastro para Menor de Idade foi feito
        PessoaVO cp9 = new PessoaVO(0, "José", "01234567896", 18);
        cp9 = pessoaBO.cadastrarPessoaBO(cp9);
        System.out.println(
                cp9.getIdPessoa() > 0 ? "Pessoa Cadastrada com Sucesso!!!" : "Houve um problema no Cadastro!!");

        // CPF que era nulo via procedure do BD foi corrigida pelo usuário durante o cadastro
        PessoaVO cp10 = new PessoaVO(0, "João", "01234567892", 25);
        cp10 = pessoaBO.cadastrarPessoaBO(cp10);
        System.out.println(
                cp10.getIdPessoa() > 0 ? "Pessoa Cadastrada com Sucesso!!!" : "Houve um problema no Cadastro!!");

        // Tentando cadastrar uma pessoa já cadastrada
        cp1 = pessoaBO.cadastrarPessoaBO(cp1);
        System.out.println(
                cp1.getIdPessoa() > 0 ? "Pessoa Cadastrada com Sucesso!!!" : "Houve um problema no Cadastro!!");

        System.out.println("\n-----------------------------------\n");

        // Atualizar Pessoa (ap)

        // Atualização OK
        PessoaVO ap1 = new PessoaVO(1, "", "", 0);
        ap1 = pessoaBO.consultarPessoaBO(ap1);
        ap1.setIdade(ap1.getIdade() + 1);
        boolean resultado = pessoaBO.atualizarPessoaBO(ap1);
        System.out.println(
                resultado ? "Pessoa Atualizada com Sucesso!!!" : "Houve um problema na Atualização!!");

        // Tentando atualizar uma pessoa inexistente
        PessoaVO ap2 = new PessoaVO(100, "", "", 0);
        ap2 = pessoaBO.consultarPessoaBO(ap2);
        ap2.setIdade(ap2.getIdade() + 1);
        resultado = pessoaBO.atualizarPessoaBO(ap2);
        System.out.println(
                resultado ? "Pessoa Atualizada com Sucesso!!!" : "Houve um problema na Atualização!!");

        // Tentando atualizar o CPF de uma pessoa para null
        PessoaVO ap3 = new PessoaVO(2, "", "", 0);
        ap3 = pessoaBO.consultarPessoaBO(ap3);
        ap3.setCpf(null);
        resultado = pessoaBO.atualizarPessoaBO(ap3);
        System.out.println(
                resultado ? "Pessoa Atualizada com Sucesso!!!" : "Houve um problema na Atualização!!");

        // Tentando transformar uma pessoa em menor de idade
        PessoaVO ap4 = new PessoaVO(2, "", "", 0);
        ap4 = pessoaBO.consultarPessoaBO(ap4);
        ap4.setIdade(10);
        resultado = pessoaBO.atualizarPessoaBO(ap4);
        System.out.println(
                resultado ? "Pessoa Atualizada com Sucesso!!!" : "Houve um problema na Atualização!!");

        System.out.println("\n-----------------------------------\n");

        // Excluir Pessoa (ep)

        // Exlusão OK
        PessoaVO ep1 = new PessoaVO(2, "", "", 0);
        ep1 = pessoaBO.consultarPessoaBO(ep1);
        resultado = pessoaBO.excluirPessoaBO(ep1);
        System.out.println(
                resultado ? "Pessoa Excluída com Sucesso!!!" : "Houve um problema na Exclusão!!");

        // Tentando excluir uma pessoa inexistente
        PessoaVO ep2 = new PessoaVO(100, "", "", 0);
        ep2 = pessoaBO.consultarPessoaBO(ep2);
        resultado = pessoaBO.excluirPessoaBO(ep2);
        System.out.println(
                resultado ? "Pessoa Excluída com Sucesso!!!" : "Houve um problema na Exclusão!!");

        System.out.println("\n-----------------------------------\n");

        // Consultar uma Pessoa (p) ou Todas (lista)

        // Consultar uma pessoa OK
        PessoaVO p1 = new PessoaVO(3, "", null, 0);
        p1 = pessoaBO.consultarPessoaBO(p1);
        if (p1.getCpf() != null) {
            System.out.println(p1);
        } else {
            System.out.println("\nPessoa não localizada na Base de Dados...");
        }

        // Tentando consultar uma pessoa inexistente
        PessoaVO p2 = new PessoaVO(100, "", null, 0);
        p2 = pessoaBO.consultarPessoaBO(p2);
        if (p2.getCpf() != null) {
            System.out.println(p2);
        } else {
            System.out.println("\nPessoa não localizada na Base de Dados...");
        }

        // Consultar todas as pessoas e interar em uma lista
        ArrayList<PessoaVO> lista = pessoaBO.consultarTodasPessoasBO();
        if (lista.isEmpty()) {
            System.out.println("\nNão existem pessoas cadastradas na Base de Dados...");
        } else {
            System.out.println("\nLista de Pessoas: \n");
            for (PessoaVO p : lista) {
                System.out.println(p + "\n");
            }
        }
    }
}