package me.saser.gates.single;

import me.saser.gates.Signal;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NotGateTest {

    @Test
    public void testTrueBecomesFalse() {
        // Set up a mock signal that always outputs true
        Signal one = mock(Signal.class);
        when(one.value()).thenReturn(true);

        Signal notOne = new NotGate(one);
        assertFalse("A not:ed one (true) should be come zero (false)", notOne.value());
    }

    @Test
    public void testFalseBcomesTrue() {
        // Set up a mock signal that always outputs false
        Signal zero = mock(Signal.class);
        when(zero.value()).thenReturn(false);

        Signal notZero = new NotGate(zero);
        assertTrue("A not:ed zero (false) should be come one (true)", notZero.value());
    }

}
