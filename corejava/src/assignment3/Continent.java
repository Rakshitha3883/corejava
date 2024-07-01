package assignment3;

public class Continent {
	private String rivers;
	private String statues;
	private String mountains;
	public Continent() {
		super();
	}
	public Continent(String rivers, String statues, String mountains) {
		super();
		this.rivers = rivers;
		this.statues = statues;
		this.mountains = mountains;
	}
	public String getRivers() {
		return rivers;
	}
	public void setRivers(String rivers) {
		this.rivers = rivers;
	}
	public String getStatues() {
		return statues;
	}
	public void setStatues(String statues) {
		this.statues = statues;
	}
	public String getMountains() {
		return mountains;
	}
	public void setMountains(String mountains) {
		this.mountains = mountains;
	}
	@Override
	public String toString() {
		return "Continent [rivers=" + rivers + ", statues=" + statues + ", mountains=" + mountains + "]";
	}
}
