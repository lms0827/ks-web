package com.minseok.app.Repository;

import com.minseok.app.entity.skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<skill, Long> {
}