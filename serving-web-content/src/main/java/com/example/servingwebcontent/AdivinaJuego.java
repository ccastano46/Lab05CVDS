package com.example.servingwebcontent;
public class AdivinaJuego {
    private int numeroMagico;
    private int premio;

    public AdivinaJuego() {
        this.numeroMagico = generarNumeroMagico();
        this.premio = 100000;
    }

    public int getPremio() {
        return premio;
    }

    public boolean adivinar(int numeroUsuario) {
        if (numeroUsuario == numeroMagico) {
            return true;
        } else {
            premio -= 10000;
            return false;
        }
    }

    public void reiniciar() {
        this.numeroMagico = generarNumeroMagico();
        this.premio = 100000;
    }

    private int generarNumeroMagico() {
        return (int) (Math.random() * 10) + 1;
    }
}