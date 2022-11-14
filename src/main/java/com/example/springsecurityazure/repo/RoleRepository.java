package com.example.springsecurityazure.repo;

import com.example.springsecurityazure.model.Role;
import com.example.springsecurityazure.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName roleName);
}
