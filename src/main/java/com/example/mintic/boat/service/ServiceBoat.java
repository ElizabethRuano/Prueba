package com.example.mintic.boat.service;

import java.util.List;
import java.util.Optional;

import com.example.mintic.boat.model.Boat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mintic.boat.repository.RepositoryBoat;

@Service
public class ServiceBoat {
    
    @Autowired
    private RepositoryBoat repositoryBoat;

    
    public List<Boat> getAll() {
        return repositoryBoat.getAll();
    }

    public Optional<Boat> getBoat(int id) {
        return repositoryBoat.getBoat(id);
    }

    public Boat save(Boat boat) {
        if (boat.getId() == null) {
            return repositoryBoat.save(boat);
        } else {
            Optional<Boat> boat1 = repositoryBoat.getBoat(boat.getId());
            if (boat1.isEmpty()) {
                return repositoryBoat.save(boat);
            } else {
                return boat;
            }
        }
    }

}
