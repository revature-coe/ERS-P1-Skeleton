package com.revature.repositories;

import com.revature.models.User;

import java.util.Optional;

public class UserDAO {

    public Optional<User> getByUsername(String username) {
        return Optional.empty();
    }

    public User save(User userToBeRegistered) {
        return userToBeRegistered;
    }
}
