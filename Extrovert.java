import java.util.ArrayList;
import java.util.Random;
public class Extrovert extends Person {

	public Extrovert(String name, String occupation) {
		super(name, occupation);
		
	}
	
	@Override
	public void askQuestion() {
		int num = rand.nextInt(2) + 1;
		// TODO Auto-generated method stub
		System.out.println(Questions.get(num));
	}

	@Override
	public void answerQuestion() {
		// TODO Auto-generated method stub
		int num = rand.nextInt(2) + 1;
		System.out.println(Responses.get(num));
	}

	private Random rand = new Random(0);
	private ArrayList<String> Responses = new ArrayList<String>() {{
		add("Let me tell you about my trip to Vegas.");
		add("Let me tell you about this book I read.");
		add("I like apples.");
	}};
	private ArrayList<String> Questions = new ArrayList<String>() {{
		add("What do you think of the movie last night?");
		add("Do you like cats?");
		add("Do you like sports?");
	}};
}
