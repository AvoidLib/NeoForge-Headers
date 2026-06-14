package net.neoforged.fml.loading;

import net.neoforged.fml.loading.moddiscovery.ModFileInfo;

import java.nio.file.Path;
import java.util.List;

public final class FMLLoader {
    public static FMLLoader getCurrent() {
        throw new UnsupportedOperationException();
    }
    public static Path getGameDir() {
        throw new UnsupportedOperationException();
    }
    public static LoadingModList getLoadingModList() {
        throw new UnsupportedOperationException();
    }

    public static abstract class LoadingModList {
        public abstract List<ModFileInfo> getModFiles();
    }
}
