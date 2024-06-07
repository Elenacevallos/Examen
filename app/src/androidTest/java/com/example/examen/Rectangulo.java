package com.example.examen;

public class Rectangulo {
    private float bas;
    private float alt;

    public Rectangulo(float bas, float alt) {
        this.bas = bas;
        this.alt = alt;
    }

    public float calcularArea() {
        return bas * alt;
    }

    public float calcularPerimetro() {
        return 2 * (bas + alt);
    }
}
