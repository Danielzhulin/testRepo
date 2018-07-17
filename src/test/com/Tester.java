package test.com;

public class Tester implements MyInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface mi = new Tester();
		mi.method1();
		mi.method2();
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("In The Tester Class£º override method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("In The Tester Class£º override method2");
	}

}
