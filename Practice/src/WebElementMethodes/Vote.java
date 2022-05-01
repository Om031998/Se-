package WebElementMethodes;

public class Vote extends A {

	
	public Vote(String msg) {
		super(msg);
		
	}

	public static void main(String[] args) {
		int age=10;
		if(age<18) {
		throw new A("can't vote");
		}else {
			System.out.println("can vote");
		}

	}

}
