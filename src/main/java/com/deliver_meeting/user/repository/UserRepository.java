package com.deliver_meeting.user.repository;

import com.deliver_meeting.user.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Long, Users> {
    Optional<Users> findByUsername(String username);
}
