package com.example.placementmanagement.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.placementmanagement.entity.Admin;

public interface AdminRepository extends CrudRepository<Admin, Long> {
 
}