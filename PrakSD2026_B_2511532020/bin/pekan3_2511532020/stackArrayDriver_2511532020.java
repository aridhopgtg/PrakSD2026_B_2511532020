package pekan3_2511532020;

public class stackArrayDriver_2511532020 {
	public static void main(String[] args) {
		stackArray_2511532020 s = new stackArray_2511532020();
		s.push_2511532020(10);
		s.push_2511532020(20);
		s.push_2511532020(30);
		System.out.println(s.pop_2511532020() + " dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah : " + s.peek_2511532020());
		System.out.print("Elemen pada stack :");
		s.print_2511532020();
	}

}
