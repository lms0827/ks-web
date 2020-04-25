package com.minseok.app.Repository;

import com.minseok.app.entity.Interests;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterestRepository extends JpaRepository<Interests, Long> {
}