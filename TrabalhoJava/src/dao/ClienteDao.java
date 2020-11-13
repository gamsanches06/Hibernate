package dao;

import java.util.ArrayList;
import model.ClienteModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class ClienteDao implements GenericDao<ClienteModel> {

    @Override
    public void incluir(ClienteModel objcliente) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(objcliente);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(ClienteModel objcliente) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(objcliente);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<ClienteModel> consultar(String filtro) {
        String sql = "FROM " + ClienteModel.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<ClienteModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;

    }

    @Override
    public void excluir(ClienteModel objcliente) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(objcliente);
        t.commit();
        session.close();

    }

    @Override
    public ClienteModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (ClienteModel) session.load(ClienteModel.class, id);
    }

}
