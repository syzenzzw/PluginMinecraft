package br.com.elton.pluginMinecraft.listener;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;


public class EltonListener implements Listener {
    int contadorDeBlocos = 0;

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage("Boas vindas ao meu servidor " + event.getPlayer().getName());
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage("Tchau! " + event.getPlayer().getName());
    }

    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event) {
        Block block = event.getBlock();
        Player player = event.getPlayer();
        String username = player.getName();

        contadorDeBlocos++;

        player.sendMessage(String.valueOf(contadorDeBlocos));
    }

}
