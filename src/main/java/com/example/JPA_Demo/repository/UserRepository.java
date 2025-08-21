package com.example.JPA_Demo.repository;

import com.example.JPA_Demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{

}
