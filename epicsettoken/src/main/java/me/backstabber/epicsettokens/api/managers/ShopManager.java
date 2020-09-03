package me.backstabber.epicsettokens.api.managers;

import java.util.List;

import org.bukkit.entity.Player;
import me.backstabber.epicsettokens.api.shops.TokenShop;
/**
 * This is the ShopManager used to manage all registered shops in the plugin
 * @author Backstabber
 *
 */
public interface ShopManager {
	/**
	 * Get the tokenshop from it's name
	 * @param name of shop
	 * @return
	 */
	public TokenShop getShop(String name);
	/**
	 * Returns names of all acknowledged shops
	 * @return List of all shops
	 */
	public List<String> getAllShops();
	/**
	 * Checks if a shop is registered for a name
	 * @param name of shop
	 * @return if it exists
	 */
	public boolean isShop(String name);
	/**
	 * Checks if a player has a shop open
	 * @param player to check
	 * @return if its open
	 */
	public boolean isShopOpen(Player player);
	/**
	 * Opens a shop for a player
	 * @param player
	 * @param shop
	 */
	public void openShop(Player player , TokenShop shop);
	/**
	 * Gets the shop currently open for the player
	 * @param player
	 * @return TokenShop instance
	 */
	public TokenShop getOpenShop(Player player);
	/**
	 * Delete a tokenshop permanently
	 * @param shop
	 */
	public void deleteShop(TokenShop shop);
	/**
	 * Close shop for a player
	 * @param player
	 */
	public void closeShop(Player player);
}
