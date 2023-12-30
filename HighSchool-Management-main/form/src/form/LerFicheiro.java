package form;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import classes.Student;

public class LerFicheiro {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		
		try { 
			FileInputStream fis = new FileInputStream(filePath);
			ObjectInputStream ois = new ObjectInputStream(fis);
			students = (ArrayList<Student>) ois.readObject();
			for(Student student : students) {
				System.out.println(student.toString());
			}
			ois.close();
			}
	}

}
