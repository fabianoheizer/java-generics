package generics.types;

import dto.AppleDTO;
import dto.OrangeDTO;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairTest {

    @Test
    void createListPairIntegerAndString(){
        Pair<Integer, String> pair = new Pair<>(1, "First element");

        List<Pair> pairs = Arrays.asList(pair);

        PairMethods pm = new PairMethods();
        pm.printSizeList(pairs);

        assertEquals(1, pairs.size());
    }

    @Test
    void createListPairStringAndString(){
        Pair<String, String> pair = new Pair<>("1", "First element");
        List<?> pairs = Arrays.asList(pair);
        assertEquals(1, pairs.size());
    }

    @Test
    void creatListOfDTO(){
        AppleDTO appleDTO = new AppleDTO();
        OrangeDTO orangeDTO = new OrangeDTO();
        List<?> list = Arrays.asList(appleDTO, orangeDTO);
        assertEquals(2, list.size());
    }
}