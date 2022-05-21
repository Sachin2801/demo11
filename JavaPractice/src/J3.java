
public class J3 extends J2 {
public static void main(String[] args) {
		
		J3 obj =new J3();
		
		String a=obj.getName();
		
		System.out.println("old name is "+a);
		
		obj.setName("POM");
		
		System.out.println("new Name is "+obj.getName());
	}

}
