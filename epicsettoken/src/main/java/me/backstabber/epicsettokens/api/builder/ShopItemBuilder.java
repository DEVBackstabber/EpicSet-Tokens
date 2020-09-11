package me.backstabber.epicsettokens.api.builder;

import java.util.List;

import org.bukkit.inventory.ItemStack;

import me.backstabber.epicsettokens.api.shops.ShopItem;
import me.backstabber.epicsettokens.api.shops.ShopTriggers;
import me.backstabber.epicsettokens.api.shops.TokenShop;
import me.backstabber.epicsettokens.shops.builder.EpicShopItemBuilder;
/**
 * This is the ShopItemBuilder used to build gui items for a tokenshop
 * @author Backstabber
 *
 */
public interface ShopItemBuilder {
	/**
	 * Create a new ShopItem using this method
	 * @param display
	 * @return
	 */
	public static ShopItemBuilder create(ItemStack display) {
		return EpicShopItemBuilder.create(display);
	}
	/**
	 * Set the trigger for this item
	 * @param trigger
	 * @return
	 */
	public ShopItemBuilder setTrigger(ShopTriggers trigger);
	/**
	 * Set the base price (if applicable)
	 * Price is only needed when trigger is set to ITEM
	 * @param price
	 * @return
	 */
	public ShopItemBuilder setPrice(int price);
	/**
	 * Set the limit (if applicable)
	 * limit is only applicable when trigger is set to ITEM
	 * Dont set the limit if you dont want item to have any limit.
	 * @param limit
	 * @return
	 */
	public ShopItemBuilder setLimit(int limit);
	/**
	 * Set wether the display item is given as a reward to the player
	 * @param enabled
	 * @return
	 */
	public ShopItemBuilder giveDisplayItem(boolean enabled);
	/**
	 * Add a reward command to this item
	 * For console command start command with "<ccmd>"
	 * For player command start command with "<pcmd>"
	 * For player message start command with "<pmsg>"
	 * Any command without the prefix will be broadcasted to the server
	 * Use %player% for any player placeholder
	 * @param command
	 * @return
	 */
	public ShopItemBuilder addCommand(String command);
	/**
	 * Set a list of commands for this item
	 * This will over-write any previous commands added
	 * to this item
	 * @param commands
	 * @return
	 */
	public ShopItemBuilder setCommands(List<String> commands);
	/**
	 * Set the shop to open when the item is clicked
	 * This is only applicable if trigger is set to OPEN_SHOP
	 * @param tokenShop
	 * @return
	 */
	public ShopItemBuilder setClickShop(TokenShop tokenShop);
	/**
	 * Get the resulting item for a shop & slot of that shop
	 * @param shop
	 * @param slot
	 * @return
	 */
	public ShopItem getItem(TokenShop shop,int slot);
}
