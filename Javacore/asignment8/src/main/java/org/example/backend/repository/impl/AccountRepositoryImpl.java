package org.example.backend.repository.impl;

import org.example.backend.repository.IAccountRepository;
import org.example.entity.Account;
import org.example.entity.Department;
import org.example.entity.Position;
import org.example.enums.PositionName;
import org.example.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountRepositoryImpl implements IAccountRepository {
    @Override
    public List<Account> findAll() {
        List<Account> accounts = new ArrayList<>();
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = """
                    select acc.*,
                           de.department_name,
                           po.position_name
                    from accounts acc
                    left join departments de
                        on acc.department_id = de.department_id
                    left join positions po
                        on acc.position_id = po.position_id
                    """;
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("account_id");
                String email = rs.getString("email");
                String username = rs.getString("username");
                String fullName = rs.getString("full_name");
                int departmentId = rs.getInt("department_id");
                String departmentName = rs.getString("department_name");
                int positionId = rs.getInt("position_id");
                String positionName = rs.getString("position_name");
                Date createDate = rs.getDate("create_date");
                Department department = new Department(departmentId, departmentName);
                Position position = new Position(positionId, PositionName.valueOf(positionName));
                Account account = new Account(id, username, fullName, email, department, position, createDate);
                accounts.add(account);
            }
            JDBCUtils.close(connection,statement,rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return accounts;
    }

    @Override
    public boolean insert(String username, String fullName, String email, int departmentId, int positionId) {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = """
                    insert into accounts(
                        username,
                        full_name,
                        email,
                        department_id,
                        position_id
                    )
                    values (?, ?, ?, ?, ?)
                    """;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, fullName);
            preparedStatement.setString(3, email);
            preparedStatement.setInt(4, departmentId);
            preparedStatement.setInt(5, positionId);
            int c = preparedStatement.executeUpdate();
            JDBCUtils.close(connection,preparedStatement, null);
            return c > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(int id, String newFullName) {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = """
                    update accounts
                    set full_name = ?
                    where account_id = ?
                    """;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newFullName);
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
            String sql = """
                    delete from accounts
                    where username = ?
                    """;
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
