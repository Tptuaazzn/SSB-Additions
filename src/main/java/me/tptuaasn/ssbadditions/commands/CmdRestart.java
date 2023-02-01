package me.tptuaasn.ssbadditions.commands;

import com.bgsoftware.superiorskyblock.api.SuperiorSkyblock;
import com.bgsoftware.superiorskyblock.api.commands.SuperiorCommand;
import com.bgsoftware.superiorskyblock.api.island.Island;
import com.bgsoftware.superiorskyblock.api.wrappers.SuperiorPlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class CmdRestart implements SuperiorCommand {

    @Override
    public List<String> getAliases() {
        return Arrays.asList("restart", "reset");
    }

    @Override
    public String getPermission() {
        return "superior.island.restart";
    }

    @Override
    public String getUsage(Locale locale) {
        return "restart";
    }

    @Override
    public String getDescription(Locale locale) {
        return "";
    }

    @Override
    public int getMinArgs() {
        return 1;
    }

    @Override
    public int getMaxArgs() {
        return 1;
    }

    @Override
    public boolean canBeExecutedByConsole() {
        return false;
    }

    @Override
    public boolean displayCommand() {
        return true;
    }

    @Override
    public void execute(SuperiorSkyblock plugin, CommandSender commandSender, String[] args) {
        SuperiorPlayer superiorPlayer = plugin.getPlayers().getSuperiorPlayer((Player) commandSender);
        Island island = superiorPlayer.getIsland();

        if(island != null) {
            island.disbandIsland();
            plugin.getMenus().openIslandCreation(superiorPlayer, null, superiorPlayer.getName());
            return;
        }

        plugin.getMenus().openIslandCreation(superiorPlayer, null, superiorPlayer.getName());
    }

    @Override
    public List<String> tabComplete(SuperiorSkyblock superiorSkyblock, CommandSender commandSender, String[] strings) {
        return new ArrayList<>();
    }
}
