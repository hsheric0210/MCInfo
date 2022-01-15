package com.eric0210.mcinfo.commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.eric0210.mcinfo.CommandHandler;
import com.eric0210.mcinfo.ICommand;

public class WorldInfo implements ICommand {
	public final boolean list = CommandHandler.register(this);

	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] d) {
		if (s instanceof Player)
		{
			Player p = (Player)s;
			World w = p.getWorld();
			s.sendMessage(String.format("World Name: %s", new Object[] { w.getName() }));
			s.sendMessage(String.format("World UID: %s", new Object[] { w.getUID().toString() }));
			s.sendMessage(String.format("World Type: %s", new Object[] { w.getWorldType() }));
			s.sendMessage("");
			s.sendMessage(String.format("World Folder Name: %s", new Object[] { w.getWorldFolder() }));
			s.sendMessage("");
			s.sendMessage("World Players: ");
			for (Player pn : w.getPlayers())
			{
				s.sendMessage(pn.getName());
			}
			s.sendMessage("");
			s.sendMessage(String.format("World Time: %d", new Object[] { w.getFullTime() }));
			s.sendMessage(String.format("World Max Height: %d", new Object[] { w.getMaxHeight() }));
			s.sendMessage(String.format("World Seed: %d", new Object[] { w.getSeed() }));
			s.sendMessage(String.format("World Difficulty: %s", new Object[] { w.getDifficulty() }));
			return true;
		}
		else
		{
			s.sendMessage("Unable to handle command: invalid sender");
		}
		return false;
	}

	@Override
	public String getCommand() {
		return "worldinfo";
	}

}
