package com.example.webapp2.repo;

import com.example.webapp2.model.Tune;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TuneRepository extends JpaRepository  <Tune, Integer>{

    Optional<Tune> findByName(String name);

}
