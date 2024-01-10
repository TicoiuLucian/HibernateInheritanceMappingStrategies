package org.example.joinedtable;

import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class JoinedTableDAO {

  public void insertIntoDb() {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();

    Animal animal = new Animal();
    animal.setSpecies("Whatever");

    Pet pet = new Pet();
    pet.setName("Puffy");
    pet.setSpecies("Canine");

    Tiger tiger = new Tiger();
    tiger.setFoodNeededPerDay(5);
    tiger.setSpecies("Deadly");

    session.merge(animal);
    session.merge(pet);
    session.merge(tiger);
    transaction.commit();

    session.close();

    session = sessionFactory.openSession();
    System.out.println(session.get(Pet.class, 2));
    session.close();
    sessionFactory.close();
  }
}
