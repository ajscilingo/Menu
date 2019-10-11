package net.scilingo.menu;

import java.util.HashMap;
import java.util.Map;

public class BaseMenu implements Menu {
  
	protected static final String NEWLINE = System.getProperty("line.separator");
	protected Map<Long, MenuItem> menuItems;
	protected String title;
	protected boolean showTitle = true;
	
	public BaseMenu() {
		menuItems = new HashMap<Long, MenuItem>();
		this.showTitle = false;
	}
	
	public BaseMenu(boolean showTitle) {
		menuItems = new HashMap<Long, MenuItem>();
		this.showTitle = showTitle;
	}
	
	public BaseMenu(String title) {
		menuItems = new HashMap<Long, MenuItem>();
		this.title = title;
	}
	
	public void setShowTitle(boolean showTitle) {
		this.showTitle = showTitle;
	}
	
	public String display() {
		StringBuilder sb = new StringBuilder();
		if(this.showTitle) {
			sb.append(this.title)
				.append(NEWLINE);
		}
		for(Map.Entry<Long, MenuItem> entry : menuItems.entrySet()) {
			sb.append(entry.getValue().getText())
				.append(NEWLINE);
		}
		return sb.toString();
	}

	public void addMenuItem(MenuItem item) {
		if(item != null) {
			menuItems.put(item.getId(), item);
		}
	}

	public void removeMenuItem(MenuItem item) {
		menuItems.remove(item.getId());
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

}
