package me.backstabber.epicsettokens.api.shops;
import org.bukkit.entity.Player;

public interface TokenShop {
	/**
	 * Get the name of this gui
	 * @return the name 
	 */
	public String getName();
	/**
	 * Check if this gui is open to some viewer
	 * @return
	 */
	public boolean isGuiOpen();
	/**
	 * Get the viewer of this gui
	 * @return the player viewing the gui
	 */
	public Player getViewer();
	/**
	 * Check if some discount is applied on this shop
	 * @return
	 */
	public boolean isDiscount();
	/**
	 * Get the discounted price against the original price
	 * @param originalPrice
	 * @return discounted price
	 */
	public int getDiscountedPrice(int originalPrice);
	/**
	 * Get the time left until this discount in seconds
	 * @return
	 */
	public int getDiscountTime();
}
