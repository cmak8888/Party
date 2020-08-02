
public class Introvert extends Person {

	public Introvert(String name, String occupation) {
		super(name, occupation);
		
	}
	
	@Override
	public void askQuestion() {
		// TODO Auto-generated method stub
		System.out.println("Why won't you leave me alone?");
	}

	@Override
	public void answerQuestion() {
		// TODO Auto-generated method stub
		System.out.println("I want to be alone.");
	}

}
