package me.saser.gates.doubleinput;

import me.saser.gates.Signal;

public class DoubleOrGate implements DoubleInputGate {

    private Signal firstInput, secondInput;

    public DoubleOrGate(Signal firstInput, Signal secondInput) {
        this.firstInput = firstInput;
        this.secondInput = secondInput;
    }

    @Override
    public void setFirstInput(Signal input) {
        this.firstInput = input;
    }

    @Override
    public void setSecondInput(Signal input) {
        this.secondInput = input;
    }

    @Override
    public void setInputs(Signal firstInput, Signal secondInput) {
        this.setFirstInput(firstInput);
        this.setSecondInput(secondInput);
    }

    @Override
    public boolean value() {
        boolean first = this.firstInput.value();
        boolean second = this.secondInput.value();
        return first || second;
    }

}
