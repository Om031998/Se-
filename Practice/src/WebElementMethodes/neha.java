package WebElementMethodes;
import java.util.Scanner;
public class neha {
	public static void main(String[] args) {
		String s="malayalam";
		String a="";
		char b[]=s.toCharArray();
		for(int i=b.length-1; i>=0;i--) {
			a+=b[i];
		}
		if(s.equals(a)) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not pallindrome");
		}
	}
    

}
