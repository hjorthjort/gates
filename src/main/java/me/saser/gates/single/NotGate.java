package me.saser.gates.single;

import me.saser.gates.Signal;

public class NotGate implements SingleInputGate {

    private Signal input;

    public NotGate(Signal input) {
        this.input = input;
    }

    @Override
    public void setInput(Signal input) {
        this.input = input;
    }

    @Override
    public boolean value() {
        return !this.input.value();
    }

}
