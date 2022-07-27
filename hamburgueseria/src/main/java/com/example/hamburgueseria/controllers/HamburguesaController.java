package com.example.hamburgueseria.controllers;
import java.util.ArrayList;
import java.util.Optional;
import  com.example.hamburgueseria.models.HamburguesaModel;
import  com.example.hamburgueseria.services.HamburguesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hamburguesas")  
public class HamburguesaController {
    @Autowired
    HamburguesaService hamburguesaService;
    @CrossOrigin   
    @GetMapping()      
    public ArrayList<HamburguesaModel> obtenerHamburguesas(){
        return hamburguesaService.obtenerHamburguesas();
    }
    @CrossOrigin
    @PostMapping()   
    public HamburguesaModel guardarHamburguesa(@RequestBody HamburguesaModel hamburguesa){
        return this.hamburguesaService.guardarHamburguesa(hamburguesa);
    }
 
    @CrossOrigin
    @GetMapping( path = "/{id}")   
    public Optional<HamburguesaModel> obtenerHamburguesasPorId(@PathVariable("id") Long id) {
        return this.hamburguesaService.obtenerPorId(id);
    }
 
    @CrossOrigin
    @GetMapping("/query")       
    public ArrayList<HamburguesaModel> obtenerHamburguesasPorPrecio(@RequestParam("precio") Integer precio){
        return this.hamburguesaService.obtenerPorPrecio(precio);
    }

    @CrossOrigin
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.hamburguesaService.eliminarHamburguesa(id);
        if (ok){
            return "Se eliminó la hamburguesa con id " + id;
        }else{
            return "No pudo eliminar la hamburguesa con id" + id;
        }
    }
}
