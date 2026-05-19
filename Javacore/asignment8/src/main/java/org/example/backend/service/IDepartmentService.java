package org.example.backend.service;

import org.example.entity.Department;

import java.util.List;

public interface IDepartmentService {
    List<Department> findAll();
    boolean insert(String name);
    boolean update(int id, String name);
    boolean delete (int id);
    boolean checkExistName(String name, Integer id);
    boolean checkIdExist(int id);
}
