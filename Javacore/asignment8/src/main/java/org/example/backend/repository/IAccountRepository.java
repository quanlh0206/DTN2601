package org.example.backend.repository;

import org.example.entity.Account;

import java.util.List;

public interface IAccountRepository {
    List<Account> findAll();
    boolean insert(String username, String fullName, String email, int departmentId, int positionId);
    boolean update(int id, String newFullName);
    boolean delete (int id);
}
