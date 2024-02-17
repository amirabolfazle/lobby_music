package ir.amirabolfazl.lobby_music;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Lobby_Music extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new myevent(),this);
        getServer().getConsoleSender().sendMessage(ChatColor.RED+"\n"+
                "░█████╗░██╗░░██╗░░░░░░░██████╗████████╗██╗░░░██╗██████╗░██╗░█████╗░\n" +
                "██╔══██╗╚██╗██╔╝░░░░░░██╔════╝╚══██╔══╝██║░░░██║██╔══██╗██║██╔══██╗\n" +
                "███████║░╚███╔╝░█████╗╚█████╗░░░░██║░░░██║░░░██║██║░░██║██║██║░░██║\n" +
                "██╔══██║░██╔██╗░╚════╝░╚═══██╗░░░██║░░░██║░░░██║██║░░██║██║██║░░██║\n" +
                "██║░░██║██╔╝╚██╗░░░░░░██████╔╝░░░██║░░░╚██████╔╝██████╔╝██║╚█████╔╝\n" +
                "╚═╝░░╚═╝╚═╝░░╚═╝░░░░░░╚═════╝░░░░╚═╝░░░░╚═════╝░╚═════╝░╚═╝░╚════╝░");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
