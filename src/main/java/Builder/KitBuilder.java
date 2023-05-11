package Builder;

import org.example.Elemento;
import org.example.InterfaceElemento;
import org.example.Kit;

public class KitBuilder implements Builder{
    private Kit currentKit;
    int codigo;
    double precio;

    public KitBuilder(){
        currentKit = new Kit(codigo);
    }
    @Override
    public Builder addElemento(int codigo, double precio) {
        currentKit.add(new Elemento(codigo, precio));
        return this;
    }

    @Override
    public Builder addKit(int codigo) {
        Kit newKit = new Kit(codigo);
        return this;
    }

    @Override
    public InterfaceElemento build() {
        return currentKit;
    }


}
