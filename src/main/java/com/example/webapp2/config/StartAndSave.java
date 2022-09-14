package com.example.webapp2.config;

import com.example.webapp2.model.Tune;
import com.example.webapp2.repo.TuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartAndSave implements CommandLineRunner {

    @Autowired
    TuneRepository tuneRepository;

//    public StartAndSave(TuneRepository tuneRepository) {
//        this.tuneRepository = tuneRepository;
//    }

    @Override
    public void run(String... args) throws Exception {
        Tune t1 = new Tune();
        t1.setName("Little Wing");
        t1.setArtist("Jimi Hendrix");
        t1.setReleaseYear(1967);
        tuneRepository.save(t1);

        Tune t2 = new Tune();
        t2.setName("Don't Let Me Down");
        t2.setArtist("The Beatles");
        t2.setReleaseYear(1970);
        tuneRepository.save(t2);

        Tune t3 = new Tune();
        t3.setName("Ball and Biscuit");
        t3.setArtist("The White Stripes");
        t3.setReleaseYear(2003);
        tuneRepository.save(t3);
    }
}
