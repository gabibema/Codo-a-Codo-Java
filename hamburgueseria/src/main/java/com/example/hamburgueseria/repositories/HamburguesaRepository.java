package com.example.hamburgueseria.repositories;

import java.util.ArrayList;
import com.example.hamburgueseria.models.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HamburguesaRepository extends CrudRepository<HamburguesaModel,Long>{
    public abstract ArrayList<HamburguesaModel> findByPrecio(Integer precio);
}


