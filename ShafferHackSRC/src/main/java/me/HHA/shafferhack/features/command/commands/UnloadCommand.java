package me.HHA.shafferhack.features.command.commands;

import me.HHA.shafferhack.shafferhack;
import me.HHA.shafferhack.features.command.Command;

public class UnloadCommand
        extends Command {
    public UnloadCommand() {
        super("unload", new String[0]);
    }

    @Override
    public void execute(String[] commands) {
        shafferhack.unload(true);
    }
}

