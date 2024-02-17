/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtubee;

/**
 *
 * @author diana
 */
public class Videoo {
    public String Titulo;
    public int duracionSegundos;
    public String Url;

    public Videoo(String Titulo, int duracionSegundos, String Url) {
        this.Titulo = Titulo;
        this.duracionSegundos = duracionSegundos;
        this.Url = Url;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }
}
