package assignment3;

public class State extends Country {
	private String pond;
	private String forest;
	public State() {
		super();
	}
	public State(String rivers, String statues, String mountains, String lakes, String monuments, String peak,
			String pond, String forest) {
		super(rivers, statues, mountains, lakes, monuments, peak);
		this.pond = pond;
		this.forest = forest;
	}
	public String getPond() {
		return pond;
	}
	public void setPond(String pond) {
		this.pond = pond;
	}
	public String getForest() {
		return forest;
	}
	public void setForest(String forest) {
		this.forest = forest;
	}
	@Override
	public String toString() {
		return "State [pond=" + pond + ", forest=" + forest + ", getLakes()=" + getLakes() + ", getMonuments()="
				+ getMonuments() + ", getPeak()=" + getPeak() + ", toString()=" + super.toString() + ", getRivers()="
				+ getRivers() + ", getStatues()=" + getStatues() + ", getMountains()=" + getMountains()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
