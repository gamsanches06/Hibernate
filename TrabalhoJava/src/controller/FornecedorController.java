package controller;

import dao.FornecedorDao;
import java.util.ArrayList;
import model.FornecedorModel;

public class FornecedorController implements GenericController<FornecedorModel>{

    FornecedorDao fornecdao = new FornecedorDao();
    @Override
    public void incluir(FornecedorModel objfornec) throws Exception {
        fornecdao.incluir(objfornec);
    }

    @Override
    public void alterar(FornecedorModel objfornec) throws Exception {
        fornecdao.alterar(objfornec);
    }

    @Override
    public ArrayList<FornecedorModel> consultar(String filtro) {
        return fornecdao.consultar(filtro);
    }

    @Override
    public void excluir(FornecedorModel objfornec) throws Exception {
        fornecdao.excluir(objfornec);
    }

    @Override
    public void gravar(FornecedorModel objfornec, String operacao) throws Exception {
        if (operacao.equals("incluir")) {
            incluir(objfornec);
        } else {
            alterar(objfornec);
        }
    }

    @Override
    public Exception imprimir() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
