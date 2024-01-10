package org.example.singletable;

import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SingleTableDAO {

  public void insertIntoDb() {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();

    Product product = new Product();
    product.setName("My first product");

    Book book = new Book();
    book.setAuthor("My first author");
    book.setName("Product name: book");

    Pen pen = new Pen();
    pen.setColour("White");
    pen.setName("Product name: pen");

    session.merge(pen);
    session.merge(product);
    session.merge(book);
    transaction.commit();
    session.close();
    sessionFactory.close();
  }
}
