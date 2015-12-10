package me.saser.gates.doubleinput;

import me.saser.gates.Signal;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DoubleXorGateTest {

    private static Signal ZERO, ONE;

    @BeforeClass
    public static void setUp() {
        // Set up mock signals
        Signal mockZero = mock(Signal.class);
        when(mockZero.value()).thenReturn(false);
        ZERO = mockZero;

        Signal mockOne = mock(Signal.class);
        when(mockOne.value()).thenReturn(true);
        ONE = mockOne;
    }

    @Test
    public void testTwoOnesGivesZero() {
        Signal firstInput = ONE;
        Signal secondInput = ONE;

        DoubleXorGate gate = new DoubleXorGate(firstInput, secondInput);
        assertFalse("one & one should give one", gate.value());
    }

    @Test
    public void testTwoZeroesGivesZero() {
        Signal firstInput = ZERO;
        Signal secondInput = ZERO;

        DoubleXorGate gate = new DoubleXorGate(firstInput, secondInput);
        assertFalse("zero & zero should give zero", gate.value());
    }

    @Test
    public void testOneAndZeroGivesOne() {
        Signal firstInput = ONE;
        Signal secondInput = ZERO;

        DoubleXorGate gate = new DoubleXorGate(firstInput, secondInput);
        assertTrue("one & zero should give zero", gate.value());

        // Switch places of inputs around
        gate.setInputs(secondInput, firstInput);
        assertTrue("zero & one (flipped around) should give zero", gate.value());
    }

}
