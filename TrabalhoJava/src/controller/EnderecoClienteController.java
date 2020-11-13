package controller;

import dao.EnderecoClienteDao;
import java.util.ArrayList;
import java.util.List;
import model.EnderecoClienteModel;

public class EnderecoClienteController implements GenericController<EnderecoClienteModel>{

    EnderecoClienteDao enderecoclientedao = new EnderecoClienteDao();

    @Override
    public void incluir(EnderecoClienteModel objendcliente) throws Exception {
        enderecoclientedao.incluir(objendcliente);
    }

    @Override
    public void alterar(EnderecoClienteModel objendcliente) throws Exception {
       enderecoclientedao.alterar(objendcliente);
    }

    @Override
    public ArrayList<EnderecoClienteModel> consultar(String filtro) {
       return enderecoclientedao.consultar(filtro);
    }

    @Override
    public void excluir(EnderecoClienteModel objendcliente) throws Exception {
        enderecoclientedao.excluir(objendcliente);
    }

    @Override
    public void gravar(EnderecoClienteModel objendcliente, String operacao) throws Exception {
        if (operacao.equals("incluir")) {
            incluir(objendcliente);
        } else {
            alterar(objendcliente);
        }
    }

    @Override
    public Exception imprimir() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
