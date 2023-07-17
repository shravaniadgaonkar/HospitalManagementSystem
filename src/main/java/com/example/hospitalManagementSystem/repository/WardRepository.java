package com.example.hospitalManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospitalManagementSystem.entity.WardEntity;

@Repository
public interface WardRepository extends JpaRepository<WardEntity, Integer>{

}
