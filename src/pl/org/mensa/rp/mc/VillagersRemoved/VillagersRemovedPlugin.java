package pl.org.mensa.rp.mc.VillagersRemoved;

import org.bukkit.plugin.java.JavaPlugin;

public class VillagersRemovedPlugin extends JavaPlugin {
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new VillagerRemover(), this);
	}
}
