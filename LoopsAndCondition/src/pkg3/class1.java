package pkg3;

public class class1 {
	int a=10,b=20,c;
	public void swap() {
		System.out.println("Before");
		System.out.println("a="+a);
		System.out.println("b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("  ");
		System.out.println("After");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
public static void main(String args[]) {
	class1 obj=new class1();
	obj.swap();
	

}
}
