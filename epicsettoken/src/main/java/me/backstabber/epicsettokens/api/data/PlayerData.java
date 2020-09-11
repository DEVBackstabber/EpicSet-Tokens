package me.backstabber.epicsettokens.api.data;

import me.backstabber.epicsettokens.api.shops.ShopItem;
import me.backstabber.epicsettokens.api.shops.TokenShop;
/**
 * This is a Holder for shop related player's data
 * @author Backstabber
 *
 */
public interface PlayerData {
	/**
	 * Get the total purchases player has made for the 
	 * Specified shop & item
	 * @param shop
	 * @param item
	 * @return number of purchases
	 */
	public int getPurchases(TokenShop shop,ShopItem item);
	/**
	 * Check if player can stil purchase the specified item
	 * This checks only for item limits
	 * @param shop
	 * @param item
	 * @return
	 */
	public boolean canPurchase(TokenShop shop,ShopItem item);
	/**
	 * Check if player has to wait to purchase the specified item.
	 * @param shop
	 * @param item
	 * @return
	 */
	public boolean isDelayed(TokenShop shop,ShopItem item);
	/**
	 * Reset the purchase limit for a shop
	 * @param shop
	 * @param item
	 */
	public void resetLimit(TokenShop shop,ShopItem item);
}
