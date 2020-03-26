package com.thales.store.DAO;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@SpringBootTest()
public class JdbcUserDAOTests {

    private static final String host = "jdbc:hsqldb:mem:myDb";

    private static final String name = "sa";

    private static final String pass = "sa";

    private void setUpTestDb() {

        String createTableSql = "CREATE TABLE users ( userid int, " +
                "email varchar(255), login varchar(255), address varchar(255))";
        try (
                Connection conn = DriverManager.getConnection(host, name, pass);
                PreparedStatement ps = conn.prepareStatement(createTableSql)
        ) {
            ps.executeUpdate();
            if (conn != null) System.out.println(conn);

        } catch (SQLException e) {
            System.err.format("SQL state: %s\n%s", e.getSQLState(), e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Test
    void findByIdTest() {
    }

    @Test
    void findAllTest() {

        //setUpTestDb();

        //User user = new User(4, "email4", "login4", "addres4");
        //obj.insertOne(user);

        //accessObj.findAll();
        //List<User> result = accessObj.GetAll();
        //result.forEach((y -> System.out.println(y)));
    }
}
