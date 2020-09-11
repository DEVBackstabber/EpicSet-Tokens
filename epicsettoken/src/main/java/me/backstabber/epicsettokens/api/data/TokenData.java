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
	 * @return
	 */
	public UUID getUuid();
	/**
	 * Get the tokens of the owner
	 * @return
	 */
	public int getTokens();
	/**
	 * Set the tokens of the owner
	 * @param tokens
	 */
	public void setTokens(int tokens);
}
