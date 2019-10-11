package net.scilingo.menu;

public class NumericMenuItem extends BaseMenuItem {

	public NumericMenuItem() {
		super();
		this.text = super.getId() + ") " + this.text;
	}
	
	public NumericMenuItem(String text) {
		super(text);
		this.text = super.getId() + ") " + text;
	}
	
	@Override
	public void setText(String text) {
		this.text = super.getId() + ") " + text;
	}
	
}
