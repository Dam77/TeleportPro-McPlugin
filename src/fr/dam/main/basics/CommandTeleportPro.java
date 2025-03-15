package fr.dam.main.basics;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandTeleportPro implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;

            if(label.equalsIgnoreCase("TeleportPro")){
                if(args.length>0){
                    p.sendMessage("/teleportPro or /tppro to get help"); //done
                    p.sendMessage("/tp [Player] to teleport to a certain player"); //done
                    p.sendMessage("/tphere [Player] to teleport a certain player at your location"); //done
                    p.sendMessage("/tpall [Player] to teleport everybody to you or a player if u add player");
                }
            }
        }
        return false;
    }
}
