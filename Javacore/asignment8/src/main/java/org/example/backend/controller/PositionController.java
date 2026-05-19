package org.example.backend.controller;

import org.example.backend.service.IPositionService;
import org.example.backend.service.impl.PositionServiceImpl;
import org.example.entity.Position;

import java.util.List;

public class PositionController {
    IPositionService positionService = new PositionServiceImpl();
    public List<Position> findAll(){
        return positionService.findAll();
    }

    public boolean insert(String name) {
        return positionService.insert(name);
    }
    public boolean update(int id, String name){
        return positionService.update(id, name);
    }
    public boolean delete(int id){
        return positionService.delete(id);
    }
    public boolean checkExistName(String name, Integer id){
        return positionService.checkExistName(name, id);
    }

    public boolean checkIdExist(int id){
        return positionService.checkIdExist(id);
    }
}
