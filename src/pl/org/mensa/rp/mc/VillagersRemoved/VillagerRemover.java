package pl.org.mensa.rp.mc.VillagersRemoved;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class VillagerRemover implements Listener {
	@EventHandler
	public void onMobSpawn(CreatureSpawnEvent e) {
		if (e.getEntityType() == EntityType.ZOMBIE_VILLAGER || e.getEntityType() == EntityType.VILLAGER) {
			e.setCancelled(true);
		}
	}
}
