package listaDuplamenteEncadeada.TESTS;


import listaDuplamenteEncadeada.DLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DLinkedListTest {

    @Test
    void testAddHead() {
        DLinkedList d = new DLinkedList();
        assertEquals("[]", d.toString(), "Deve imprimir []");

        d.addHead("BOS");
        assertEquals("[BOS]", d.toString(), "Deve imprimir [BOS]");

        d.addHead("ATL");
        assertEquals("[ATL, BOS]", d.toString(), "Deve imprimir [ATL, BOS]");

        d.addHead("MSP");
        assertEquals("[MSP, ATL, BOS]", d.toString(), "Deve imprimir [MSP, ATL, BOS]");

        d.addHead("LAX");
        assertEquals("[LAX, MSP, ATL, BOS]", d.toString(), "Deve imprimir [LAX, MSP, ATL, BOS]");
    }

    @Test
    void testAddTail() {
        DLinkedList d = new DLinkedList();
        assertEquals("[]", d.toString(), "Deve imprimir []");

        d.addTail("MSP");
        assertEquals("[MSP]", d.toString(), "Deve imprimir [MSP]");

        d.addTail("ATL");
        assertEquals("[MSP, ATL]", d.toString(), "Deve imprimir [MSP, ATL]");

        d.addTail("BOS");
        assertEquals("[MSP, ATL, BOS]", d.toString(), "Deve imprimir [MSP, ATL, BOS]");

        d.addTail("MIA");
        assertEquals("[MSP, ATL, BOS, MIA]", d.toString(), "Deve imprimir [MSP, ATL, BOS, MIA]");
    }

    @Test
    void testRemoveFirst() {
        DLinkedList d = new DLinkedList();
        assertEquals("[]", d.toString(), "Deve imprimir []");

        d.addTail("MSP");
        assertEquals("[MSP]", d.toString(), "Deve imprimir [MSP]");

        d.addTail("BOS");
        assertEquals("[MSP, BOS]", d.toString(), "Deve imprimir [MSP, BOS]");

        d.removeFirst();
        assertEquals("[BOS]", d.toString(), "Deve imprimir [BOS]");

        d.removeFirst();
        assertEquals("[]", d.toString(), "Deve imprimir []");


    }

    @Test
    void testRemoveLast() {
        DLinkedList d = new DLinkedList();
        assertEquals("[]", d.toString(), "Deve imprimir []");

        d.addTail("MSP");
        assertEquals("[MSP]", d.toString(), "Deve imprimir [MSP]");

        d.addTail("BOS");
        assertEquals("[MSP, BOS]", d.toString(), "Deve imprimir [MSP, BOS]");

        d.removeLast();
        assertEquals("[MSP]", d.toString(), "Deve imprimir [MSP]");

        d.removeLast();
        assertEquals("[]", d.toString(), "Deve imprimir []");

    }
}
