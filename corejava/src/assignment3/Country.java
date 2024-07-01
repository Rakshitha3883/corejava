package assignment3;

public class Country extends Continent{
	private String lakes;
	private String monuments;
	private String peak;
	public Country() {
		super();
	}
	
	public Country(String rivers, String statues, String mountains, String lakes, String monuments, String peak) {
		super(rivers, statues, mountains);
		this.lakes = lakes;
		this.monuments = monuments;
		this.peak = peak;
	}

	public String getLakes() {
		return lakes;
	}

	public void setLakes(String lakes) {
		this.lakes = lakes;
	}

	public String getMonuments() {
		return monuments;
	}

	public void setMonuments(String monuments) {
		this.monuments = monuments;
	}

	public String getPeak() {
		return peak;
	}

	public void setPeak(String peak) {
		this.peak = peak;
	}

	@Override
	public String toString() {
		return "Country [lakes=" + lakes + ", monuments=" + monuments + ", peak=" + peak + ", getRivers()="
				+ getRivers() + ", getStatues()=" + getStatues() + ", getMountains()=" + getMountains()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

}
