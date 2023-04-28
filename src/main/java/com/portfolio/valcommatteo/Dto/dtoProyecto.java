/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.valcommatteo.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyecto {

    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String link;
    @NotBlank
    private String imgP;
    
        public dtoProyecto(String nombre, String descripcion, String link, String img) {
        this.nombreP = nombre;
        this.descripcionP = descripcion;
        this.link = link;
        this.imgP = img;
    }

    //Constructor
    public dtoProyecto() {
    }

    //Getter y Setter 
    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombre) {
        this.nombreP = nombre;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcion) {
        this.descripcionP = descripcion;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImgP() {
        return imgP;
    }

    public void setImgP(String img) {
        this.imgP = img;
    }

}
