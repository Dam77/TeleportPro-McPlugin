package fr.dam.main.teleports;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandTp implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;

            if(label.equalsIgnoreCase("/tp")){
                if(args.length == 0){
                    p.sendMessage(ChatColor.RED + "Invalid command, type: /tp [Player]");
                    return false;
                }
                String targetName = args[0];
                if(Bukkit.getPlayer(targetName) == null){
                    p.sendMessage(ChatColor.RED + "Invalid player");
                    return false;
                }
                Player targetPlayer = Bukkit.getPlayer(targetName);

                if(!targetPlayer.isOnline()){
                    p.sendMessage(ChatColor.RED + "Invalid player");
                    return false;
                }
                Location targetLoc = targetPlayer.getLocation();
                p.teleport(targetLoc);
                p.sendMessage(ChatColor.GREEN + "You have been teleported to " + targetPlayer.getName());
            }
        }
        return false;
    }
}
//done