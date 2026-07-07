package com.example.placementmanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.placementmanagement.entity.Admin;
import com.example.placementmanagement.repository.AdminRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    // CREATE
    public Admin registerAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    // READ ALL
    public List<Admin> getAllAdmins() {
        return (List<Admin>) adminRepository.findAll();
    }

    // READ BY ID
    public Admin getAdminById(Long id) {
        return adminRepository.findById(id).orElse(null);
    }

    // UPDATE
    public Admin updateAdmin(Long id, Admin updatedAdmin) {
        Admin existing = ad`-minRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(updatedAdmin.getName());
            existing.setPassword(updatedAdmin.getPassword());
            return adminRepository.save(existing);
        }
        return null;
    }

    // DELETE
    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }
}