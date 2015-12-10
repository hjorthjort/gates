package me.saser.gates.doubleinput;

import me.saser.gates.Signal;

public class DoubleOrGate extends AbstractDoubleInputGate {

    public DoubleOrGate(Signal firstInput, Signal secondInput) {
        super(firstInput, secondInput);
    }

    @Override
    public boolean value() {
        boolean first = this.firstInput.value();
        boolean second = this.secondInput.value();
        return first || second;
    }

}
