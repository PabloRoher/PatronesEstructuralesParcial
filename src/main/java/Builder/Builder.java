package Builder;

import org.example.InterfaceElemento;

public interface Builder {
    Builder addElemento(int codigo, double precio);
    Builder addKit(int codigo);
    InterfaceElemento build();
}
