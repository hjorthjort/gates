package me.saser.gates;

public interface Output {
    /**
     * Get the value of this output with <code>true</code> representing 1 and <code>false</code> representing 0.
     * @return <code>true</code> or <code>false</code>
     */
    boolean value();
}
