package com.eric0210.mcinfo.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.eric0210.mcinfo.CommandHandler;
import com.eric0210.mcinfo.ICommand;

public class PlayerInfo implements ICommand{
	public final boolean list = CommandHandler.register(this);
	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] d) {
		if (s instanceof Player)
		{
			Player p = (Player)s;
			s.sendMessage(String.format("Name: %s", new Object[] { p.getName() }));
			s.sendMessage("");
			s.sendMessage(String.format("UUID: %s", new Object[] { p.getUniqueId() }));
			s.sendMessage(String.format("UUID(Most): %s", new Object[] { p.getUniqueId().getMostSignificantBits() }));
			s.sendMessage(String.format("UUID(Least): %s", new Object[] { p.getUniqueId().getLeastSignificantBits() }));
			s.sendMessage("");
			s.sendMessage(String.format("Entity Class: %s", new Object[] { p.getClass().getCanonicalName() }));
			s.sendMessage("");
			s.sendMessage(String.format("Entity Type: %s", new Object[] { p.getType() }));
			s.sendMessage(String.format("Entity ID: %s", new Object[] { p.getEntityId() }));
			s.sendMessage("");
			s.sendMessage(String.format("X: %f", new Object[] { Double.valueOf(p.getLocation().getX()) }));
			s.sendMessage(String.format("Y: %f", new Object[] { Double.valueOf(p.getLocation().getY()) }));
			s.sendMessage(String.format("Z: %f", new Object[] { Double.valueOf(p.getLocation().getZ()) }));
			s.sendMessage(String.format("Pitch: %f", new Object[] { Double.valueOf(p.getLocation().getPitch()) }));
			s.sendMessage(String.format("Yaw: %f", new Object[] { Double.valueOf(p.getLocation().getYaw()) }));
			s.sendMessage("");
			s.sendMessage(String.format("Connection Host Name: %s", new Object[] { p.getAddress().getHostName() }));
			s.sendMessage(String.format("Connection Host String: %s", new Object[] { p.getAddress().getHostString() }));
			s.sendMessage(String.format("Connection Port: %s", new Object[] { p.getAddress().getPort() }));
			s.sendMessage(String.format("Connection Socket Address: %s", new Object[] { p.getAddress().toString() }));
			
		}
		else
		{
			s.sendMessage(String.format("Name: %s", new Object[] { s.getName() }));
			s.sendMessage(String.format("Class: %s", new Object[] { s.getClass().getCanonicalName() }));
		}
		return true;
	}

	@Override
	public String getCommand() {
		return "playerinfo";
	}
	
}
