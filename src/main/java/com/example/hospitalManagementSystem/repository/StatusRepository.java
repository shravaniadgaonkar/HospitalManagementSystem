package com.example.hospitalManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospitalManagementSystem.entity.StatusEntity;

@Repository
public interface StatusRepository extends JpaRepository<StatusEntity, Integer>{

}
