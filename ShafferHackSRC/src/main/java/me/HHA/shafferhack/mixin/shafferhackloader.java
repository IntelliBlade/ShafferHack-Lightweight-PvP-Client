package me.HHA.shafferhack.mixin;

import me.HHA.shafferhack.shafferhack;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Mixins;

import java.util.Map;

public class shafferhackloader
        implements IFMLLoadingPlugin {
    private static boolean isObfuscatedEnvironment = false;

    public shafferhackloader() {
        shafferhack.LOGGER.info("\n\nLoading mixins by HHAShaffer");
        MixinBootstrap.init();
        Mixins.addConfiguration("mixins.shafferhack.json");
        MixinEnvironment.getDefaultEnvironment().setObfuscationContext("searge");
        shafferhack.LOGGER.info(MixinEnvironment.getDefaultEnvironment().getObfuscationContext());
    }

    public String[] getASMTransformerClass() {
        return new String[0];
    }

    public String getModContainerClass() {
        return null;
    }

    public String getSetupClass() {
        return null;
    }

    public void injectData(Map<String, Object> data) {
        isObfuscatedEnvironment = (Boolean) data.get("runtimeDeobfuscationEnabled");
    }

    public String getAccessTransformerClass() {
        return null;
    }
}

