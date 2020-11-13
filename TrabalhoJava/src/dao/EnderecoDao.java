package dao;

import java.util.ArrayList;
import model.EnderecoModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class EnderecoDao implements GenericDao<EnderecoModel>{

    @Override
    public void incluir(EnderecoModel objendereco) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(objendereco);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(EnderecoModel objendereco) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(objendereco);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<EnderecoModel> consultar(String filtro) {
        String sql = "from " + EnderecoModel.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<EnderecoModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    @Override
    public void excluir(EnderecoModel objendereco) throws Exception {
       Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(objendereco);
        t.commit();
        session.close();
    }

    @Override
    public EnderecoModel get(long id) {
       Session session = HibernateUtil.getSessionFactory().openSession();
        return (EnderecoModel) session.load(EnderecoModel.class, id);
    }

    
    
}
