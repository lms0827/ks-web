package com.minseok.app.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SocialMedia {
    @Id
    @GeneratedValue
    private Long id;
    private String instagram;
    private String facebook;

    public SocialMedia() {
    }
    public SocialMedia(String instagram, String facebook) {
        this.instagram = instagram;
        this.facebook = facebook;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }
}
