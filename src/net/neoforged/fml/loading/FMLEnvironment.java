package net.neoforged.fml.loading;

public final class FMLEnvironment {
    public static Dist getDist() {
        throw new UnsupportedOperationException();
    }

    public enum Dist {
        CLIENT,
        SERVER;

        public boolean isClient() {
            return this == Dist.CLIENT;
        }

        public boolean isServer() {
            return this == Dist.SERVER;
        }
    }
}
