import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import org.junit.jupiter.api.DisplayName;

import br.com.lucianokogut.model.bo.PessoaBO;
import br.com.lucianokogut.model.vo.PessoaVO;

public class MainTest {
    @Test
    @DisplayName("Verifica se existe uma conexão com o Banco de Dados")
    public void verificaSePessoa1FoiCadastrada() {
        PessoaBO pessoaBO = new PessoaBO();
        PessoaVO cp1 = new PessoaVO(0, "Adriano", "01234567899", 45);
        cp1 = pessoaBO.cadastrarPessoaBO(cp1);
        assertNotNull(cp1);
        //System.out.println(cp1.getIdPessoa() > 0 ? "Pessoa Cadastrada com Sucesso!!!" : "Houve um problema no Cadastro!!");
    }

}
