
public class RotationString {

	public static void main(String[] args) {
		String a = "JavaJ2eeGautamKumar";
		String b = "GautamKumarJavaJ2ee";
		
		if(a.length() != b.length()) {
			System.out.println("b is not rotate version of a");
		}
		else {
			String c = a+b;
			
			if(c.contains(b)) {
				System.out.println("b is a rotated version of a");
			}
			else {
				System.out.println("b is not rotated version of a");
			}
		}
			

	}

}
