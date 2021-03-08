package me.Roids.FuckBaker;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Startup
        // reloads
        // plugin reloads
        this.getServer().getPluginManager().registerEvents(new FuckBakerDiamonds(), this);
    }

    @Override
    public void onDisable() {
        // shutdown
        // reload
        // plugin reloads
    	// this is a test
    }


    public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
        if (cmd.getName().equalsIgnoreCase("gohome")) {
            if (sender instanceof Player) {
                // player
                Player player = (Player) sender;
                if (player.getName().equals("Baker424")) {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&5&lGet Fucked &cG&aA&bY &5Boi"));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 36000, 0));
                    return true;
                }
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lYou are not baker!"));
                return true;
            } else {
                // console
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lYou are the console not baker!"));
            }

        }

        return false;
    }


}