package net.scilingo.menu;

import java.util.HashMap;

public class StringMenuItem extends BaseMenuItem {

	private static HashMap<Long, String> overLaidIndices = new HashMap<Long, String>();
	
	public StringMenuItem(String id, String text) {
		super(text);
		overLaidIndices.put(this.getId(), id);
		this.text = id + ") " + text;
	}
	
	@Override
	public void setText(String text) {
		this.text = overLaidIndices.get(this.getId()) + ") " + text;
	}
	
}
