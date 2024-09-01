package net.lightmc.lightLibs;

import co.aikar.commands.PaperCommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class LightLibs extends JavaPlugin {

	public PaperCommandManager commandManager;

	@Override
	public void onEnable() {
		getLogger().info("LightLibs has been enabled!");
		commandManager = new PaperCommandManager(this);
	}

	@Override
	public void onDisable() {
		getLogger().info("LightLibs has been disabled!");
	}
}
