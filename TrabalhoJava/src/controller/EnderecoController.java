package controller;

import dao.EnderecoDao;
import java.util.ArrayList;
import model.EnderecoModel;

public class EnderecoController implements GenericController<EnderecoModel> {

    EnderecoDao enderecodao = new EnderecoDao();

    @Override
    public void incluir(EnderecoModel objendereco) throws Exception {
        enderecodao.incluir(objendereco);
    }

    @Override
    public void alterar(EnderecoModel objendereco) throws Exception {
        enderecodao.alterar(objendereco);
    }

    @Override
    public ArrayList<EnderecoModel> consultar(String filtro) {
        return enderecodao.consultar(filtro);
    }

    @Override
    public void excluir(EnderecoModel objendereco) throws Exception {
        enderecodao.excluir(objendereco);
    }

    @Override
    public void gravar(EnderecoModel objendereco, String operacao) throws Exception {
        if (operacao.equals("incluir")) {
            incluir(objendereco);
        } else {
            alterar(objendereco);
        }
    }

    @Override
    public Exception imprimir() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
