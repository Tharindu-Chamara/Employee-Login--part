package edu.icet.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.dto.User;
import edu.icet.entity.UserEntity;
import edu.icet.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final ObjectMapper mapper;
    final UserRepository userRepository;

    @Override
    public String login(User user) {
        return "";
    }

    @Override
    public String register(User user1) {
       userRepository.save(mapper.convertValue(user1, UserEntity.class));
       return "OK";
    }

}
