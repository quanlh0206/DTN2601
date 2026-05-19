package org.example.backend.controller;

import org.example.backend.service.IDepartmentService;
import org.example.backend.service.impl.DepartmentServiceImpl;
import org.example.entity.Department;

import java.util.List;

public class DepartmentController {
    IDepartmentService departmentService = new DepartmentServiceImpl();
    public List<Department> findAll(){
       return departmentService.findAll();
    }

    public boolean insert(String name) {
        return departmentService.insert(name);
    }
    public boolean update(int id, String name){
        return departmentService.update(id, name);
    }
    public boolean delete(int id){
        return departmentService.delete(id);
    }

}
