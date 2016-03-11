public class CarsApp {

	public static void main(String[] args) {
	
		Cars Jetta= new Cars();
		
		
		
		Cars Porshe= new Cars();
		
		Porshe.setStart("The red porshe is starting");
		Porshe.getStart();
		
		
		Jetta.setStart("The blue jetta is starting");
		Jetta.getStart();
		
		Porshe.setAcceleration("The red porshe is accelerating");
		Porshe.getAcceleration();
		
		Jetta.setStop("The blue jetta has stopped");
		Jetta.getStop();
		
		Jetta.setEmission("The blue jetta passes its emission tests");
		Jetta.getEmission();
		
		Porshe.setRace("The red porshe is going 50mph");
		Porshe.getRace();
		
		Porshe.setStop("The red Porshe has stopped");
		Porshe.getStop();
		
		Jetta.setColor("The blue Jetta just passes the red Porshe");
		Jetta.getColor();
		
		System.out.println(Porshe.getStart());
		
		System.out.println(Jetta.getStart());
		
		System.out.println(Porshe.getAcceleration());
		
		System.out.println(Jetta.getStop());
		
		System.out.println(Jetta.getEmission());
		
		System.out.println(Porshe.getRace());
		
		System.out.println(Porshe.getStop());
		
		System.out.println(Jetta.getColor());
		
	

	}
}