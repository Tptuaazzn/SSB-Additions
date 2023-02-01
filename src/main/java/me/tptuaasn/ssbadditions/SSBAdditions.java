package me.tptuaasn.ssbadditions;

import com.bgsoftware.superiorskyblock.api.SuperiorSkyblockAPI;
import me.tptuaasn.ssbadditions.commands.CmdRestart;
import org.bukkit.plugin.java.JavaPlugin;

public final class SSBAdditions extends JavaPlugin {

    @Override
    public void onEnable() {
        SuperiorSkyblockAPI.registerCommand(new CmdRestart());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
