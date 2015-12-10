package me.saser.gates.multi;

import me.saser.gates.Signal;

public interface DoubleInputGate extends Signal {

    /**
     * Sets the first input {@link Signal} of this gate.
     * @param input the {@link Signal} to use as first input
     */
    void setFirstInput(Signal input);

    /**
     * Sets the second input {@link Signal} of this gate.
     * @param input the {@link Signal} to use as second input
     */
    void setSecondInput(Signal input);

    /**
     * Sets the input {@link Signal}s to be used for this gate.
     * @param firstInput the first {@link Signal} to use as input
     * @param secondInput the second {@link Signal} to use as input
     */
    void setInputs(Signal firstInput, Signal secondInput);

}
