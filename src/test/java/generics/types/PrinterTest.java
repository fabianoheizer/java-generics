package generics.types;

import org.junit.jupiter.api.Test;

class PrinterTest {

    @Test
    void testPrintInteger(){
        Printer p = new Printer(38);
        p.print();

        Printer p2 = new Printer("Java");
        p2.print();
    }
}