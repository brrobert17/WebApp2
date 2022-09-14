package com.example.webapp2.model;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
public class Tune {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String artist;

    private Integer releaseYear;
    private LocalTime added;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public LocalTime getAdded() {
        return added;
    }

    public void setAdded(LocalTime added) {
        this.added = added;
    }
}
