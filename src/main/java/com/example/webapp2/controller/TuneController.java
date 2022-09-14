package com.example.webapp2.controller;

import com.example.webapp2.model.Tune;
import com.example.webapp2.repo.TuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.List;

@RestController
public class TuneController {

    @Autowired
    TuneRepository tuneRepository;

    @GetMapping("/")
    public List<Tune> tuneList() {
        List<Tune> list = tuneRepository.findAll();
        Tune tune = new Tune();
        tune.setName("current length:" + list.size());
        tune.setArtist("universe");
        tune.setReleaseYear(9999);
        tune.setAdded(LocalTime.now());
        list.add(tune);
        tuneRepository.save(tune);
        return list;

    }
}
