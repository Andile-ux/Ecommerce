package main.java.com.sportyshoes.service;

import com.sportyshoes.dao.UserDAO;
import com.sportyshoes.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    public User getUserById(Long userId) {
        return userDAO.getUserById(userId);
    }

    public void addUser(User user) {
        userDAO.addUser(user);
    }

    public void updateUser(Long userId, User updatedUser) {
        userDAO.updateUser(userId, updatedUser);
    }

    public void deleteUser(Long userId) {
        userDAO.deleteUser(userId);
    }
}
