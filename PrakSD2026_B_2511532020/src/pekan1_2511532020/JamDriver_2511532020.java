package pekan1_2511532020;

public class JamDriver_2511532020 {

	public static void main(String[] args) {
		Jam_2511532020 a = new Jam_2511532020(23, 59, 50);
		Jam_2511532020 b = new Jam_2511532020(0, 0, 15);
		System.out.println("a              = " + a);
		System.out.println("b              = " + b);
		System.out.println("a+b            = " + a.plus(b));
		System.out.println("next 20s       = " + a.nextNseconds(20));
		System.out.println("durasi(a,b)    = " + Jam_2511532020.durasiDetik(a, b));
		System.out.println("a.compareTo(b) = " + a.compareTo(b));
        
	}

}
