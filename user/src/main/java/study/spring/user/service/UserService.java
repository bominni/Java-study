package study.spring.user.service;

import study.spring.user.domain.User;

public interface UserService {

    public User read(Long userIdx);

    public User read(String email);

    public User register(User user);

}
