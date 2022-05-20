package com.org.userservice.repository;

import com.org.userservice.entity.Role;
import com.org.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, String> {


}
