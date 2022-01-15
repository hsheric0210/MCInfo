package com.eric0210.mcinfo;


import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import com.eric0210.mcinfo.commands.InfoList;

public class MCInfo extends JavaPlugin {
	public static final InfoList iflst = new InfoList();
	public static final Logger log = Logger.getLogger("Minecraft");
	public void onEnable()
	{
		log.info("plugin loaded.");
		Bukkit.getPluginManager().registerEvents(new EventListener(), this);
	}
	
	public void onDisable()
	{
		log.info("plugin unloaded.");
	}
	
	public boolean onCommand(CommandSender s, Command c, String l, String[] d)
	{
		return CommandHandler.handleCommand(s,c,l,d);
	}
	
	
}
