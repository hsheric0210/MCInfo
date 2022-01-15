package com.eric0210.mcinfo.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.eric0210.mcinfo.CommandHandler;
import com.eric0210.mcinfo.ICommand;

public class ItemInfo implements ICommand
{
	public final boolean list = CommandHandler.register(this);

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] d)
	{
		if (s instanceof Player)
		{
			Player p = (Player) s;
			ItemStack i = p.getItemInHand();
			s.sendMessage(String.format("%s[type: %s(id: %d), amount: %d, durability(data): %d]", new Object[] {
					(i.hasItemMeta() ? i.getItemMeta().getDisplayName() : i.getType()), i.getType(), i.getTypeId(),
					i.getAmount(), i.getDurability()
			}));
			s.sendMessage(String.format("- Max Stack Size: %s", new Object[] {
					i.getMaxStackSize()
			}));
			s.sendMessage(String.format("- Java Instance Information:" + " %s[name: %s, cname: %s]", new Object[] {
					i.getClass(), i.getClass().getName(), i.getClass().getCanonicalName()
			}));
			if (i.hasItemMeta() && i.getItemMeta().hasEnchants())
			{
				s.sendMessage("- Enchantments: ");
				for (Enchantment ench : i.getEnchantments().keySet())
				{
					int value = i.getEnchantments().get(ench);
					if (i != null)
					{
						s.sendMessage(String.format("  - %s(id: %d, level: %d)", new Object[] {
								ench.getName(), ench.getId(), value
						}));
					}
				}
			}
		}
		else
		{
			s.sendMessage("This command must be executed by a player!");
		}
		return false;
	}

	@Override
	public String getCommand()
	{
		return "iteminfo";
	}
}
