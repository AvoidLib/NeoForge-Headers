package net.neoforged.bus.api;

import java.util.function.Consumer;

public abstract class IEventBus {
    public abstract <T> void addListener(Consumer<T> callback);
}
