package com.radio.apirest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ArtistId;
    private String Name;

    public Artist(Long artistId, String name) {
        ArtistId = artistId;
        Name = name;
    }

    public Long getArtistId() {
        return ArtistId;
    }

    public void setArtistId(Long artistId) {
        ArtistId = artistId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
