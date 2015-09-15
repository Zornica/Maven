package com.adapter;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Zornitsa Petkova on 9/15/15.
 */
public interface RowFetcher<T> {

  T fetch(ResultSet rs) throws SQLException;

}
