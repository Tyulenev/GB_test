package ru.GB.Java3.Lesson2;

import java.sql.*;

//Работа с БД
public class J3L2Test1 {
    /**
     * User and Password
     */
    private static final String DATABASE_URL = "jdbc:mysql://192.168.1.78/shop";
    private static final String USER = "holodApp";
    private static final String PASSWORD = "holodec";

    private static Connection connectionToDB;
    private static Statement stm1;
    private static PreparedStatement ps;

    public static void main(String[] args) {
        try {
            connect();
            //insertEx();
            //updateEx();
            //insertEx();

            //ps = connectionToDB.createStatement("INSERT INTO `shop`.`category` (name, discount) VALUES (?, ?);");

            connectionToDB.setAutoCommit(false); //для ускорения работы, смотреть по ситуации
            //selectEx();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }

    }

    private static void selectEx() throws SQLException {
        ResultSet rs1 = stm1.executeQuery("SELECT * FROM shop.category;");
        ResultSetMetaData rsmd = rs1.getMetaData(); //Сколько всего строк и т.д. - метаданные
        while (rs1.next()) {
            System.out.println(rs1.getInt(1) + " " + rs1.getString("name") + " " + rs1.getInt(3));
        }
    }

    private static void updateEx(String s) throws SQLException {
        stm1.executeUpdate("UPDATE `shop`.`category` SET discount = 15 WHERE  discount >20;");
    }

    private static void insertEx() throws SQLException {
        stm1.executeUpdate("INSERT INTO `shop`.`category` (`name`, `discount`) VALUES ('Бейсболки', '0');\n");
    }

    public static void connect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connectionToDB = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        stm1 = connectionToDB.createStatement();
    }
public static void disconnect() {
    try {
        stm1.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    try {
        connectionToDB.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


}
