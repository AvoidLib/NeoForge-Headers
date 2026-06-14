package net.neoforged.bus.api;

import java.util.function.Consumer;

public abstract class IEventBus {
    public abstract void addListener(Consumer<?> callback);
}
