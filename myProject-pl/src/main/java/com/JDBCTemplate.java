package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zornitsa Petkova on 9/15/15.
 */
public class JDBCTemplate {
  private final Provider<Connection> dbConn;

  public JDBCTemplate(Provider<Connection> dbConn) {
    this.dbConn = dbConn;
  }

  public void execute(String query, Object[] params) {
    PreparedStatement stmt = null;
    try {
      stmt = dbConn.get().prepareStatement(query);
      int index = 1;
      for (Object param : params) {
        stmt.setObject(index, param);
        index++;
      }
      stmt.execute();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (stmt != null) {
          stmt.close();
        }
      } catch (SQLException sql) {
        sql.printStackTrace();
      }
    }
  }

  public <T> List<T> execute(String query, RowFetcher<T> fetcher) {
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
      stmt = dbConn.get().prepareStatement(query);
      List<T> addresses = new ArrayList<T>();
      rs = stmt.executeQuery();
      while (rs.next()) {
        addresses.add(fetcher.fetch(rs));
      }
      return addresses;
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (stmt != null && rs != null) {
          stmt.close();
          rs.close();
        }
      } catch (SQLException sql) {
        sql.printStackTrace();
      }
    }
    return null;
  }

  public void makeRequest(String query) {
    PreparedStatement stmt = null;
    try {
      stmt = dbConn.get().prepareStatement(query);
      stmt.execute();
    } catch (SQLException sql) {
      sql.printStackTrace();
    } finally {
      try {
        if (stmt != null) {
          stmt.close();
        }
      } catch (SQLException sql) {
        sql.printStackTrace();
      }
    }
  }

}
