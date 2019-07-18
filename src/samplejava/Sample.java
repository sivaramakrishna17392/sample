package samplejava;

public class Sample {

	public static void main(String[] args) {
		Inner.add(5,6);
	}
}

class Inner {

	public static int add(int a, int b) {
		
return a+b;
	}
}
