package winlyps.noDrowningDamage

import org.bukkit.plugin.java.JavaPlugin

class NoDrowningDamage : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("drowningDamage", "false")
        }
        logger.info("NoDrowningDamage plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("NoDrowningDamage plugin has been disabled.")
    }
}