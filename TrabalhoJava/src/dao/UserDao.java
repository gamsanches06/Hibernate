package dao;

import java.util.ArrayList;
import model.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class UserDao implements GenericDao<Usuario> {

    @Override
    public void incluir(Usuario objUsuario) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(objUsuario);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(Usuario objUsuario) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(objUsuario);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<Usuario> consultar(String filtro) {
        String sql = "FROM " + Usuario.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<Usuario>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    @Override
    public void excluir(Usuario objUsuario) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(objUsuario);
        t.commit();
        session.close();
    }

    @Override
    public Usuario get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Usuario) session.load(Usuario.class, id);
    }


}
