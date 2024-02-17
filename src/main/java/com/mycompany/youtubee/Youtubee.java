/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtubee;

/**
 *
 * @author diana
 */
public class Youtubee {

    public static void main(String[] args) {
        Usuarioo usuario= new Usuarioo ("Montero");
        Videoo video= new Videoo ("Aprendiendo Java", 2400, "Http//monmon.com");
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();
        
        Usuarioo usuario2=new Usuarioo("PERLA");
            Comentarioo comment1=new Comentarioo("Asco de página", usuario2);
            System.out.println("El usuario "+ usuario2.getNombre()+ " publicó el comentario "+ comment1.getContenido());
    }
}
