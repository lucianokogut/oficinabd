import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import org.junit.jupiter.api.DisplayName;

import io.github.cdimascio.dotenv.Dotenv;

public class BancoTest {
    @Test
    @DisplayName("Verifica se existe uma conexão com o Banco de Dados")
    public void verificaSeExisteConexaoComBD() {
        final Dotenv dotenv = Dotenv.load();

        final String BANCODADOS = dotenv.get("BANCODADOS");
        final String ENDERECO = dotenv.get("ENDERECO");
        final String PORTABD = dotenv.get("PORTABD");
        final String CONEXAO = "jdbc:mysql://" + ENDERECO + ":" + PORTABD + "/" + BANCODADOS;
        final String USER = dotenv.get("USERBD");
        final String PASSWORD = dotenv.get("USERPASS");

        Connection conn = null;
        
    }

}
