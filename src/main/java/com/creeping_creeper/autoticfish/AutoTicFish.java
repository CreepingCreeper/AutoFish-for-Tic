package com.creeping_creeper.autoticfish;

import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AutoTicFish.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AutoTicFish
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "autoticfish";
    public AutoTicFish()
    {
    }
}
