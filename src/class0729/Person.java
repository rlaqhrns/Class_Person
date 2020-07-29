package class0729;

public class Person {
	String name;
	String phoneNumber;
	String address;
	int jumin;
	Person(){
		
		
	}
	
	Person(String name, String address, String phoneNumber, int jumin){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.jumin = jumin;
		
	}
	
	String getName() {
		return this.name;

	}

	void setName(String name) {
		this.name = name;

	}

	String getPhoneNumber() {
		return this.phoneNumber;
	}

	void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	String getAddress() {
		return this.address;
	}
	void setAddress(String address) {
		this.address = address;
	}
	int getjumin() {
		return this.jumin;
	}
	void setjumin(int jumin) {
		this.jumin = jumin;
	}
}
