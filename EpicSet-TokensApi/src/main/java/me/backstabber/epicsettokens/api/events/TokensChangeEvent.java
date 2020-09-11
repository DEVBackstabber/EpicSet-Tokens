package me.backstabber.epicsettokens.api.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.backstabber.epicsettokens.api.data.TokenData;

/**
 * This event is fired whenever a change in tokens is detected 
 * ChangeType signifies what caused the change
 * The int from getChange() is the difference in old tokens & new tokens value
 * For example if tokens changed from 10 to 15 getChange() will return 5
 * Similarly if tokens changed from 15 to 10 getChange() will return -5
 * Cancelling this event will stop the change from happening
 * 
 * For ChangeType = DATABASE cancelling event or changing "change" has no effect
 * @author Backstabber
 *
 */
public class TokensChangeEvent extends Event implements Cancellable 
{
	private static final HandlerList handlers = new HandlerList();
	private boolean cancel = false;
	private TokenData data;
	private int change;
	private ChangeType type;
	public TokensChangeEvent(TokenData data,int change,ChangeType type)  {
		super(true);
		this.data=data;
		this.change=change;
		this.type=type;
	}
	public TokenData getTokenData() {
		return this.data;
	}
	public int getChange() {
		return this.change;
	}
	public void setChange(int change) {
		this.change=change;
	}
	public ChangeType getType() {
		return this.type;
	}
	public boolean isCancelled() {
		return cancel;
	}

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
	public enum ChangeType {
		COMMAND, //change occoured via /token command
		PURCHASE, //change occoured via a shop purchase
		API, //change occoured via the api usage
		DATABASE; //change occoured due to a change in database externally
	}
}
