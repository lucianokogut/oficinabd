/* package br.com.lucianokogut;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
*/
package br.com.lucianokogut;

import br.com.lucianokogut.model.bo.PessoaBO;
import br.com.lucianokogut.model.vo.PessoaVO;

public class Main {


    public static void main(String[] args) {
        PessoaBO pessoaBO = new PessoaBO();

        //Cadastrar Pessoa (cp)

        //Cadastro OK
        PessoaVO cp1 = new PessoaVO(0, "Adriano", "01234567899", 45);
        cp1 = pessoaBO.cadastrarPessoaBO(cp1);
        System.out.println(cp1.getIdPessoa() >0 ? "Pessoa Cadastrada com Sucesso!!!" : "Houve um problema no Cadastro!!");

        //Cadastro OK
        PessoaVO cp2 = new PessoaVO(0, "Maria", "01234567898", 20);
        cp2 = pessoaBO.cadastrarPessoaBO(cp2);
        System.out.println(cp2.getIdPessoa() >0 ? "Pessoa Cadastrada com Sucesso!!!" : "Houve um problema no Cadastro!!");

        //Cadastro OK
        PessoaVO cp3 = new PessoaVO(0, "Luciano", "01234567897", 40);
        cp3 = pessoaBO.cadastrarPessoaBO(cp3);
        System.out.println(cp3.getIdPessoa() >0 ? "Pessoa Cadastrada com Sucesso!!!" : "Houve um problema no Cadastro!!");

        //Menor de Idade
        PessoaVO cp4 = new PessoaVO(0, "José", "01234567896", 15);
        cp4 = pessoaBO.cadastrarPessoaBO(cp4);
        System.out.println(cp4.getIdPessoa() >0 ? "Pessoa Cadastrada com Sucesso!!!" : "Houve um problema no Cadastro!!");

        //CPF nulo (validado por uma procedure que roda no BD)
        PessoaVO cp5 = new PessoaVO(0, "João", null, 25);
        cp5 = pessoaBO.cadastrarPessoaBO(cp5);
        System.out.println(cp5.getIdPessoa() >0 ? "Pessoa Cadastrada com Sucesso!!!" : "Houve um problema no Cadastro!!");

        //Tentando cadastrar uma pessoa já cadastrada
        cp1 = pessoaBO.cadastrarPessoaBO(cp1);
        System.out.println(cp1.getIdPessoa() >0 ? "Pessoa Cadastrada com Sucesso!!!" : "Houve um problema no Cadastro!!");

        System.out.println("\n-----------------------------------\n");
    }
}