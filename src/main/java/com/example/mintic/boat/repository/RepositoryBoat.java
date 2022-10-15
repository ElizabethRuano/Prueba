package com.example.mintic.boat.repository;

import java.util.List;
import java.util.Optional;

import com.example.mintic.boat.model.Boat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.mintic.boat.repository.crud.CrudRepositoryBoat;

@Repository
public class RepositoryBoat {
    
    @Autowired
    private CrudRepositoryBoat crudRepositoryBoat;


    public List<Boat> getAll(){
        return (List<Boat>) crudRepositoryBoat.findAll();
    }
    public Optional<Boat> getBoat(int id){
        return crudRepositoryBoat.findById(id);
    }
    
    public Boat save(Boat boat){
        return crudRepositoryBoat.save(boat);
    }

}
