package multiinterface;

public class MyCircle implements circle, CircleTwo {
	


	@Override
	public void CalculateArea() {
		System.out.println(CircleTwo.pi);		
	}

	@Override
	public void CalculateArea(int radius) {
		//System.out.println(int radius);		
	}

}
