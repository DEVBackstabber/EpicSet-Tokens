package me.backstabber.epicsettokens.api.managers;

import java.util.concurrent.CompletableFuture;

import org.bukkit.entity.Player;

import me.backstabber.epicsettokens.api.data.TokenData;
/**
 * This is the TokensManager used to manage tokens between the database & minecraft
 * @author Backstabber
 *
 */
public interface TokensManager {
	/**
	 * Check if a player's data is cached by the plugin
	 * @param player
	 * @return
	 */
	public boolean isCached(Player player);
	public boolean isCached(String playerName);
	/**
	 * Get a cached instance of tokendata for a player
	 * Cached data is only for previewing data
	 * @param player
	 * @return
	 */
	public TokenData getCached(Player player);
	public TokenData getCached(String playerName);
	/**
	 * Get the latest data for a player from database
	 * This completeablefuture will complete the data once
	 * the database responds with new data.
	 * @param player
	 * @return
	 */
	public CompletableFuture<TokenData> getLatest(Player player);
	public CompletableFuture<TokenData> getLatest(String playerName);
}
