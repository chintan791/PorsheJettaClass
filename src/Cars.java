public class Cars extends Vehicle{


	private String stop;
	private String start;
	private String color;
	private String acceleration;
	private String emission;
	private String race;
	
	public Cars (){}
	
	public Cars (String stopped, String starting, String paint, String speed, String test, String boost )
	{
		setStop(stopped);
		setStart(starting);
		setColor(paint);
		setAcceleration(speed);
		setEmission(test);
		setRace(boost);
	}

	public String getStop() {
		return stop;
	}

	public void setStop(String stop) {
		this.stop = stop;
	}

	public String getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(String acceleration) {
		this.acceleration = acceleration;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEmission() {
		return emission;
	}

	public void setEmission(String emission) {
		this.emission = emission;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}
	
	

}


