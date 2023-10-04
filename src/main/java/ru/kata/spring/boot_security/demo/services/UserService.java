package ru.kata.spring.boot_security.demo.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.kata.spring.boot_security.demo.entities.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getUsersList();
    User getById(Integer id);
    void addUser(User user);
    void deleteUser(Integer id);
    void editUser(User user);
    User findByUsername(String username);
    void save(User user);


}
