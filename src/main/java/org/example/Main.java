package org.example;

import org.example.config.ApplicationConfig;
import org.example.controller.UserController;
import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);

        DataSource src = context.getBean(DataSource.class);

        Connection cnn = src.getConnection();
        Statement st = cnn.createStatement();
        ResultSet set = st.executeQuery("SELECT * FROM test");
        while(set.next()) {
            System.out.println(set.getInt(1));
        }
    }
}
