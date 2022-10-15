package com.example.mintic.boat.repository;

import java.util.List;
import java.util.Optional;

import com.example.mintic.boat.model.Category;
import com.example.mintic.boat.repository.crud.CrudRepositoryCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class RepositoryCategory {

    @Autowired
    private CrudRepositoryCategory crudRepositoryCategory;
    
    public List<Category> getAll(){
        return (List<Category>) crudRepositoryCategory.findAll();
    }
    public Optional<Category> getCategory(int id){
        return crudRepositoryCategory.findById(id);
    }
    
    public Category save(Category category){
        return crudRepositoryCategory.save(category);
    }
}
