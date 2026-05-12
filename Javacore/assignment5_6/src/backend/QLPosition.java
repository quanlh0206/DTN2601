package backend;

import entity.Position;
import enums.PositionName;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QLPosition {

    public static List<Position> showPosition() {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return positions;
    }

    public static boolean insertPosition(String name) {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "insert into positions(position_name) values (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            int c = preparedStatement.executeUpdate();
            return c > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean deletePosition(String name) {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "delete from positions where position_name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            int c = preparedStatement.executeUpdate();
            return c > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean updatePosition(int id, String updateName) {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = """
                update positions
                set position_name = ?
                where position_id = ?
                """;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, updateName);
            preparedStatement.setInt(2, id);
            int c = preparedStatement.executeUpdate();
            return c > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static List<Position> findPositionByName(String searchName) {
        List<Position> positions = new ArrayList<>();
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = """
                select *
                from positions
                where position_name like ?
                """;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + searchName + "%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("position_id");
                String name = rs.getString("position_name");
                Position position = new Position(id, PositionName.valueOf(name));
                positions.add(position);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return positions;
    }

}