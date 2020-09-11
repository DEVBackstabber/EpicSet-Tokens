package me.backstabber.epicsettokens.api.shops;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
/**
 * Simple holder for the TokenShop gui's items
 * @author Backstabber
 *
 */
public interface ShopItem {
	/**
	 * Get the slot in which this item is inside the gui
	 * @return slot number
	 */
	public int getSlot();
	/**
	 * Set new limit for this item
	 * @param limit
	 */
	public void setLimit(int limit);
	/**
	 * Get the limit of purchases of this item
	 *  0 or -1 means no limit
	 * @return limit
	 */
	public int getLimit();
	/**
	 * Set the display item to a fixed itemstack
	 * @param itemstack to use as display (can have placeholders in name & lore)
	 */
	public void setDisplayItem(ItemStack display);
	/**
	 * Get the display item of this ShopItem
	 * Since it is displayed differently for each player & shop
	 * so player & linked shop are passed as parameters
	 * @param player
	 * @param EpicTokenShop instance
	 * @return ItemStack used as the display item
	 */
	public ItemStack getDisplayItem(Player player);
	
	/**
	 * Processes a purchase request & sends any
	 * related messages regarding a purchase
	 * @param player
	 * @param shop
	 */
	public void purchase(Player player);
}
