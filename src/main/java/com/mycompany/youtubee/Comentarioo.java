/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtubee;

/**
 *
 * @author diana
 */
public class Comentarioo {
    private String Contenido;
    private Usuarioo autor;
    
    public Comentarioo(String contenido, Usuarioo autor){
        this.Contenido = contenido;
        this.autor = autor;
    }
    public String getContenido() {
        return Contenido;
    }
    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }
    public Usuarioo getAutor() {
        return autor;
    }
    public void setAutor(Usuarioo autor) {
        this.autor = autor;
    }
}
