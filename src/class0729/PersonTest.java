package class0729;

public class PersonTest {

	public static void main(String[] args) {
		Person[] persons = new Person[5];
		String[] address = { "경기도 ", "성남시", "분당구", "구미동", "금곡동" };
		String[] name = { "홍길동", "김길동", "하하하", "나나나", "라라라" };
		String[] phoneNumber = { "010-2323-2323", "010-1111-1111", "021-222-2222", "545-333-333", "323-222-555" };
		int[] jumin = { 1212, 12123, 5656, 7878, 8989 };

		for (int i = 0; i < persons.length; i++) {

			persons[i] = new Person(name[i], address[i], phoneNumber[i], jumin[i]);
			
		}

	
		for (Person person : persons) {
			System.out.println("------------------------------------");
			System.out.println("name    : " + person.getName());
			System.out.println("address : " + person.getAddress());
			System.out.println("phone   : " + person.getPhoneNumber());
			System.out.println("주민           : " + person.getjumin());

		}

	}

}
