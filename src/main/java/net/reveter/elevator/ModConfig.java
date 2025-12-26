package net.reveter.elevator;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name="elevator")
public class ModConfig implements ConfigData {
    public int elevatorDistance = 16;
}
