package com.github.rostmyr.jfibers.instrumentation;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.unmodifiableMap;

/**
 * Rostyslav Myroshnychenko
 * on 03.06.2018.
 */
@SuppressFBWarnings(value = "EI_EXPOSE_REP")
public class FiberTransformerResult {
    public byte[] mainClass;
    public Map<String, byte[]> fibers = new HashMap<>();

    void setMainClass(byte[] mainClass) {
        this.mainClass = mainClass;
    }

    void addFiber(String name, byte[] fiber) {
        this.fibers.put(name, fiber);
    }

    public byte[] getMainClass() {
        return mainClass;
    }

    public Map<String, byte[]> getFibers() {
        return unmodifiableMap(fibers);
    }
}
