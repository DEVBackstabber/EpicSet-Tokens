package me.backstabber.epicsettokens.api;

import org.bukkit.entity.Player;


import me.backstabber.epicsettokens.api.data.PlayerData;
import me.backstabber.epicsettokens.api.managers.ShopManager;
import me.backstabber.epicsettokens.api.managers.TokensManager;
/**
 * This is the api instance of this plugin
 * Since the plugin has two parts
 * tokens & tokenshop only two managers are available
 * @author Backstabber
 *
 */
public interface TokensApi {
	/**
	 * Fetch an instance of the TokensManager used
	 * for storing & updating player's tokens
	 * @return MySqlManager instance
	 */
	public TokensManager getTokensManager();
	/**
	 * Fetch shopmanager instance used to store
	 * open & close tokenshops for players
	 * @return ShopManager instance
	 */
	public ShopManager getShopManager();
	/**
	 * Fetch a player's data containing information about his purchases
	 * @param player
	 * @return
	 */
	public PlayerData getPlayerData(Player player);
	
}
