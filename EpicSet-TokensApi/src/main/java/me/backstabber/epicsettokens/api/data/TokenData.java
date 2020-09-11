package me.backstabber.epicsettokens.api.data;

import java.util.UUID;
/**
 * This is a Holder for player's Tokens data
 * @author Backstabber
 *
 */
public interface TokenData {
	/**
	 * Get the name of the owner of this tokendata
	 * @return name of player
	 */
	public String getPlayerName();
	/**
	 * Get the UUID of the owner
	 * @return uuid of player
	 */
	public UUID getUuid();
	/**
	 * Get the tokens of the owner
	 * @return tokens of player
	 */
	public int getTokens();
	/**
	 * Set the tokens of the owner
	 * @throws IllegalStateException if attempted to set on cached data
	 * @param new tokens to set
	 */
	public void setTokens(int tokens);
}
