package org.example.backend.service;

import org.example.entity.Account;
import org.example.entity.Department;

import java.util.List;

public interface IAccountService {
    List<Account> findAll();
    boolean insert(String username, String fullName, String email, int departmentId, int positionId);
    boolean update(int id, String newFullName);
    boolean delete (int id);
}
