package me.saser.gates.generators;

import me.saser.gates.Signal;

public class OneGenerator implements Signal {

    @Override
    public boolean value() {
        return true;
    }

}
