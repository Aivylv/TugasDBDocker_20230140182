package com.tugas.deployPertemuan7.repository;

import com.tugas.deployPertemuan7.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
