package com.eric0210.mcinfo;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public abstract interface ICommand extends CommandExecutor {
	public abstract boolean onCommand(CommandSender s, Command c, String l, String[] d);
	public abstract String getCommand();
}
