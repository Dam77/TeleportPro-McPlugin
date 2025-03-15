package fr.dam.main.specials;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class CommandRtp implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player p){
            if(label.equalsIgnoreCase("rtp")){
                if(args.length > 0){
                    p.sendMessage(ChatColor.RED + "Invalid command, type: /rtp");
                    return  false;
                }
                ArrayList<Player> randomPlayersList = new ArrayList<>();
                for(Player pls : Bukkit.getOnlinePlayers()){
                    Player rPlayer = new Random(randomPlayersList);
                }

            }
        }
        return false;
    }
}
