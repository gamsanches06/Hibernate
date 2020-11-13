package controller;

import dao.EnderecoFornecedorDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.EnderecoModel;

public class EnderecoFornecedorController {

    private List<EnderecoModel> listaenderecofornecedor;

    public ArrayList<EnderecoModel> consultar(String filtro) throws SQLException {
        listaenderecofornecedor = new EnderecoFornecedorDao().consultar(filtro);
        return (ArrayList<EnderecoModel>) listaenderecofornecedor;
    }

    public void excluir(EnderecoModel enderecofornecedor) throws SQLException {
        EnderecoFornecedorDao dao = new EnderecoFornecedorDao();
        dao.excluir(enderecofornecedor);
    }

    public void adicionar(EnderecoModel enderecofornecedor) throws SQLException {
        EnderecoFornecedorDao dao = new EnderecoFornecedorDao();
        dao.adicionar(enderecofornecedor);
    }

    public void alterar(EnderecoModel enderecofornecedor) throws SQLException {
        EnderecoFornecedorDao dao = new EnderecoFornecedorDao();
        dao.alterar(enderecofornecedor);
    }

    public void gravar(String operacao, EnderecoModel enderecofornecedor) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(enderecofornecedor);
        } else if (operacao.equals("alterar")) {
            alterar(enderecofornecedor);
        }
    }
    
    public void enviarEmail() {
        
    }
    
    public void exportarExcel() {
        
    }
    
    public void exportarPdf() {
        
    }

}
