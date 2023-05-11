package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kit implements InterfaceElemento{
    private static final double descuento = 0.1;
    private int codigo;
    private List<InterfaceElemento> elementos = new ArrayList<>();

    public Kit(int codigo, InterfaceElemento... elemento) {
        this.codigo = codigo;
        add(elemento);
    }

    public void add(InterfaceElemento elemento) {
        elementos.add(elemento);
    }

    public void add(InterfaceElemento... elemento) {
        elementos.addAll(Arrays.asList(elemento));
    }

    public void remove(InterfaceElemento elemento) {
        elementos.remove(elemento);
    }

    public void remove(InterfaceElemento... elemento) {
        elementos.removeAll(Arrays.asList(elemento));
    }

    public void clear() {
        elementos.clear();
    }

    @Override
    public double getPrecio() {
        double precio = 0;
        for (InterfaceElemento elemento : elementos) {
            precio += elemento.getPrecio();
        }
        return precio * (1 - descuento);
    }

    @Override
    public int getCodigo() {
        return codigo;
    }
}
