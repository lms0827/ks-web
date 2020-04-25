package com.minseok.app.Repository;

import com.minseok.app.entity.work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<work, Long> {
}