package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.PagarModel;

public class PagarDao {

    private Connection conexao = null;

    public PagarDao() throws SQLException {
    }

    public void adicionar(PagarModel pagar) throws SQLException {
        String sql = "INSERT INTO PAGAR (PAG_BOLETO, PAG_FINIDFK, PAG_FORNECIDFK)"
                + " VALUES (?, ?, ?,)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, pagar.getPAG_BOLETO());
        stm.setInt(2, pagar.getPAG_FINIDFK());
        stm.setInt(3, pagar.getPAG_FORNECIDFK());
        stm.execute();
        stm.close();
    }

    public void alterar(PagarModel pagar) throws SQLException {
        String sql = "UPDATE PAGAR SET PAG_BOLETO = ?, PAG_FINIDFK = ?, PAG_FORNECIDFK= ? "
                + " WHERE PAG_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, pagar.getPAG_BOLETO());
        stm.setInt(2, pagar.getPAG_FINIDFK());
        stm.setInt(3, pagar.getPAG_FORNECIDFK());
        stm.setInt(6, pagar.getPAG_ID());
        stm.execute();
        stm.close();
    }

    public void excluir(PagarModel pagar) throws SQLException {
        String sql = "DELETE FROM PAGAR WHERE PAG_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, pagar.getPAG_ID());
        stm.execute();
        stm.close();
    }

    public ArrayList<PagarModel> consultar(String condicao) throws SQLException {
        ArrayList<PagarModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT FIN_ID, FIN_NUMERO, FORNEC_NOME, FORNEC_EMAIL"
                + "FROM FINANCEIRO JOIN PAGAR ON FIN_ID = PAG_FINIDFK JOIN FORNECEDOR"
                + "ON PAG_FORNECIDFK = FORNEC_ID";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            PagarModel objpagar = new PagarModel();
            objpagar.setPAG_ID(rs.getInt("PAG_ID"));
            objpagar.setPAG_BOLETO(rs.getString("PAG_BOLETO"));
            objpagar.setPAG_FINIDFK(rs.getInt("PAG_FINIDFK"));
            objpagar.setPAG_FORNECIDFK(rs.getInt("PAG_FORNECIDFK"));
            lista.add(objpagar);
        }
        rs.close();
        stm.close();
        return lista;
    }

}
