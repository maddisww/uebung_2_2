package uebung_2_2;

public class BinomischeFormel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2;
		double b = 4;
		
		double asq = a*a;
		double bsq = b*b;
		
		double Binab = asq+2*a*b+bsq;
		
		System.out.println("(a+b^2) = " + Binab);
	}

}
