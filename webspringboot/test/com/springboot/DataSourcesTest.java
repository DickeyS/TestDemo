package com.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DataSourcesTest {

    @Autowired
    public javax.sql.DataSource dataSource;

    @Test
    public void test(){
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
