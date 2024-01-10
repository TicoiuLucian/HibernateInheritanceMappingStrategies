package org.example;

import org.example.tableperclass.TablePerClassDAO;

public class Main {
  public static void main(String[] args) {

    TablePerClassDAO tablePerClassDAO = new TablePerClassDAO();
    tablePerClassDAO.insertIntoDb();
  }
}