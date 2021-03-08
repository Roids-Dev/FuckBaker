package me.Roids.FuckBaker;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class FuckBakerDiamonds implements Listener {



    @EventHandler
    public void blockBreak(BlockBreakEvent event) {
        Block block = event.getBlock();
        Material material = block.getType();
        if (material.equals(Material.DIAMOND_ORE)) {
            Player player = event.getPlayer();
            if (player.getName().equals("Baker424")) {
                player.setHealth((player.getHealth() - 3));

                player.getInventory().addItem(new ItemStack(Material.COAL, 1));
                player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 1));
            }
        }

        if (material.equals(Material.EMERALD_ORE)) {
            Player player = event.getPlayer();
            if (player.getName().equals("Baker424")) {
                player.setHealth((player.getHealth() - 20));
            }
        }

        if (material.equals(Material.ANCIENT_DEBRIS)) {
            Player player = event.getPlayer();
            if (player.getName().equals("Baker424")) {
                player.setHealth((player.getHealth() - 10));
                player.setExp(0);
            }
        }

        if (material.equals(Material.ANCIENT_DEBRIS)) {
            Player player = event.getPlayer();
            if (player.getName().equals("Baker424")) {
                player.setExp((player.getExp() / 2));;
            }
        }
        
        if (material.equals(Material.STONE)) {
            Player player = event.getPlayer();
            if (player.getName().equals("Baker424")) {
            	player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 40, 0));
            }
        }

    }


}