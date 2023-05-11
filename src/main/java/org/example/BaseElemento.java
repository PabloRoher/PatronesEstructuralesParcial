package org.example;

public abstract class BaseElemento implements InterfaceElemento{
    protected int codigo;
    protected double precio;

    public BaseElemento(int codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

}
