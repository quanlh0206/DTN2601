package org.example.backend.controller;

import org.example.backend.service.IAccountService;
import org.example.backend.service.impl.AccountServiceImpl;
import org.example.entity.Account;

import java.util.List;

public class AccountController {
    IAccountService accountService = new AccountServiceImpl();

    public List<Account> findAll() {
        return accountService.findAll();
    }

    public boolean insert(String username, String fullName, String email, int departmentId, int positionId) {
        return accountService.insert(username,fullName,email,departmentId,positionId);
    }

    public boolean update(int id, String newFullName) {
        return accountService.update(id, newFullName);
    }

    public boolean delete(int id) {
        return accountService.delete(id);
    }
}
