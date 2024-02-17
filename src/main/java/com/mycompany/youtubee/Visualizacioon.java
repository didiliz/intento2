/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtubee;

/**
 *
 * @author diana
 */
public class Visualizacioon {
    private Usuarioo espectador;
    private Videoo video;
    
    public Visualizacioon(Usuarioo espectador, Videoo video){
        this.espectador = espectador;
        this.video = video;
    }

    public Usuarioo getEspectador() {
        return espectador;
    }
    public void setEspectador(Usuarioo espectador) {
        this.espectador = espectador;
    }
    public Videoo getVideo() {
        return video;
    }
    public void setVideo(Videoo video) {
        this.video = video;
        }
}
