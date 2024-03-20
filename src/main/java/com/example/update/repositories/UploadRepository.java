package com.example.update.repositories;

import com.example.update.entities.UploadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UploadRepository extends JpaRepository<UploadEntity, Long> {
}
