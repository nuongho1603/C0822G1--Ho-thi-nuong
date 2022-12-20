package com.reponsitory;

import com.modal.Product;
import com.util.ConnecUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sun.swing.SwingUtilities2;

import java.util.List;

public class ProductReponsitory implements IProductReponsitory {
    @Override
    public List<Product> selectAllProduct() {
        List<Product> productList = null;
        Session session = null;
        try {
            session = ConnecUtil.sessionFactory.openSession();
            productList = session.createQuery("FROM Product").getResultList();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return productList;
    }

    @Override
    public Product selectById(int id) {
        Product product = null;
        Session session = null;
        try {
            session = ConnecUtil.sessionFactory.openSession();
            product = (Product) session.createQuery("FROM Product where id = :id").setParameter("id", id).getSingleResult();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return product;
    }

    @Override
    public void update(Product product) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnecUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.merge(product);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }

    }

    @Override
    public List<Product> searchByName(String name) {

        List<Product> productList = null;
        Session session = null;
        try {
            session = ConnecUtil.sessionFactory.openSession();
            productList = session.createQuery("FROM Product where name = :name").setParameter("name", name).getResultList();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnecUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(product);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void delete(int id) {
        Session session = null;
        Transaction transaction = null;
        Product product = selectById(id);
        try {
            session = ConnecUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.remove(product);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
