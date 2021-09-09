package com.danielluque.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.danielluque.demo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}