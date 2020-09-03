package me.backstabber.epicsettokens.api.events;

import org.bukkit.entity.Player;

import me.backstabber.epicsettokens.api.shops.ShopItem;
import me.backstabber.epicsettokens.api.shops.TokenShop;
/**
 * This event is fired when an attempt is made to
 * Purchase an item in a TokenShop. The PurchaseState defines the result of the 
 * Changing TokenShop using setShop() has no effect for this event.
 * Attempt as:
 * DELAYED: 
 * 		Player spamed purchase & previous delay did'nt finish.	
 * 		Canceling this will bypass the delay system
 * LIMITED:
 * 		Player has reached his limit of purchases for this item.
 * 		Canceling this will bypass item limit
 * UNKNOWN:
 * 		An unknown error occurred when communicating with database.
 * 		Canceling this has no effect.
 * FAILED:
 * 		Player didn't have enough tokens to purchase
 * 		Canceling this will force purchase to succeed
 * SUCESS:
 * 		Purchase was successful & TokenShopPurchaseEvent will fire
 * 		Canceling this will stop purchase from forwarding.
 * @author Backstabber
 *
 */
public class TokenShopAttemptPurchaseEvent extends TokenShopEvent {
	private ShopItem item;
	private PurchaseState state;
	public TokenShopAttemptPurchaseEvent(Player player, TokenShop shop,ShopItem item,PurchaseState state) {
		super(player, shop);
		this.item=item;
		this.state=state;
	}
	public ShopItem getPurchaseItem() {
		return item;
	}
	public PurchaseState getState() {
		return this.state;
	}
	public enum PurchaseState{
		DELAYED,
		LIMITED,
		UNKNOWN,
		FAILED,
		SUCESS;
	}
}
