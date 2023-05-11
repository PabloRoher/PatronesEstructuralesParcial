package org.example;

public class Elemento extends BaseElemento{

    public Elemento(int codigo, double precio) {
        super(codigo, precio);
    }

    @Override
    public int getCodigo() {
        return codigo;
    }
    @Override
    public double getPrecio() {
        return precio;
    }
}
