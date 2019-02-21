
public class MyInteger {

	private int value;

	public MyInteger() {
		super();
		value = 1082;
	}

	public MyInteger(int value) {

		if (value >= -2147483648 && value <= 2147483647) {
			MyInteger num1 = new MyInteger(1082);
		} 
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isEven() {

		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean isOdd() {

		if (value % 2 == 1) {
			return true;
		} else {
			return false;
		}

	}
	
	public Object add(MyInteger myInt, MyInteger myInt2) {
	
		int int1;
		int int2;
		int sum;
		
		int1 = myInt.getValue(); 
		int2 = myInt2.getValue();
		sum = int1 + int2;
		
		return sum;
		
	
	}

	@Override
	public String toString() {
		return "MyInteger [value=" + value + ", getValue()=" + getValue() + ", isEven()=" + isEven() + ", isOdd()="
				+ isOdd() + "]";
	}
	
	public static void main(String[] args) {
		
		MyInteger myInt = new MyInteger();
		MyInteger myInt2 = new MyInteger();
		
		System.out.println("My int info:" + myInt.toString());
		System.out.println("int 1: " + myInt.getValue());
		System.out.println("int 2: " + myInt2.getValue());
		System.out.println("Sum: " + myInt.add(myInt, myInt2));
	}

	
	

}
