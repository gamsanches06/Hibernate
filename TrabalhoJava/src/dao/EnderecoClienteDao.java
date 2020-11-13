package dao;

import java.util.ArrayList;
import model.EnderecoClienteModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class EnderecoClienteDao implements GenericDao<EnderecoClienteModel> {

    @Override
    public void incluir(EnderecoClienteModel objenderecocliente) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(objenderecocliente);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(EnderecoClienteModel objenderecocliente) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(objenderecocliente);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<EnderecoClienteModel> consultar(String filtro) {
        String sql = "from " + EnderecoClienteModel.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<EnderecoClienteModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    @Override
    public void excluir(EnderecoClienteModel objenderecocliente) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(objenderecocliente);
        t.commit();
        session.close();
    }

    @Override
    public EnderecoClienteModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (EnderecoClienteModel) session.load(EnderecoClienteModel.class, id);
    }

}
