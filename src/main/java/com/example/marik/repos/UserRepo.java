package com.example.marik.repos;

import com.example.marik.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUserName(String username);
}
