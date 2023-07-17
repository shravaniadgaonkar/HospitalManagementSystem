package com.example.hospitalManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospitalManagementSystem.entity.RolesEntity;

@Repository
public interface RoleRepository extends JpaRepository<RolesEntity, Integer>{

}
