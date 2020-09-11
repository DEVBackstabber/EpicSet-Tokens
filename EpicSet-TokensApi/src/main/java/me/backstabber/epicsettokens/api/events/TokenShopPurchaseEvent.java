package me.backstabber.epicsettokens.api.events;

import org.bukkit.entity.Player;

import me.backstabber.epicsettokens.api.shops.ShopItem;
import me.backstabber.epicsettokens.api.shops.TokenShop;
/**
 * 	This Event is fired when a shop purchase was sucessfull
 * 	Canceling this will stop player from receiving any rewards
 * @author Backstabber
 *
 */
public class TokenShopPurchaseEvent extends TokenShopEvent {
	private ShopItem item;
	public TokenShopPurchaseEvent(Player player, TokenShop shop,ShopItem item) {
		super(player, shop);
		this.item=item;
	}
	public ShopItem getPurchaseItem() {
		return item;
	}

}
