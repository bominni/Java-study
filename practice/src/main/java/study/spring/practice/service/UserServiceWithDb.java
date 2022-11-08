package study.spring.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.spring.practice.domain.User;
import study.spring.practice.entity.UserEntity;
import study.spring.practice.repository.UserRepository;

import java.util.Optional;

@Service(value = "userService")
public class UserServiceWithDb implements UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User read(Long userIdx) {
        Optional<UserEntity> optional = userRepository.findById(userIdx);
        if(optional.isPresent()) {
            UserEntity entity = optional.get();
            User user = new User();

            user.setUserIdx(entity.getUserIdx());
            user.setEmail(entity.getEmail());
            user.setPassword(entity.getPassword());
            user.setName(entity.getName());
            user.setRegisterTime(entity.getRegisterTime());
            user.setLastLoginTime(entity.getLastLoginTime());
            user.

            return user;
        } else {
            throw new IllegalArgumentException("존재하지 않는 사용자입니다.")
        }

        return null;
    }

    @Override
    public User read(String email) {
        return null;
    }

    @Override
    public User register(User user) {
        return null;
    }
}
