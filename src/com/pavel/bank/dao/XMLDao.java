package com.pavel.bank.dao;

import java.util.List;

/**
 * Created by Admin on 25.03.15.
 */
public interface XMLDao {
    List<Object> parse(String resourceName);
}
