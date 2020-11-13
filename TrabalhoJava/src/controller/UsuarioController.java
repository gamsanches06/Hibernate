package controller;

import dao.UserDao;
import java.util.ArrayList;
import model.Usuario;

public class UsuarioController implements GenericController<Usuario> {

    UserDao usudao = new UserDao();

    @Override
    public void incluir(Usuario objusuario) throws Exception {
        usudao.incluir(objusuario);
    }

    @Override
    public void alterar(Usuario objusuario) throws Exception {
        usudao.alterar(objusuario);
    }

    @Override
    public ArrayList<Usuario> consultar(String filtro) {
        return usudao.consultar(filtro);
    }

    @Override
    public void excluir(Usuario objusuario) throws Exception {
        usudao.excluir(objusuario);
    }

    @Override
    public void gravar(Usuario objusuario, String operacao) throws Exception {
        if (operacao.equals("incluir")) {
            incluir(objusuario);
        } else {
            alterar(objusuario);
        }
    }

    @Override
    public Exception imprimir() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
