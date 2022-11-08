package study.spring.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.spring.practice.entity.UserEntity;

import java.util.Optional;

public class UserRepository extends JpaRepository<UserEntity, Long> {

    public Optional<UserEntity>
}
