package me.vince;


import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {

	
	@Override
	public void onEnable() {
		new BlockListener(this);
	   
	}
	
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("blank") && sender instanceof Player) {
			
			Player player = (Player) sender;

		    }
			
			return true;
		}
	
	return false;
	}
	
	
	
	
}
