package net.scilingo.menu;

public interface Menu {

	public String display();
	public void setTitle(String title);
	public String getTitle();
	public void setShowTitle(boolean showTitle);
	public void addMenuItem(MenuItem item);
	public void removeMenuItem(MenuItem item);
	
}
