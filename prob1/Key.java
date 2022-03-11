package CS390Assignment11.prob1;

import java.util.Objects;

public class Key {

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	//Overriding the equal method
	@Override
	public boolean equals(Object obj){
		if(obj == null) return false;
		if(!(obj instanceof Key)) return false;
		Key k = (Key) obj;
		return this.firstName.equals(k.firstName) && this.lastName.equals(lastName);
	}
	//Overriding the hashcode
	@Override
	public int hashCode(){
		return Objects.hash(firstName,lastName);
	}
}
