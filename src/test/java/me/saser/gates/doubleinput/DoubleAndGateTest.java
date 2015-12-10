package me.saser.gates.doubleinput;

import me.saser.gates.Signal;
import org.junit.BeforeClass;

import static org.mockito.Mockito.*;

public class DoubleAndGateTest {

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

}
