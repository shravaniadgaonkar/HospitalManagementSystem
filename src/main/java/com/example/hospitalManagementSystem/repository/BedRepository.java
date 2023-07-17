package com.example.hospitalManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospitalManagementSystem.entity.BedsEntity;

@Repository
public interface BedRepository extends JpaRepository<BedsEntity, Integer>{

}
