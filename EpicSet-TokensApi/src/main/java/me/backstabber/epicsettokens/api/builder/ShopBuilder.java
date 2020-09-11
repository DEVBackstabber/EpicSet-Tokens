package me.backstabber.epicsettokens.api.builder;

import org.bukkit.inventory.ItemStack;

import me.backstabber.epicsettokens.api.shops.TokenShop;
/**
 * This is the builder class used to build tokenshops
 * @author Backstabber
 *
 */
public interface ShopBuilder {
	/**
	 * Create a new shop using this method
	 * @throws IllegalArgumentException if a shop by the name already exists
	 * @param name for the shop
	 * @return
	 */
	public static ShopBuilder createNew(String name) {
		return EpicShopBuilder.createNew(name);
	}
	/**
	 * Edit an existing shop using this method
	 * @throws IllegalArgumentException if a shop by the name doesnt exists
	 * @param name of the shop
	 * @return
	 */
	public static ShopBuilder edit(String name) {
		return EpicShopBuilder.edit(name);
	}
	/**
	 * Set the Gui Name (display name) for the shop
	 * @param displayName for the gui
	 * @return
	 */
	public ShopBuilder setDisplayName(String displayName);
	/**
	 * Set the number of rows for the shop
	 * @throws IllegalArgumentException if rows is greater than 6
	 * @param rows of the gui
	 * @return
	 */
	public ShopBuilder setRows(int rows);
	/**
	 * Set the background item for the gui
	 * @param background
	 * @return
	 */
	public ShopBuilder setBackground(ItemStack background);
	/**
	 * Add a new discount to this shop
	 * @param percentage
	 * @param time
	 * @return
	 */
	public ShopBuilder addDiscount(int percentage,int time);
	/**
	 * Remove any discounts associated with this shop
	 * @return
	 */
	public ShopBuilder removeDiscount();
	/**
	 * Add a new shopItem to this shop
	 * To create a ShopItem use ShopItemBuilder
	 * @param slot
	 * @param item
	 * @return
	 */
	public ShopBuilder addItem(int slot,ShopItemBuilder item);
	/**
	 * Remove any item for a slot
	 * @param slot
	 * @return
	 */
	public ShopBuilder removeItem(int slot);
	/**
	 * Get the resulting TokenShop instance
	 * This method also registers the new/modified shop in the ShopManager
	 * @return created/modified tokenshop
	 */
	public TokenShop getShop();
}
