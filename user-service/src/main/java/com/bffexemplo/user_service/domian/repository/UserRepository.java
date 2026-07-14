package com.bffexemplo.user_service.domian.repository;

import com.bffexemplo.user_service.domian.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
