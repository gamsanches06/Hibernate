package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.EnderecoModel;

public class EnderecoFornecedorDao {

    private Connection conexao = null;

    public EnderecoFornecedorDao() throws SQLException {
    }

    public void adicionar(EnderecoModel enderecofornecedor) throws SQLException {
        String sql = "INSERT INTO ENDERECO_FORNECEDOR ( ENDFORNEC_LOGRADOURO, ENDFORNEC_CIDADE, ENDFORNEC_TIPO, ENDFORNEC_ESTADOFK, ENDFORNEC_FORNECFK)"
                + " VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        //stm.setInt(1, enderecofornecedor.getEND_ID());
        stm.setString(1, enderecofornecedor.getEND_LOGRADOURO());
        stm.setString(2, enderecofornecedor.getEND_CIDADE());
        stm.setString(3, enderecofornecedor.getEND_TIPO());
        stm.setInt(4, enderecofornecedor.getEND_ESTADOFK());
        stm.execute();
        stm.close();
    }

    public void alterar(EnderecoModel enderecofornecedor) throws SQLException {
        String sql = "UPDATE ENDERECO_FORNECEDOR SET ENDFORNEC_LOGRADOURO = ?, ENDFORNEC_CIDADE = ?, ENDFORNEC_TIPO = ?, "
                + "ENDFORNEC_ESTADOFK = ?, END_FORNECFK = ? WHERE ENDFORNEC_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, enderecofornecedor.getEND_LOGRADOURO());
        stm.setString(2, enderecofornecedor.getEND_CIDADE());
        stm.setString(3, enderecofornecedor.getEND_TIPO());
        stm.setInt(4, enderecofornecedor.getEND_ESTADOFK());
        stm.setInt(6, enderecofornecedor.getEND_ID());
        stm.execute();
        stm.close();
    }

    public void excluir(EnderecoModel enderecofornecedor) throws SQLException {
        String sql = "DELETE FROM ENDERECO_FORNECEDOR WHERE ENDFORNEC_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, enderecofornecedor.getEND_ID());
        stm.execute();
        stm.close();
    }

    public ArrayList<EnderecoModel> consultar(String condicao) throws SQLException {
        ArrayList<EnderecoModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM ENDERECO_FORNECEDOR";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            EnderecoModel objenderecofornec = new EnderecoModel();
            objenderecofornec.setEND_ID(rs.getInt("ENDFORNEC_ID"));
            objenderecofornec.setEND_LOGRADOURO(rs.getString("ENDFORNEC_LOGRADOURO"));
            objenderecofornec.setEND_CIDADE(rs.getString("ENDFORNEC_CIDADE"));
            objenderecofornec.setEND_TIPO(rs.getString("ENDFORNEC_TIPO"));
            objenderecofornec.setEND_ESTADOFK(rs.getInt("ENDFORNEC_ESTADOFK"));
            lista.add(objenderecofornec);
        }
        rs.close();
        stm.close();
        return lista;
    }

    
}
