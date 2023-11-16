package systems.acecore.proxy.aceguessr;

import org.bukkit.plugin.java.JavaPlugin;

public final class Aceguessr extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new firework_rocket(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
