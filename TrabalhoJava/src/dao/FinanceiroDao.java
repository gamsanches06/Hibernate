package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ClienteModel;
import model.FinanceiroModel;

public class FinanceiroDao {

    private Connection conexao = null;

    public FinanceiroDao() throws SQLException {
    }

    public void adicionar(FinanceiroModel financeiro) throws SQLException {
        String sql = "INSERT INTO FINANCEIRO (FIN_ID, FIN_NUMERO, FIN_EMISSAO, FIN_VENCIMENTO, FIN_PAGAMENTO, FIN_VALOR, FIN_JUROS,"
                + "FIN_MULTA, FIN_DESCONTO, FIN_TOTAL  )"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, financeiro.getFIN_ID());
        stm.setInt(2, financeiro.getFIN_NUMERO());
        stm.setString(3, financeiro.getFIN_EMISSAO());
        stm.setString(4, financeiro.getFIN_VENCIMENTO());
        stm.setString(5, financeiro.getFIN_PAGAMENTO());
        stm.setFloat(6, financeiro.getFIN_VALOR());
        stm.setFloat(7, financeiro.getFIN_JUROS());
        stm.setFloat(8, financeiro.getFIN_MULTA());
        stm.setFloat(9, financeiro.getFIN_DESCONTO());
        stm.setFloat(10, financeiro.getFIN_TOTAL());
        stm.execute();
        stm.close();
    }

    public void alterar(FinanceiroModel financeiro) throws SQLException {
        String sql = "UPDATE FINANCEIRO SET FIN_NUMERO = ?, FIN_EMISSAO = ?, FIN_VENCIMENTO = ?, FIN_PAGAMENTO = ?, FIN_VALOR = ?, "
                + "FIN_JUROS = ?, FIN_MULTA = ?, FIN_DESCONTO = ?, FIN_TOTAL = ?  WHERE FIN_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, financeiro.getFIN_NUMERO());
        stm.setString(2, financeiro.getFIN_EMISSAO());
        stm.setString(3, financeiro.getFIN_VENCIMENTO());
        stm.setString(4, financeiro.getFIN_PAGAMENTO());
        stm.setFloat(5, financeiro.getFIN_VALOR());
        stm.setFloat(6, financeiro.getFIN_JUROS());
        stm.setFloat(7, financeiro.getFIN_MULTA());
        stm.setFloat(8, financeiro.getFIN_DESCONTO());
        stm.setFloat(9, financeiro.getFIN_TOTAL());
        stm.setInt(10, financeiro.getFIN_ID());
        stm.execute();
        stm.close();
    }

    public void excluir(FinanceiroModel financeiro) throws SQLException {
        String sql = "DELETE FROM FINANCEIRO WHERE FIN_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, financeiro.getFIN_ID());
        stm.execute();
        stm.close();
    }

    public ArrayList<FinanceiroModel> consultar(String condicao) throws SQLException {
        ArrayList<FinanceiroModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM FINANCEIRO";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            FinanceiroModel objfinanceiro = new FinanceiroModel();
            objfinanceiro.setFIN_ID(rs.getInt("FIN_ID"));
            objfinanceiro.setFIN_NUMERO(rs.getInt("FIN_NUMERO"));
            objfinanceiro.setFIN_EMISSAO(rs.getString("FIN_EMISSAO"));
            objfinanceiro.setFIN_VENCIMENTO(rs.getString("FIN_VENCIMENTO"));
            objfinanceiro.setFIN_PAGAMENTO(rs.getString("FIN_PAGAMENTO"));
            objfinanceiro.setFIN_VALOR(rs.getInt("FIN_VALOR"));
            objfinanceiro.setFIN_JUROS(rs.getInt("FIN_JUROS"));
            objfinanceiro.setFIN_MULTA(rs.getInt("FIN_MULTA"));
            objfinanceiro.setFIN_DESCONTO(rs.getInt("FIN_DESCONTO"));
            objfinanceiro.setFIN_TOTAL(rs.getInt("FIN_TOTAL"));
            lista.add(objfinanceiro);
        }
        rs.close();
        stm.close();
        return lista;
    }

    
}
