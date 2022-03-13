package CS390Assignment11.prob1;

import java.util.HashMap;
import java.util.List;
public class Admin {

	public static HashMap<Key, Student> processStudents(List<Student> students) {
		if(students.size() == 0){
			return null;
		}
		//creating HashMap to store the key and student object
		HashMap<Key,Student> list = new HashMap<>();

		//looping the student list creat Kay and add it to the hashmap
		for(Student s: students){
			list.put(new Key(s.getFirstName(),s.getLastName()),s);
		}
		return list;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
		if(maps.isEmpty()){
			return 0.0;
		}
		//looping the HashMap and calculate the GPA
		double average = 0.0, sum = 0.0;
		int count = 0;
		//looping through the list of student
		for(Student s: maps.values()){
			count++;
			sum += s.getGpa();
		}
		//returning the average
		average = sum /count;

		return average;
	}
}
