package ir.amirabolfazl.lobby_music;

import com.destroystokyo.paper.event.player.PlayerReadyArrowEvent;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
public class myevent implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.RED + "\n" + "\n" +
                "░█████╗░██╗░░██╗░░░░░░██╗░░░██╗░░███╗░░\n" +
                "██╔══██╗╚██╗██╔╝░░░░░░██║░░░██║░████║░░\n" +
                "███████║░╚███╔╝░█████╗╚██╗░██╔╝██╔██║░░\n" +
                "██╔══██║░██╔██╗░╚════╝░╚████╔╝░╚═╝██║░░\n" +
                "██║░░██║██╔╝╚██╗░░░░░░░░╚██╔╝░░███████╗\n" +
                "╚═╝░░╚═╝╚═╝░░╚═╝░░░░░░░░░╚═╝░░░╚══════╝\n");
        player.playSound(player.getLocation(), Sound.MUSIC_DISC_CAT,1f, 1f);
    }
}


