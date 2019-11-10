package lgscourse.javacore.lesson16.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Application {

	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] args) {
		Class<Airplane> airplane = Airplane.class;
		System.out.println("Name of class = " + airplane.getName() + "\n");
		System.out.println("Simple name = " + airplane.getSimpleName() + "\n");
		System.out.println("Modifier = " + Modifier.toString(airplane.getModifiers()) + " int = " + airplane.getModifiers() + "\n");
		System.out.println("Is static = " + Modifier.isStatic(airplane.getModifiers()) + ", is public = " + Modifier.isPublic(airplane.getModifiers()) 
						+ ", is abstract = " + Modifier.isAbstract(airplane.getModifiers()) + "\n");
		System.out.println("Package of the class = " + airplane.getPackage() + "\n");
		System.out.println("Super class = " +  airplane.getSuperclass() + "\n");
		System.out.println("Class Interfaces = " + Arrays.toString(airplane.getInterfaces()) + "\n");
		System.out.println("Class Constructors - " + airplane.getConstructors().length + ": ");
		for (Constructor<Airplane> constructor : (Constructor<Airplane>[])airplane.getConstructors()) {
			System.out.println("\nConstructor = " + constructor);
			if(constructor.getParameterTypes().length!=0) System.out.println("\nTypes of parameters : ");
			for (Class<?> classPT : constructor.getParameterTypes()) {
				System.out.println(classPT);
			}
		}
	
		try {
			System.out.println("\n" + airplane.getConstructor());
		} catch (NoSuchMethodException | SecurityException e3) {
			e3.printStackTrace();
		}
		
		try {
			System.out.println(airplane.getConstructor(String.class, int.class, int.class, int.class));
		} catch (NoSuchMethodException | SecurityException e2) {
			e2.printStackTrace();
		}
	
		try {
			System.out.println(airplane.getConstructor(int.class, int.class, int.class));
		} catch (NoSuchMethodException | SecurityException e1) {
			e1.printStackTrace();
		}
		
		try {
			System.out.println(airplane.getConstructor(int.class, int.class));
		} catch (NoSuchMethodException | SecurityException e1) {
			e1.printStackTrace();
		}
		
		try {
			Airplane newPlaneInstance;
			newPlaneInstance = airplane.getConstructor().newInstance();
			System.out.println("\nNew plane instance : " + newPlaneInstance);
			
			System.out.println("\nFields : ");
			for (Field field : airplane.getDeclaredFields()) {
				System.out.println(field);
			}
			
			Field maxSpeedField = airplane.getDeclaredField("maxSpeed");
			maxSpeedField.setAccessible(true);
			maxSpeedField.set(newPlaneInstance, 1038);
			
			Field nameField = airplane.getDeclaredField("name");
			nameField.setAccessible(true);
			nameField.set(newPlaneInstance, "Boeing 787 Dreamliner");
			
			Field lengthField = airplane.getDeclaredField("length");
			lengthField.setAccessible(true);
			lengthField.set(newPlaneInstance, 62);
			
			Field emptyWeightField = airplane.getDeclaredField("emptyWeight");
			emptyWeightField.setAccessible(true);
			emptyWeightField.set(newPlaneInstance, 135);
			
			System.out.println("\nNew plane instance 2 : " + newPlaneInstance);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException | NoSuchFieldException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n Methods : ");
		for (Method method : airplane.getMethods()) {
			System.out.println(method);
		}
		System.out.println();
		
		System.out.println("Class Application methods : ");
		Class<Application> classAPP = Application.class;
		Method[] methods = classAPP.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i]);
		}
		System.out.println();
			
		System.out.println();
		
			try {
				Application app = Application.class.newInstance();
				Method method1 = classAPP.getMethod("myMethod", java.lang.String[].class);
				Method method2 = classAPP.getMethod("myMethod", java.lang.String.class, int[].class);
				System.out.println(method1);
				System.out.println(method2);
			} catch (InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
		
		
	}
	
	public void myMethod(String a, int ... args) {
		System.out.println("myMethod(String a, int ... args)  String a = " + a + "int... args + " + Arrays.toString(args));
	}
	
	public void myMethod(String... args) {
		System.out.println("myMethod(String... args) String... args = " + Arrays.toString(args));	
	}
}
