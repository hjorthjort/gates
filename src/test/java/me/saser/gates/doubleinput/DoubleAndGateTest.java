package me.saser.gates.doubleinput;

import me.saser.gates.Signal;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class DoubleAndGateTest {

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
    public void testTwoOnesGivesOne() {
        Signal firstInput = ONE;
        Signal secondInput = ONE;

        DoubleAndGate gate = new DoubleAndGate(firstInput, secondInput);
        assertTrue("one & one should give one", gate.value());
    }

    @Test
    public void testTwoZeroesGivesZero() {
        Signal firstInput = ZERO;
        Signal secondInput = ZERO;

        DoubleAndGate gate = new DoubleAndGate(firstInput, secondInput);
        assertFalse("zero & zero should give zero", gate.value());
    }

    @Test
    public void testOneAndZeroGivesZero() {
        Signal firstInput = ONE;
        Signal secondInput = ZERO;

        DoubleAndGate gate = new DoubleAndGate(firstInput, secondInput);
        assertFalse("one & zero should give zero", gate.value());

        // Switch places of inputs around
        gate.setInputs(secondInput, firstInput);
        assertFalse("zero & one (flipped around) should give zero", gate.value());
    }

}
