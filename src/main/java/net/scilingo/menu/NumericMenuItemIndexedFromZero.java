package net.scilingo.menu;

import java.util.HashMap;

public class NumericMenuItemIndexedFromZero extends NumericMenuItem {

	private static HashMap<Long, Long> overLaidIndices = new HashMap<Long, Long>();
	private static Long overLaidIdCounter;
	
	public NumericMenuItemIndexedFromZero() {
		super();
		overLaidIdCounter = super.getId() - 1L;
		overLaidIndices.put(super.getId(), overLaidIdCounter);
		
	}
	
	public NumericMenuItemIndexedFromZero(String text) {
		super(text);
		overLaidIdCounter = super.getId() - 1L;
		overLaidIndices.put(super.getId(), overLaidIdCounter);
		this.text = overLaidIdCounter + ") " + text;
	}
	
	@Override
	public Long getId() {
		return overLaidIndices.get(super.getId());
	}
	
	@Override
	public void setText(String text) {
		this.text = this.getId() + ") " + text;
	}
	
}
