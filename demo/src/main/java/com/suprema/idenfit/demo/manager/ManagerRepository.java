package com.suprema.idenfit.demo.manager;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager,Long> {
    Manager findByUsername(String username);
}
