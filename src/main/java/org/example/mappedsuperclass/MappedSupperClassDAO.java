package org.example.mappedsuperclass;

import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MappedSupperClassDAO {

  public void insertIntoDb() {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();

    Janitor janitor = new Janitor();
    janitor.setJanitorName("janitor username");
    janitor.setBadgeSerialNumber("1234567");

    Accountant accountant = new Accountant();
    accountant.setAccountantName("accountant name");
    accountant.setBadgeSerialNumber("23452354");

    session.merge(janitor);
    session.merge(accountant);
    transaction.commit();
    session.close();
    sessionFactory.close();
  }
}
