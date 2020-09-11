package me.backstabber.epicsettokens.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

import me.backstabber.epicsettokens.api.shops.TokenShop;


public class TokenShopEvent extends PlayerEvent implements Cancellable 
{
	private static final HandlerList handlers = new HandlerList();
	private boolean cancel = false;
	private TokenShop shop;

	public TokenShopEvent(Player player,TokenShop shop)  {
		super(player);
		this.shop=shop;
	}
	public TokenShop getShop() {
		return this.shop;
	}
	public void setShop(TokenShop shop) {
		this.shop=shop;
	}
	@Override
	public boolean isCancelled() {
		return cancel;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.cancel=cancel;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static final HandlerList getHandlerList() { 
		return handlers; 
	}
}
