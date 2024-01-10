package org.example.tableperclass;

import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TablePerClassDAO {

  public void insertIntoDb() {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();

    Vehicle vehicle = new Vehicle();
    vehicle.setManufacturer("Audi");

    Moto moto = new Moto();
    moto.setHasSidecar(false);
    moto.setManufacturer("Ducati");

    Auto auto = new Auto();
    auto.setNumberOfDoors(3);
    auto.setManufacturer("VW");

    session.merge(vehicle);
    session.merge(auto);
    session.merge(moto);
    transaction.commit();
    session.close();
    sessionFactory.close();
  }
}
