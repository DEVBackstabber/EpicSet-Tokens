package me.backstabber.epicsettokens.api.events;

import org.bukkit.entity.Player;

import me.backstabber.epicsettokens.api.shops.TokenShop;
import me.backstabber.epicsettokens.shops.EpicTokenShop;
/**
 * This Event is fired when another shop is opened 
 * from withing a TokenShop using OPEN_SHOP trigger
 * @author Backstabber
 *
 */


public class TokenShopSwapEvent extends TokenShopEvent {
	private TokenShop newShop;
	public TokenShopSwapEvent(Player player, TokenShop shop,TokenShop newShop) {
		super(player, shop);
		this.newShop=newShop;
	}
	public TokenShop getNewShop() {
		return newShop;
	}
	public void setNewShop(EpicTokenShop shop) {
		this.newShop=shop;
	}

}
