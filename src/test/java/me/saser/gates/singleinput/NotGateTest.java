package me.saser.gates.singleinput;

import me.saser.gates.Signal;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NotGateTest {

    private static Signal ZERO, ONE;

    @BeforeClass
    public void setUp() {
        // Set up mock signals
        Signal mockZero = mock(Signal.class);
        when(mockZero.value()).thenReturn(false);
        ZERO = mockZero;

        Signal mockOne = mock(Signal.class);
        when(mockOne.value()).thenReturn(true);
        ONE = mockOne;
    }

    @Test
    public void testTrueBecomesFalse() {
        Signal notOne = new NotGate(ONE);
        assertFalse("A not:ed one (true) should be come zero (false)", notOne.value());
    }

    @Test
    public void testFalseBcomesTrue() {
        Signal notZero = new NotGate(ZERO);
        assertTrue("A not:ed zero (false) should be come one (true)", notZero.value());
    }

}
