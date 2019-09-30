import java.util.ArrayList;

public class SuperArrayList<E> extends ArrayList {
    public <E> void add(E ... elements) {
        for(int index = 0; index < elements.length; index++) {
            add(elements[index]);
        }
    }
}

