package org.example.backend.service.impl;

import org.example.backend.repository.IAccountRepository;
import org.example.backend.repository.impl.AccountRepositoryImpl;
import org.example.backend.service.IAccountService;
import org.example.entity.Account;
import org.example.entity.Department;

import java.util.List;

public class AccountServiceImpl implements IAccountService {
    IAccountRepository accountRepository = new AccountRepositoryImpl();

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public boolean insert(String username, String fullName, String email, int departmentId, int positionId) {
        return accountRepository.insert(username,fullName,email,departmentId,positionId);
    }

    @Override
    public boolean update(int id, String newFullName) {
        return accountRepository.update(id, newFullName);
    }

    @Override
    public boolean delete(int id) {
        return accountRepository.delete(id);
    }
}
