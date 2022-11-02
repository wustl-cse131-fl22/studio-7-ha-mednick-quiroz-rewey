package studio7;

public class Fraction {
	private int num;
	private int denom;
	
	public Fraction(int n, int d) {
		num = n;
		denom = d;
	}
	
	public Fraction add(int n2, int d2) {
		int newdenom = d2*denom;
		int newnum = n2*denom + num*d2;
		
		return new Fraction(newnum,newdenom);
	}
	
	public Fraction multiply(int n2, int d2) {
		int newnum = n2*num;
		int newdenom = d2*denom;
		
		return new Fraction(newnum, newdenom);
	}
	
	public Fraction reciprocal() {
		return new Fraction(denom,num);
	}
	
	public Fraction simplify() {
		for (int i=1; i<= denom && i<= num; i++) {
			//nested for loop 
		}
		
		return new Fraction(9,9);
	}

}