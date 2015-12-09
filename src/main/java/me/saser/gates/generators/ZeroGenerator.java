package me.saser.gates.generators;

import me.saser.gates.Output;

public class ZeroGenerator implements Output {

    @Override
    public boolean value() {
        return false;
    }

}
