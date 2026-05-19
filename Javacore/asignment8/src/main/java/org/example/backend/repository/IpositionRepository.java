package org.example.backend.repository;

import org.example.entity.Position;

import java.util.List;

public interface IpositionRepository {
    List<Position> findAll();
    boolean insert(String name);
    boolean update(int id, String name);
    boolean delete (int id);
}
