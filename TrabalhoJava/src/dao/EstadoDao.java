package dao;

import java.util.ArrayList;
import model.EstadoModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class EstadoDao implements GenericDao<EstadoModel> {

    @Override
    public void incluir(EstadoModel objEstado) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(objEstado);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(EstadoModel objEstado) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(objEstado);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<EstadoModel> consultar(String filtro) {
        String sql = "FROM " + EstadoModel.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<EstadoModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    @Override
    public void excluir(EstadoModel objEstado) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(objEstado);
        t.commit();
        session.close();
    }

    @Override
    public EstadoModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (EstadoModel) session.load(EstadoModel.class, id);
    }
}
