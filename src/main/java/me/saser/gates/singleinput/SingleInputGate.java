package me.saser.gates.singleinput;

import me.saser.gates.Signal;

public interface SingleInputGate extends Signal {

    /**
     * Tell this gate to use the given {@link Signal} as the input to itself. The given {@link Signal} will be used to
     * evaluate the value of this gate.
     *
     * @param input the {@link Signal} to use as input for this gate
     */
    void setInput(Signal input);

}
