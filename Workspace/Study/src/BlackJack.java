//return value closest to 21 without going over
public class BlackJack {

	public static int blackJack(int a, int b){
		int jack = 0;
		
		if (a > b && a <= 21)
			jack = a;
		if ( b > a && b <= 21)
		jack = b;
		
		if (a > 21 && b <= 21)
			jack = b;
		
		if (a <= 21 && b > 21)
		    jack = a;
		
		return jack;
	}
	
	public static void main(String[] args) {
		System.out.println(blackJack(19, 21));
		System.out.println(blackJack(21, 19));
		System.out.println(blackJack(19, 23));
		System.out.println(blackJack(22, 19));
	}

}
