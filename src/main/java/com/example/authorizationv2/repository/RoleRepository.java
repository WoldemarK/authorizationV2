package com.example.authorizationv2.repository;

import entity.Role;
import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<User, Long> {

    Role findByName(String name);
}
