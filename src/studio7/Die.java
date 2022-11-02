package studio7;

public class Die {
	private int sides = 0;

//	public Die() {
//		sides = 6;
//	}
	public Die(int n) {
		sides = n;
	}
	public int getSides() {
		return sides;
	}
//	public void setSides(int n) {
//		sides = n;
//	}
	
	public int throwDie() {
		return (int)(Math.random()*sides)+1;
	}
}
