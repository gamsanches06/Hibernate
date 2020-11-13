package controller;

import dao.ClienteDao;
import dao.ReceberDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ClienteModel;
import model.ReceberModel;

public class ReceberController {

    private List<ReceberModel> listareceber;

    public ArrayList<ReceberModel> consultar(String filtro) throws SQLException {
        listareceber = new ReceberDao().consultar(filtro);
        return (ArrayList<ReceberModel>) listareceber;
    }

    public void excluir(ReceberModel receber) throws SQLException {
        ReceberDao dao = new ReceberDao();
        dao.excluir(receber);
    }

    public void adicionar(ReceberModel receber) throws SQLException {
        ReceberDao dao = new ReceberDao();
        dao.adicionar(receber);
    }

    public void alterar(ReceberModel receber) throws SQLException {
        ReceberDao dao = new ReceberDao();
        dao.alterar(receber);
    }

    public void gravar(String operacao, ReceberModel receber) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(receber);
        } else if (operacao.equals("alterar")) {
            alterar(receber);
        }
    }
    
    public void enviarEmail() {
        
    }
    
    public void exportarExcel() {
        
    }
    
    public void exportarPdf() {
        
    }

}
