package me.backstabber.epicsettokens.api.events;

import org.bukkit.entity.Player;

import me.backstabber.epicsettokens.api.shops.TokenShop;
/**
 * This Event is fired when a TokenShop is opened
 * @author Backstabber
 *
 */

public class TokenShopOpenEvent extends TokenShopEvent {

	public TokenShopOpenEvent(Player player, TokenShop shop) {
		super(player, shop);
	}

}
