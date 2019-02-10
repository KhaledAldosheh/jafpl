package jafpl;

public class StellenwertSysteme {

	public static void main(String[] args) {
		for(int n=0;n<=20;n++) {
			
			System.out.println("n_10 (dezimal): "+n+"; n_2 (binär): "+Integer.toBinaryString(n)+"; n_16 (hexadezimal): "+Integer.toHexString(n));
		}
	}

}
