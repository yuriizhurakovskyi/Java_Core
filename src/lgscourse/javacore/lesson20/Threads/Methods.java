package lgscourse.javacore.lesson19.Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Methods {
	public static void serialize(File file, Serializable object) throws IOException {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
		objectOutputStream.writeObject(object);
		objectOutputStream.close();
	}
	
	public static Serializable deserealize(File file) throws IOException, ClassNotFoundException {
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
		Serializable object = (Serializable)objectInputStream.readObject();
		objectInputStream.close();
		return object;
	}
}
