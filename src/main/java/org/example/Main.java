package org.example;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/market",
                "postgres", "Adil2015");
        Statement st = connection.createStatement();
        st.executeQuery("INSERT INTO product VALUES (7, 'Заварное', '', 150, 2);");
        ResultSet rs = st.executeQuery("select productName from product where id=6");
        rs.next();
        System.out.println(rs.getString(1));
    }
}
