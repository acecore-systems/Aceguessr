package systems.acecore.proxy.aceguessr;

import com.destroystokyo.paper.event.player.PlayerElytraBoostEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class firework_rocket implements Listener {
    @EventHandler
    public void use_rocket(PlayerElytraBoostEvent event){
        event.setShouldConsume(false);
    }
}
