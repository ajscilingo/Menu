package net.scilingo.menu;

public interface MenuItem {

	public Long getId();
	public Long getRefCount();
	public void setText(String text);
	public String getText();
}
