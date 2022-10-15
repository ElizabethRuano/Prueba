package com.example.mintic.boat.repository.crud;

import org.springframework.data.repository.CrudRepository;
import com.example.mintic.boat.model.Score;

public interface CrudRepositoryScore extends CrudRepository<Score,Integer> {
    
}
