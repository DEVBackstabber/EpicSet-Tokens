package me.backstabber.epicsettokens.api.shops;

import java.util.ArrayList;
import java.util.List;

import me.backstabber.epicsettokens.utils.materials.EpicMaterials;
import me.backstabber.epicsettokens.utils.materials.UMaterials;

public enum ShopPaths {

	GUI_NAME("name", "Token Shop"), 
	GUI_DISPLAY_NAME("display-name", "main"), 
	GUI_SIZE("size", 3),
	BACKGROUND_ITEM("background", EpicMaterials.valueOf(UMaterials.BLACK_STAINED_GLASS_PANE).getItemStack()),
	DISCOUNT_TIME("discount.time",0),
	DISCOUNT_PERCENTAGE("discount.percentage",0),
	DISCOUNT_STAMP("discount.start",System.currentTimeMillis()/1000D),
	ITEMS("items");
	private String path;
	private Object defaultData;

	ShopPaths(String path) {
		this.path = path;
		this.defaultData = null;
	}

	ShopPaths(String path, Object defaultData) {
		this.path = path;
		this.defaultData = defaultData;
	}

	ShopPaths(String path, String... array) {
		this.path = path;
		List<String> data = new ArrayList<String>();
		for (String s : array)
			data.add(s);
		this.defaultData = data;
	}

	public String getPath() {
		return this.path;
	}

	public Object getDefault() {
		return this.defaultData;
	}
}
