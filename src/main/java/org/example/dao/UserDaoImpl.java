package org.example.dao;

import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private final DataSource dataSource;

    public UserDaoImpl(DataSource dataSource){
      this.dataSource=dataSource;
  }


    @Override
    public Optional<User> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void add(User user) {

    }
}
