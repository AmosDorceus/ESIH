package Factorial.Number;

public class Factorielle {
	public void numFacto(int number) {
		int facto=1;
		
		if(number==0) {
			System.out.println("! " +number +"= " + facto );
		}else if(number>=1) {
			int i=1;
			while(i<=number) {
				facto*=i;
				i++;
			}
		}
		System.out.print("! " + number + " =" + facto);
	}
}
