package pkg3;

public class tablePrint {
	public void m1() {
		int mul;
		for(int i=1;i<=10;i++) {
			mul=5*i;
			System.out.println("5 x "+i+"= "+mul);
		}
		
	}
public static void main(String args[]) {
	tablePrint obj=new tablePrint();
	obj.m1();
}
}
