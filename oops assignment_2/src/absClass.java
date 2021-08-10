abstract class Abs{
	public abstract void animalLegs();
	public abstract void birdLegs();
}
class animal{
	public void animalLegs() {
		System.out.println("Animals have 4 legs");
	}
}
abstract class birdfamily extends Abs{
	public abstract void birdLegs();
}
class Birds extends Abs{
	public void birdLegs() {
		System.out.println("Birds have 2 legs");
	}

	public void animalLegs() {
		// TODO Auto-generated method stub
		
	}

	
}
public class absClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal a=new animal();
		a.animalLegs();
		Birds b=new Birds();
		b.birdLegs();
	}

}
