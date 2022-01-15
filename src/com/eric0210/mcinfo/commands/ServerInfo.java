package com.eric0210.mcinfo.commands;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import com.eric0210.mcinfo.CommandHandler;
import com.eric0210.mcinfo.ICommand;

public class ServerInfo implements ICommand {
	public final boolean list = CommandHandler.register(this);

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] d) {
		Server srv = s.getServer();
		s.sendMessage(String.format("Name: %s", new Object[] { srv.getName() }));
		s.sendMessage(String.format("Server Motd: %s", new Object[] { srv.getMotd() }));
		s.sendMessage(String.format("Server IP: %s", new Object[] { srv.getIp() }));
		s.sendMessage(String.format("Server ConnectionThrottle: %s", new Object[] { srv.getConnectionThrottle() }));
		s.sendMessage(String.format("Server Version: %s", new Object[] { srv.getBukkitVersion() }));
		s.sendMessage(String.format("Server Default Gamemode: %s", new Object[] { srv.getDefaultGameMode() }));
		s.sendMessage(String.format("Online Players: %s", new Object[] { srv.getOnlinePlayers() }));
		s.sendMessage(String.format("Server Update Folder", new Object[] { srv.getUpdateFolder() }));
		s.sendMessage(String.format("World Type: %s", new Object[] { srv.getWorldType() }));
		s.sendMessage(String.format("Server ID: %s", new Object[] { srv.getServerId() }));
		s.sendMessage(String.format("Server Name: %s", new Object[] { srv.getServerName() }));
		s.sendMessage(String.format("Server Port: %d", new Object[] { srv.getPort() }));
		s.sendMessage(String.format("World Container: %s", new Object[] { srv.getWorldContainer() }));
		s.sendMessage(String.format("Worldes: %s", new Object[] { srv.getWorlds() }));
		s.sendMessage(String.format("Online Players: %s", new Object[] { srv.getOnlinePlayers()} ));
		s.sendMessage(String.format("Online Players Ammount: %s", new Object[] { Bukkit.getOnlinePlayers().length }));
		return false;
	}

	@Override
	public String getCommand() {
		return "serverinfo";
	}

}
