package hu.ClashRoyale456.pvPClubDuels.Commands;

import hu.ClashRoyale456.pvPClubDuels.Managers.KitManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;
import org.bukkit.command.*;

public class KitCommand implements CommandExecutor {
    public KitCommand(KitManager kitManager) {
    }

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] strings) {
        if (!(commandSender instanceof Player bukkitPlayer)) {
            commandSender.sendMessage(ChatColor.RED + "You must be a player to use this command.");
        }
        return false;
    }
}
