package org.javaguru.applewarehouse;

import org.javaguru.applewarehouse.Apple;
import org.javaguru.applewarehouse.AppleWarehouse;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppleWarehouseTest {

    private AppleWarehouse warehouse = new AppleWarehouse();

    @Test
    public void shouldFindGreenApples() {
        List<Apple> greenApples = warehouse.findGreenApples();
        assertEquals(greenApples.size(), 3);
    }

    @Test
    public void shouldFindRedApples() {
        List<Apple> greenApples = warehouse.findRedApples();
        assertEquals(greenApples.size(), 3);
    }

}