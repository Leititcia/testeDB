import Dao.ConexaoBancoDados;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = ConexaoBancoDados.getConnection();

        if (connection != null) {
            System.out.println("Conexão bem-sucedida!");
            // Aqui você pode adicionar código para trabalhar com o banco de dados.
        } else {
            System.out.println("Falha na conexão!");
        }
    }
}
