import java.util.ArrayList;


public class PetOwner extends Person {

	public PetOwner(String name, String occupation, String type, String pName) {
		super(name, occupation);
		petType = type;
		petName = pName;
	}
	
	@Override
	public void askQuestion() {
		// TODO Auto-generated method stub
		System.out.println(Responses.get(answerNum));
		answerNum++;
		if (answerNum == 2 ) { answerNum = 0; }
	}

	@Override
	public void answerQuestion() {
		// TODO Auto-generated method stub
		System.out.println(Questions.get(questionNum));
		questionNum++;
		if (questionNum == 2 ) { questionNum = 0; }
	}
	
	private int questionNum = 0;
	private int answerNum = 0;
	private String petName;
	private String petType;
	private ArrayList<String> Questions = new ArrayList<String>() {{
		add("What is your pet's name?");
		add("What kind of pet do you have?");

	}};
	private ArrayList<String> Responses = new ArrayList<String>() {{
		add("My pet's name is " + petName + ".");
		add("My pet is a " + petType + ".");

	}};
}
