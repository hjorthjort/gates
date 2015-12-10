package me.saser.gates.doubleinput;

import me.saser.gates.Signal;

public class DoubleXorGate extends AbstractDoubleInputGate {

    public DoubleXorGate(Signal firstInput, Signal secondInput) {
        super(firstInput, secondInput);
    }

    @Override
    public boolean value() {
        boolean first = this.firstInput.value();
        boolean second = this.secondInput.value();
        return first ^ second;
    }

}
