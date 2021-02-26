package me.HHA.shafferhack.features.command.commands;

import com.mojang.realmsclient.gui.ChatFormatting;
import me.HHA.shafferhack.shafferhack;
import me.HHA.shafferhack.features.command.Command;

public class HelpCommand
        extends Command {
    public HelpCommand() {
        super("help");
    }

    @Override
    public void execute(String[] commands) {
        HelpCommand.sendMessage("Commands: ");
        for (Command command : shafferhack.commandManager.getCommands()) {
            HelpCommand.sendMessage(ChatFormatting.GRAY + shafferhack.commandManager.getPrefix() + command.getName());
        }
    }
}

