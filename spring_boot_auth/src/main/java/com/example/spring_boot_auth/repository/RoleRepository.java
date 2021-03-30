package com.example.spring_boot_auth.repository;

import com.example.spring_boot_auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
