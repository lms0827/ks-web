package com.minseok.app.Repository;

import com.minseok.app.entity.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialMediaRepository extends JpaRepository<SocialMedia, Long> {
}