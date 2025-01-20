package br.com.elton.pluginMinecraft;
import br.com.elton.pluginMinecraft.commands.PluginCommands;
import br.com.elton.pluginMinecraft.listener.EltonListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginMinecraft extends JavaPlugin{

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("Plugin Ligado!!!!!");
        this.getServer().getPluginManager().registerEvents(new EltonListener(), this);
        registerEvents();
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("Plugin Desligado!!!!!");
    }

    public void registerEvents() {

    }

}
