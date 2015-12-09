package me.saser.gates.generators;

import me.saser.gates.Signal;

public class ZeroGenerator implements Signal {

    @Override
    public boolean value() {
        return false;
    }

}
