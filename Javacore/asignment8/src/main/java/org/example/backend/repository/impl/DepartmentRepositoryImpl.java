package org.example.backend.repository.impl;

import org.example.backend.repository.IDepartmentRepository;
import org.example.entity.Department;
import org.example.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DepartmentRepositoryImpl implements IDepartmentRepository {
    @Override
    public List<Department> findAll() {
        List<Department> departments = new ArrayList<>();
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "select * from departments order by department_id asc;";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("department_id");
                String name = rs.getString("department_name");

                Department dep = new Department(id, name);
                departments.add(dep);
            }
            JDBCUtils.close(connection,statement,rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return departments;
    }

    public boolean insert(String name){
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "insert into departments (department_name) values (?);";
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
            String sql = "update departments set department_name = ? where department_id = ?;";
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
            String sql = "delete from departments where department_id = ?;";
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

    @Override
    public boolean checkExistName(String name, Integer id) {
        boolean check = false;
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "select *from departments where department_name like ? ";
            if (Objects.nonNull(id)){
                sql += " and department_id != ? ";
            }
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            if (Objects.nonNull(id)){
                preparedStatement.setInt(2, id);
            }
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next()){
                check = true;
            }
            JDBCUtils.close(connection,preparedStatement,rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }

    @Override
    public boolean checkIdExist(int id) {
        boolean check = false;
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "select * from departments where department_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                check = true;
            }
            JDBCUtils.close(connection, preparedStatement, rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }
}
