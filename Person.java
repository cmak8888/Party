
public abstract class Person {
	
	Person(String name, String occupation) {
		this.myName = name;
		this.occupation = occupation;
	}
	
	abstract public void askQuestion();
	abstract public void answerQuestion();
	
	public void askName() {
		System.out.println("What is your name? ");
		return;
	}
	
	public void giveName() {
		System.out.println(myName);
	}
	
	public String whatDoYouDo() {
		return occupation;
	}
	
	private String myName;
	private String occupation;
	
}
