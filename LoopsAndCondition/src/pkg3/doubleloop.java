package pkg3;

public class doubleloop {
	public void m3() {
		for(int i=1;i<=6;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
public static void main(String args[]) {
	doubleloop obj=new doubleloop();
	obj.m3();
	
}
}
