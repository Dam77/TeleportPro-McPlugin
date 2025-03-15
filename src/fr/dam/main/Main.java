package fr.dam.main;

import fr.dam.main.basics.CommandTeleportPro;
import fr.dam.main.specials.CommandRtp;
import fr.dam.main.specials.CommandTpall;
import fr.dam.main.teleports.CommandTp;
import fr.dam.main.teleports.CommandTphere;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {



    @Override
    public void onEnable() {
        getCommand("TeleportPro").setExecutor(new CommandTeleportPro());
        getCommand("tp").setExecutor(new CommandTp());
        getCommand("tphere").setExecutor(new CommandTphere());
        getCommand("tpall").setExecutor(new CommandTpall());
        getCommand("rtp").setExecutor(new CommandRtp());
    }

    @Override
    public void onDisable() {

    }
}
