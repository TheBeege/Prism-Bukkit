package me.botsko.prism.appliers;

import java.util.List;

import org.bukkit.entity.Player;

import me.botsko.prism.Prism;
import me.botsko.prism.actionlibs.QueryParameters;
import me.botsko.prism.actions.Action;

public class Undo extends Preview {
	
	
	/**
	 * 
	 * @param plugin
	 * @return 
	 */
	public Undo( Prism plugin, Player player, PrismProcessType processType, List<Action> results, QueryParameters parameters ){
		super(plugin, player, processType, results, parameters);
	}
	
	
	/**
	 * Set preview move and then do a rollback
	 * @return
	 */
	public void preview(){
		player.sendMessage( plugin.messenger.playerError("You can't preview an undo.") );
		return;
	}
}