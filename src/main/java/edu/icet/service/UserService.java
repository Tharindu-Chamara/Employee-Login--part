package edu.icet.service;

import edu.icet.dto.User;

public interface UserService {
    String login(User user);

    String register(User user1);
}
