package com.eric0210.mcinfo;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class CommandHandler {
	private static List<ICommand> cmdlist = new ArrayList<ICommand>();
	public static boolean handleCommand(CommandSender s, Command c, String l, String[] d) {
		if (c.getName().equalsIgnoreCase("mcinfo"))
		{
			if (d.length > 0)
			{
				for (ICommand ic : cmdlist)
				{
					if (ic.getCommand().equalsIgnoreCase(d[0]))
					{
						return ic.onCommand(s, c, l, d);
					}
				}
				return false;
			}
			else
			{
				s.sendMessage("too few arguments. usage: /mcinfo <infotype>");
			}
		}
		return false;
	}
	
	public static boolean register(ICommand cmd)
	{
		return cmdlist.add(cmd);
	}
}
