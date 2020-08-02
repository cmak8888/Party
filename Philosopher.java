import java.util.ArrayList;

public class Philosopher extends Person {

	public Philosopher(String name, String occupation) {
		super(name, occupation);	
	}
	
	@Override
	public void askQuestion() {
		// TODO Auto-generated method stub
		System.out.println(Responses.get(answerNum));
		if (answerNum == 2 ) { answerNum = 0; }
	}

	@Override
	public void answerQuestion() {
		// TODO Auto-generated method stub
		System.out.println(Questions.get(questionNum));
		if (questionNum == 2 ) { questionNum = 0; }
	}
	
	private int questionNum = 0;
	private int answerNum = 0;
	private ArrayList<String> Questions = new ArrayList<String>() {{
		add("What is life?");
		add("What do you think about the world, today?");

	}};
	private ArrayList<String> Responses = new ArrayList<String>() {{
		add("Life is all around, big and small.");
		add("Quality is not an act, but a habit.");

	}};


}
