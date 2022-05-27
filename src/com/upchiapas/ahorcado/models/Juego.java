package com.upchiapas.ahorcado.models;

public class Juego {
    private byte numeroVidas;
    private String palabra;
    private char[] aux;

    public Juego(byte numeroVidas,
                 String palabra) {
        this.numeroVidas = numeroVidas;
        this.palabra = palabra;
        aux = new char[palabra.length()];
    }
    public boolean buscarLetra(char letra){
        boolean estado = false;
        for(int i=0;i<palabra.length();i++){
            if (palabra.charAt(i) == letra){
                estado = true;
                aux[i] = letra;
            }
        }
        if (!estado)
            quitarVida();
        return estado;
    }
    private void quitarVida(){
        numeroVidas--;
    }
    public String getPalabra() {
        return palabra;
    }
    public byte getNumeroVidas() {
        return numeroVidas;
    }
    public boolean isLive(){
        boolean estado;
        if (numeroVidas >0 )
            estado = true;
        else
            estado = false;
        return estado;
    }
    public char[] getAux(){
        return aux;
    }

    public boolean isEquals() {
        boolean estado = false;
        if (palabra.equals(String.valueOf(aux)))
            estado = true;
        return estado;
    }
}
