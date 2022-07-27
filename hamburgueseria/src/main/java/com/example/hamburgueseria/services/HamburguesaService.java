package com.example.hamburgueseria.services;
import java.util.ArrayList;
import java.util.Optional;

import com.example.hamburgueseria.models.HamburguesaModel;
import com.example.hamburgueseria.repositories.HamburguesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HamburguesaService {

    @Autowired
    HamburguesaRepository hamburguesaRepository;
    public ArrayList<HamburguesaModel> obtenerHamburguesas(){
        return (ArrayList<HamburguesaModel>) hamburguesaRepository.findAll();
    //findAll metodo de CrudRepository
   }
    public HamburguesaModel guardarHamburguesa(HamburguesaModel hamburguesa){
        return hamburguesaRepository.save(hamburguesa);  //save metodo de CrudRepository
    }//**************** 2da etapa
    public Optional<HamburguesaModel> obtenerPorId(Long id){
        return hamburguesaRepository.findById(id);
    }
    public ArrayList<HamburguesaModel>  obtenerPorPrecio(Integer precio) {
        return hamburguesaRepository.findByPrecio(precio);
    }
    public boolean eliminarHamburguesa(Long id) {
        try{
            hamburguesaRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
