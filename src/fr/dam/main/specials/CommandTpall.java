package fr.dam.main.specials;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandTpall implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player p){

            if(label.equalsIgnoreCase("tpall")){
                if(args.length > 0){
                    p.sendMessage("Invalid command, type: /rtp");
                    return false;
                }
                Location targetLoc = p.getLocation();
                for(Player pls : Bukkit.getOnlinePlayers()){
                    pls.teleport(targetLoc);
                    if(!pls.getName().equals(p.getName())){
                        pls.sendMessage(ChatColor.GREEN + p.getName() + " teleported you at his location");
                    }
                }
                p.sendMessage(ChatColor.GREEN + "You teleported everyone at your location");
            }
        }
        return false;
    }
}
//done