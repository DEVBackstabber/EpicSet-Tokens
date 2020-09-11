package me.backstabber.epicsettokens.api.events;

import org.bukkit.entity.Player;

import me.backstabber.epicsettokens.api.shops.TokenShop;
/**
 * This Event is fired when a TokenShop is closed
 * @author Backstabber
 *
 */
public class TokenShopCloseEvent extends TokenShopEvent {

	public TokenShopCloseEvent(Player player, TokenShop shop) {
		super(player, shop);
	}

}
