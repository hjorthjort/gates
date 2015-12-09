package me.saser.gates;

import me.saser.gates.generators.OneGenerator;
import me.saser.gates.generators.ZeroGenerator;
import org.junit.Test;
import static org.junit.Assert.*;

public class GeneratorTest {

    @Test
    public void testOneGenerator() {
        Output generator = new OneGenerator();
        assertTrue("A one generator should always output true", generator.value());
    }

    @Test
    public void testZeroGenerator() {
        Output generator = new ZeroGenerator();
        assertFalse("A zero generator should always output false", generator.value());
    }

}
