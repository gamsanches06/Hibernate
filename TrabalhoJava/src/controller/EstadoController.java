package controller;

import dao.EstadoDao;
import java.util.ArrayList;
import model.EstadoModel;

public class EstadoController implements GenericController<EstadoModel> {

    EstadoDao estadodao = new EstadoDao();
    @Override
    public void incluir(EstadoModel obj) throws Exception {
    }

    @Override
    public void alterar(EstadoModel obj) throws Exception {
    }

    @Override
    public ArrayList<EstadoModel> consultar(String filtro) {

        return estadodao.consultar(filtro);
    }

    @Override
    public void excluir(EstadoModel obj) throws Exception {
    }

    @Override
    public void gravar(EstadoModel obj, String operacao) throws Exception {
    }

    @Override
    public Exception imprimir() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
