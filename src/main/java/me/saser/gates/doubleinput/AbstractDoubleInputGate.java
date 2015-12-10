package me.saser.gates.doubleinput;

import me.saser.gates.Signal;

public abstract class AbstractDoubleInputGate implements DoubleInputGate {

    protected Signal firstInput, secondInput;

    public AbstractDoubleInputGate(Signal firstInput, Signal secondInput) {
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

}
