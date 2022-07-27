package com.example.hamburgueseria.models;
import javax.persistence.*;
    
@Entity
@Table(name = "hamburguesa")

public class HamburguesaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    
    private String nombre;
    private Float precio;
    private String descripcion;
    private String imagen;

    public void setPrecio(Float precio){
        this.precio = precio;
    }
    public Float getPrecio(){
        return precio;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
