import java.util.Arrays;

public class Money {

	private String name;
	private int[] values;
	
	public Money(String name, int[] values) {
		this.name = name;
		Arrays.sort(values);
		this.values = values;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getValues() {
		return values;
	}

	public void setValues(int[] values) {
		this.values = values;
	}
	
	public int changer(int amount) {
		int counter = 0;
		int current = 0;
		for(int i = 1; i <= values.length; i++) {
			int highest = values.length - i;
			while (current <= amount - values[highest]) {
				current += values[highest];
				counter++;
			}
			if(current == amount) {
				return counter;
			}
		}
		return counter + 1;
	}
	
	
}
