package org.example.backend.repository.impl;

import org.example.backend.repository.IpositionRepository;
import org.example.entity.Position;
import org.example.enums.PositionName;
import org.example.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PositionRepositoryImpl implements IpositionRepository {
    @Override
    public List<Position> findAll() {
        List<Position> positions = new ArrayList<>();
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "select * from positions";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("position_id");
                String name = rs.getString("position_name");
                Position position = new Position(id, PositionName.valueOf(name));
                positions.add(position);
            }
            JDBCUtils.close(connection,statement,rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return positions;
    }

    @Override
    public boolean insert(String name) {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "insert into positions(position_name) values (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            int c = preparedStatement.executeUpdate();
            JDBCUtils.close(connection,preparedStatement,null);
            return c > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(int id, String name) {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = """
                update positions
                set position_name = ?
                where position_id = ?
                """;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, id);
            int c = preparedStatement.executeUpdate();
            JDBCUtils.close(connection,preparedStatement,null);
            return c > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "delete from positions where position_name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int c = preparedStatement.executeUpdate();
            JDBCUtils.close(connection,preparedStatement,null);
            return c > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
