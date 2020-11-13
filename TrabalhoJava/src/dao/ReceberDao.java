package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ReceberModel;

public class ReceberDao {

    private Connection conexao = null;

    public ReceberDao() throws SQLException {
    }

    public void adicionar(ReceberModel receber) throws SQLException {
        String sql = "INSERT INTO RECEBER (REC_NFE, REC_CLIEIDFK, REC_FINIDFK)"
                + " VALUES (?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, receber.getREC_NFE());
        stm.setInt(2, receber.getREC_CLIEIDFK());
        stm.setInt(3, receber.getREC_FINIDFK());
        stm.execute();
        stm.close();
    }

    public void alterar(ReceberModel receber) throws SQLException {
        String sql = "UPDATE RECEBER SET REC_NFE = ?, REC_CLIEIDFK = ?, REC_FINIDFK = ?, "
                + "WHERE REC_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, receber.getREC_NFE());
        stm.setInt(2, receber.getREC_CLIEIDFK());
        stm.setInt(3, receber.getREC_FINIDFK());
        stm.setInt(6, receber.getREC_ID());
        stm.execute();
        stm.close();
    }

    public void excluir(ReceberModel receber) throws SQLException {
        String sql = "DELETE FROM RECEBER WHERE REC_ID= ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, receber.getREC_ID());
        stm.execute();
        stm.close();
    }

    public ArrayList<ReceberModel> consultar(String condicao) throws SQLException {
        ArrayList<ReceberModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM CLIENTE";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            ReceberModel objreceber = new ReceberModel();
            objreceber.setREC_ID(rs.getInt("REC_ID"));
            objreceber.setREC_NFE(rs.getString("REC_NFE"));
            objreceber.setREC_CLIEIDFK(rs.getInt("REC_CLIEIDFK"));
            objreceber.setREC_FINIDFK(rs.getInt("REC_FINIDFK"));
            lista.add(objreceber);
        }
        rs.close();
        stm.close();
        return lista;
    }

    
}
