package fr.dam.main.teleports;

import fr.dam.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;

public class CommandTphere implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;

            if(label.equalsIgnoreCase("tphere")){
                if(args.length==0){
                    p.sendMessage(ChatColor.RED + "Invalid command, type : /tphere [Player]");
                    return false;
                }
                String targetName = args[0];
                if(Bukkit.getPlayer(targetName) == null){
                    p.sendMessage(ChatColor.RED + "Invalid Player, try again.");
                    return false;
                }
                Player targetPlayer = Bukkit.getPlayer(targetName);

                if(!targetPlayer.isOnline()){
                    p.sendMessage(ChatColor.RED + targetPlayer.getName() + "is not online");
                    return false;
                }

                Location targetLoc = p.getLocation();
                targetPlayer.teleport(targetLoc);
                p.sendMessage(ChatColor.GREEN + "You teleported + " + targetPlayer.getName() + " at your location");
                targetPlayer.sendMessage(ChatColor.GREEN + p.getName() + " teleported you at his location");
            }
        }
        return false;
    }
}
//done
