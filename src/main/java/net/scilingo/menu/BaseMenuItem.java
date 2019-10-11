package net.scilingo.menu;

public class BaseMenuItem implements MenuItem {

	protected String text;
	private static long refCount = 1L;
	private long id;
	
	public BaseMenuItem() {
		this.id = refCount;
		this.text = "Menu Item " + refCount++;	
	}
	
	public Long getId() {
		return id;
	}
	
	public BaseMenuItem(String text) {
		this.text = text;
		this.id = refCount++;
	}
	
	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public Long getRefCount() {
		return refCount;
	}

}
