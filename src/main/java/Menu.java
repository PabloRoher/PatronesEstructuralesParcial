import Builder.Builder;
import Builder.KitBuilder;
import org.example.Elemento;
import org.example.Kit;


public class Menu {
    public void main1 (){
        Kit kit = new Kit(1);

        Elemento elemento1 = new Elemento(1, 10);
        Elemento elemento2 = new Elemento(2, 20);
        Elemento elemento3 = new Elemento(3, 30);

        kit.add(elemento1);
        kit.add(elemento2);
        kit.add(elemento3);

        Kit kit2 = new Kit(2);

        Elemento elemento4 = new Elemento(4, 40);
        Elemento elemento5 = new Elemento(5, 50);

        kit2.add(elemento4);
        kit2.add(elemento5);

        kit.add(kit2);

        System.out.println("Sin builder" + kit.getPrecio());
    }

    public void main2(){
        Builder builder = new KitBuilder();
        Kit kit = (Kit) builder.addKit(1)
                .addElemento(1, 10)
                .addElemento(2, 20)
                .addElemento(3, 30)
                .addKit(2)
                .addElemento(4, 40)
                .addElemento(5, 50)
                .build();
        System.out.println("Con builder" + kit.getPrecio());
    }
}