
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		int[] hufValues = {5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000, 20000};
		Money forint = new Money("huf", hufValues);
		System.out.println(forint.changer(100001));
	}

}
