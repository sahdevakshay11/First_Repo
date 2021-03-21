package pkg3;

public class factorial {
	int number=5;
	int fact=1;
	public void m1() {
		for(int i=1;i<=number;i++) {
			fact=fact*i;
			
		}
		System.out.println(fact);
	}
public static void main(String args[]) {
	factorial obj=new factorial();
	obj.m1();
}

}
