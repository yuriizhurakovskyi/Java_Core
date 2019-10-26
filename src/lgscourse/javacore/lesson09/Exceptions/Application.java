package lgscourse.javacore.lesson09.Exceptions;

public class Application {
	public static void main(String[] args) {
		try {
			System.out.println(Methods.add(-4.2, -16.654));
		} catch (IllegalArgumentException iae)  {
			iae.printStackTrace();
		}
		System.out.println(Methods.add(4.2, 16.654));
		System.out.println(Methods.add(0, 0));
		System.out.println(Methods.add(-4.2, 0));
		System.out.println(Methods.add(0, -16.654));
		
		
		
		try {
			System.out.println(Methods.sub(-4.2, -16.654));
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(Methods.sub(4.2, 16.654));
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(Methods.sub(0, 0));
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		try {
			System.out.println(Methods.sub(-4.2, 0));
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(Methods.sub(0, -16.654));
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			System.out.println(Methods.mult(-4.2, -16.654));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(Methods.mult(4.2, 16.654));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(Methods.mult(0, 0));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(Methods.mult(-4.2, 0));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(Methods.mult(0, -16.654));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(Methods.div(-4.2, -16.654));
		System.out.println(Methods.div(4.2, 16.654));
		System.out.println(Methods.div(0, 0));
		try {
			System.out.println(Methods.div(-4.2, 0));
			System.out.println(Methods.div(0, -16.654));
		}catch (ArithmeticException ae)
		{
			ae.printStackTrace();
		}
	}
}
