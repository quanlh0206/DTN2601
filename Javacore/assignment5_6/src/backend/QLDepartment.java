package backend;


import entity.Department;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QLDepartment {

    public static List<Department> showDepartment() {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "select * from departments;";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<Department> departments = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("department_id");
                String name = rs.getString("department_name");

                Department dep = new Department(id, name);
                departments.add(dep);
            }
            return departments;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public static List<Department> findByDepartmentIdAndName(int searchId, String searchName) {
        List<Department> departments = new ArrayList<>();
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "select * from departments where department_id = ? and department_name like ?;";
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setInt(1, searchId);
            prepareStatement.setString(2, searchName);

            ResultSet rs = prepareStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("department_id");
                String name = rs.getString("department_name");

                Department dep = new Department(id, name);
                departments.add(dep);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return departments;
    }


    public static boolean insertDerpartment(String newName) {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "insert into departments (department_name) values (?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newName);

            int c = preparedStatement.executeUpdate();
            if (c > 0) {
                return true;
            }  else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean deleteDerpartment(String deleteName) {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "delete from departments where department_name like ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, deleteName);

            int c = preparedStatement.executeUpdate();
            if (c > 0) {
                return true;
            }  else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean updateDepartment(int id, String updateName) {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "update departments set department_name = ? where department_id = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, updateName);
            preparedStatement.setInt(2, id);

            int c = preparedStatement.executeUpdate();
            if (c > 0) {
                return true;
            }  else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}