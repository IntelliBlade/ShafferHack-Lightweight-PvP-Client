package me.HHA.shafferhack.features.command.commands;

import me.HHA.shafferhack.shafferhack;
import me.HHA.shafferhack.features.command.Command;

public class ReloadCommand
        extends Command {
    public ReloadCommand() {
        super("reload", new String[0]);
    }

    @Override
    public void execute(String[] commands) {
        shafferhack.reload();
    }
}

