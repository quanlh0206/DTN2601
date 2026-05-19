package org.example.backend.service.impl;

import org.example.backend.repository.IpositionRepository;
import org.example.backend.repository.impl.PositionRepositoryImpl;
import org.example.backend.service.IPositionService;
import org.example.entity.Position;

import java.util.List;

public class PositionServiceImpl implements IPositionService {
    IpositionRepository positionRepository = new PositionRepositoryImpl();
    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }

    @Override
    public boolean insert(String name) {
        return positionRepository.insert(name);
    }

    @Override
    public boolean update(int id, String name) {
        return positionRepository.update(id, name);
    }

    @Override
    public boolean delete(int id) {
        return positionRepository.delete(id);
    }
}
