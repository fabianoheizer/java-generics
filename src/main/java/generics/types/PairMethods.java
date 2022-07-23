package generics.types;

import java.util.List;

public class PairMethods<T> {

    public void printSizeList(List<T> pairs) {
        System.out.println(pairs.size());
    }
}
