package modelling;

import modelling.interfaces.ITitle;

public class Title implements ITitle {

	private String title;
	private int degree;
	
	/**
	 * Constructs a title object from a string object
	 * @param line - title containing the #-symbols.
	 */
	public Title(String line) {
		degree = line.length() - line.replace("#", "").length();
		title = line.replace("#", "");
	}
	
	/*public Title(String title, int degree) {
		this.title = title;
		this.degree = degree;
	}*/
	
	@Override
	public String getTitle() {
		return title;	
	}

	@Override
	public int getDegree() {
		return degree;
	}

	@Override
	public String toString() {
		return title;
	}
	
	public boolean equals(Object otherTitle) {
		return (title == ((Title)otherTitle).getTitle() 
				&& degree == ((Title)otherTitle).getDegree());
	}
}
