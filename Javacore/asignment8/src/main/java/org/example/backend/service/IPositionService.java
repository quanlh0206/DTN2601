package org.example.backend.service;

import org.example.entity.Position;

import java.util.List;

public interface IPositionService {
    List<Position> findAll();
    boolean insert(String name);
    boolean update(int id, String name);
    boolean delete (int id);
}
