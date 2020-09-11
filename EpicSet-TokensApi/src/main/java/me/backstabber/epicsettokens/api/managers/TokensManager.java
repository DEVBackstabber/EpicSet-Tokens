package me.backstabber.epicsettokens.api.managers;

import java.util.UUID;
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

	/**
	 * Check if a uuid is cached by the plugin
	 * @param uuid of player
	 * @return
	 */
	public boolean isCached(UUID playerUuid);

	/**
	 * Check if a name is cached by the plugin
	 * @param name of player
	 * @return
	 */
	@Deprecated
	public boolean isCached(String playerName);
	/**
	 * Get a cached instance of tokendata for a player
	 * Cached data is only for previewing data
	 * @param player
	 * @return
	 */
	public TokenData getCached(Player player);

	/**
	 * Get a cached instance of tokendata for a uuid
	 * Cached data is only for previewing data
	 * @param uuid of a player
	 * @return
	 */
	public TokenData getCached(UUID playerUuid);

	/**
	 * Get a cached instance of tokendata for a name
	 * Cached data is only for previewing data
	 * @param name of a player
	 * @return
	 */
	@Deprecated
	public TokenData getCached(String playerName);
	/**
	 * Get the latest data for a player from database
	 * This completeablefuture will complete the data once
	 * the database responds with new data.
	 * @param player
	 * @return
	 */
	public CompletableFuture<TokenData> getLatest(Player player);

	/**
	 * Get the latest data for a uuid from database
	 * This completeablefuture will complete the data once
	 * the database responds with new data.
	 * @param uuid of a player
	 * @return
	 */
	public CompletableFuture<TokenData> getLatest(UUID playerUuid);

	/**
	 * Get the latest data for a name from database
	 * This completeablefuture will complete the data once
	 * the database responds with new data.
	 * @param name of a player
	 * @return
	 */
	@Deprecated
	public CompletableFuture<TokenData> getLatest(String playerName);
}
